package com.burda.modul3;

import com.burda.modul3.util.Service;
import com.burda.modul3.util.UserInputService;
import org.flywaydb.core.Flyway;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "root";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Flyway flyway = Flyway.configure().dataSource(url, username, password).load();

        flyway.clean();
        flyway.migrate();

        Service service = new Service();
        UserInputService userInputService = new UserInputService();
        userInputService.doService(service);
    }
}