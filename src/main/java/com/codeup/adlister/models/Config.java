package com.codeup.adlister.models;

public class Config {
    private static String url = "";
    private static String user = "root";
    private static String password = "codeup";

    public static String getUrl() {
        return url;
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }
}
