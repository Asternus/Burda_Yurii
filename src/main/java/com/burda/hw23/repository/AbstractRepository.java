package com.burda.hw23.repository;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public abstract class AbstractRepository {
    @SneakyThrows
    public static Connection createCon() {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "root";
        Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }

    public static void restartBd() {
        try {
            String clear = "TRUNCATE TABLE factory CASCADE";
            String alter = "ALTER SEQUENCE factory_factory_id_seq RESTART WITH 1";
            String clear1 = "TRUNCATE TABLE device CASCADE";
            String alter1 = "ALTER SEQUENCE device_device_id_seq RESTART WITH 1";
            try (Connection conn = createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(clear);
                 PreparedStatement preparedStatement1 = conn.prepareStatement(alter);
                 PreparedStatement preparedStatement2 = conn.prepareStatement(clear1);
                 PreparedStatement preparedStatement3 = conn.prepareStatement(alter1)) {
                int row = preparedStatement.executeUpdate();
                preparedStatement1.execute();
                preparedStatement2.execute();
                int row1 = preparedStatement3.executeUpdate();
                System.out.println("restartBd del rows: " + row + row1);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }
}