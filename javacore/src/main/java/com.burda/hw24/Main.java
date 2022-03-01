package com.burda.hw24;

import com.burda.hw24.entity.Device;
import com.burda.hw24.entity.Factory;
import com.burda.hw24.repository.RepositoryGet;
import com.burda.hw24.repository.RepositoryUpdate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Factory factory1 = RepositoryUpdate.addFactory("Robots", "Japan");
        Factory factory2 = RepositoryUpdate.addFactory("Telephone", "China");
        Factory factory3 = RepositoryUpdate.addFactory("Television", "USA");
        Factory factory4 = RepositoryUpdate.addFactory("Automobile", "India");
        Device device1 = RepositoryUpdate.addDevice("Robot1", "Cat1", 800.0d, LocalDate.now(), "Random1", true, factory1);
        Device device2 = RepositoryUpdate.addDevice("Robot2", "Cat2", 900.0d, LocalDate.now(), "Random2", true, factory1);
        Device device3 = RepositoryUpdate.addDevice("Robot3", "Cat3", 1200.0d, LocalDate.now(), "Random3", true, factory1);
        Device device4 = RepositoryUpdate.addDevice("Telephone1", "redmi1", 300.0d, LocalDate.now(), "telephone1", true, factory2);
        Device device5 = RepositoryUpdate.addDevice("Telephone2", "redmi2", 500.0d, LocalDate.now(), "telephone2", true, factory2);
        Device device6 = RepositoryUpdate.addDevice("Telephone3", "redmi3", 800.0d, LocalDate.now(), "telephone3", true, factory2);
        Device device7 = RepositoryUpdate.addDevice("Television1", "X821", 1800.0d, LocalDate.now(), "Television1", true, factory3);
        Device device8 = RepositoryUpdate.addDevice("Television2", "X822", 1900.0d, LocalDate.now(), "Television2", true, factory3);
        Device device9 = RepositoryUpdate.addDevice("Automobile1", "VIA1", 2900.0d, LocalDate.now(), "Automobile1", true, factory4);
        Device device10 = RepositoryUpdate.addDevice("Automobile2", "VIA2", 3900.0d, LocalDate.now(), "Automobile2", true, factory4);
        RepositoryGet.getDevice(3);
        RepositoryGet.getFactory(4);
        RepositoryGet.getDivByFactoryId(2);
        Device deviceS = new Device(1, "Smart", "SM1", 11900.0d, LocalDate.now(), "SmartUpdate", true, factory1);
        RepositoryUpdate.updateDevice(deviceS);
        RepositoryUpdate.delDevice(device4);
        RepositoryGet.getSum();
    }
}
