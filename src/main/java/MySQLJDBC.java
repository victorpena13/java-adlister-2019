import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLJDBC {

    public static Connection connect() throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUser(),
                Config.getPassword()
        );
        return connection;
    }

    public static void main(String[] args) {
        try {
            Connection connection = connect();
            System.out.println("connection successful");
            Statement statement = connection.createStatement();
//            String queryString = "INSERT INTO quotes SET author_first_name = 'Mister' WHERE id = '5';
//            if(statement.executeUpdate(queryString))
//                System.out.println("Statement executed successfully");
//            else
//                System.out.println("Statement exploded");
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
            String queryString = "SELECT * FROM quotes";
            ResultSet results = statement.executeQuery(queryString);
            if (results != null) {
                while (results.next()) {
                    System.out.println("id: " + results.getLong("id"));
                    System.out.println("\"" + results.getString("content"));
                    System.out.println(results.getString("author_last_name"));
                }
                System.out.println("no more results");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
