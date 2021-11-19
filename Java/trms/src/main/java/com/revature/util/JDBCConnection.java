package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {


    private static Connection conn = null;

    public static Connection getConnection() {

        if(conn == null) {
            //establish a new connection

            String endpoint = "";
            String url = "jdbc:postgresql://" + endpoint + "/postgres";
            String username = "";
            String password = "";

            try {
                conn = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
