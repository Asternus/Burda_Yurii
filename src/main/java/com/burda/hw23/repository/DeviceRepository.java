package com.burda.hw23.repository;

import com.burda.hw23.entity.Device;

import java.sql.*;

public class DeviceRepository extends AbstractRepository {
    public static void addLinesDevice() {
        try {
            String sql = "INSERT INTO device (type, name, price, date, description, availability, factory_id) VALUES " +
                    "('Smartphone', 'X-100', 200.0, '2022-01-01', 'top smartphone', true, 1), " +
                    "('Mobile', '3310', 100.0, '2018-02-11', 'Nokia', true, 1), " +
                    "('Phone', 'cell', 50.0, '2000-02-11', 'Siemens', true, 1), " +
                    "('SmartTV', 'I800', 1500.0, '2021-08-08', 'Panasonic', true, 2), " +
                    "('TVBox', 'E100', 600.0, '2021-02-02', 'Sony', true, 2), " +
                    "('TV', 'B777', 550.0, '2018-02-03', 'Samsung', true, 2), " +
                    "('NetBook', 'VEST22', 4000.0, '2021-05-04', 'Dell', true, 3), " +
                    "('ProBook', 'IST51', 12000.0, '2020-04-11', 'Asus', true, 3), " +
                    "('CleanRobot', 'T1000', 9500.0, '2021-11-11', 'ITRobots', true, 4), " +
                    "('WorkRobot', 'Terminator', 12000.0, '2021-08-08', 'ITRobots', true, 4)";
            try (Connection conn = createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.execute();
                int rows = preparedStatement.executeUpdate();
                System.out.println("add Lines Device: " + rows);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }

    public static void getDeviceById(Device device, int id) {
        try {
            String sql = "SELECT * FROM device WHERE device_id = ?";
            try (Connection conn = createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setInt(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                resultSet.next();
                device.setDeviceId(resultSet.getInt("device_id"));
                device.setType(resultSet.getString("type"));
                device.setName(resultSet.getString("name"));
                device.setPrice(resultSet.getDouble("price"));
                device.setDate(resultSet.getDate("date"));
                device.setDescription(resultSet.getString("description"));
                device.setAvailability(resultSet.getBoolean("availability"));
                device.setFactoryId(resultSet.getInt("factory_id"));
                System.out.println(device);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }

    public static void updateDevice(int id) {
        try {
            String sql = "UPDATE device SET type=?, name =?, price = ?, date = ?, description = ?, availability = ? WHERE device_id = ?";
            try (Connection conn = createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, "Smart");
                preparedStatement.setString(2, "SmartName");
                preparedStatement.setDouble(3, 1800);
                preparedStatement.setDate(4, Date.valueOf("2021-05-04"));
                preparedStatement.setString(5, "SmartUpdate");
                preparedStatement.setBoolean(6, false);
                preparedStatement.setInt(7, id);
                preparedStatement.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }

    public static void delDevice(int id) {
        try {
            String sql = "DELETE FROM device WHERE device_id = ?";
            try (Connection conn = createCon();
                 PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setInt(1, id);
                int row = preparedStatement.executeUpdate();
                System.out.println("delete device by id " + id + " = " + row);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }

    public static void getSum() {
        try {
            String sql = "SELECT factory_id, SUM(price), COUNT(factory_id) FROM device GROUP BY factory_id ORDER BY factory_id";
            try (Connection conn = createCon();
                 Statement statement = conn.createStatement()) {
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    System.out.println("ID: " + rs.getString(1));
                    System.out.println("Sum device: " + rs.getString(2));
                    System.out.println("Count: " + rs.getString(3) + "\n");
                }
            }
        } catch (Exception ex) {
            System.out.println("Connection failed..." + ex);
        }
    }

}