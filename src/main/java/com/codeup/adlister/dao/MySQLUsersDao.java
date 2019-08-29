package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users {
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

//    @Override
//    public List<User> all() {
//        PreparedStatement stmt = null;
//        try {
//            stmt = connection.prepareStatement("SELECT * FROM users");
//            ResultSet rs = stmt.executeQuery();
//            return createUsersFromResults(rs);
//        } catch (SQLException e) {
//            throw new RuntimeException("Error retrieving all ads.", e);
//        }
//    }
//
//    @Override
//    public Long insert(User user) {
//        try {
//            PreparedStatement stmt = connection.prepareStatement("INSERT INTO users(id, username, email, password) VALUES (?, ?, ?)",
//                    Statement.RETURN_GENERATED_KEYS);
//            stmt.executeUpdate(createInsertQuery(user), Statement.RETURN_GENERATED_KEYS);
//            stmt.setLong(1, user.getId());
//            stmt.setString(2, user.getUsername());
//            stmt.setString(3, user.getEmail());
//            stmt.executeUpdate();
//            ResultSet rs = stmt.getGeneratedKeys();
//            rs.next();
//            return rs.getLong(1);
//        } catch (SQLException e) {
//            throw new RuntimeException("Error creating a new ad.", e);
//        }
//    }

//    private String createInsertQuery(Ad ad) {
//        return "INSERT INTO ads(user_id, title, description) VALUES "
//                + "(" + ad.getUserId() + ", "
//                + "'" + ad.getTitle() +"', "
//                + "'" + ad.getDescription() + "')";
//    }

    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }

    private List<User> createAdsFromResults(ResultSet rs) throws SQLException {
        List<User> users = new ArrayList<>();
        while (rs.next()) {
            users.add(extractUser(rs));
        }
        return users;
    }


    @Override
    public User findByUsername(String username) {
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users where username = ?");
            statement.setString(1,username);
            ResultSet rs = statement.executeQuery();
            rs.next();
            return extractUser(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Long insert(User user) {
        try {
            PreparedStatement stmt = connection.prepareStatement("insert into users(username, email, password) values(?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}