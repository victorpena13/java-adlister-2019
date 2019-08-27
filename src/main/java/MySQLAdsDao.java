import java.sql.*;

import com.mysql.cj.jdbc.Driver;

import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;



    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        String selectQuery = "SELECT * FROM ads";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(selectQuery);
        return createArray(rs);
    }

    public List<Ad> createArray(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while(rs.next()) {
            ads.add(getDetails(rs));
        }
        return ads;
    }

    public Ad getDetails(ResultSet rs) throws SQLException {
        return new Ad(rs.getLong("id"),
                rs.getString("title"),
                rs.getString("description"));
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String adding = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')",
                ad.getUserId(), ad.getTitle(), ad.getDescription());
        Statement statement = connection.createStatement();
        long queue = statement.executeUpdate(adding);
        return queue;
    }


}


