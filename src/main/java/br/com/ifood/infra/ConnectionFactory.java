package br.com.ifood.infra;

import java.sql.*;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException {

        String url = "jdbc:postgresql://localhost/iFood";
        String user = "postgres";
        String password = "0152";

        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }


    }

}
