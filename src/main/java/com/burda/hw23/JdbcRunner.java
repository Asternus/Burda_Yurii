package com.burda.hw23;

import com.burda.hw23.entity.Device;
import com.burda.hw23.entity.Factory;
import com.burda.hw23.repository.DeviceRepository;
import com.burda.hw23.repository.FactoryRepository;

import java.sql.Date;

public class JdbcRunner {
    public static void main(String[] args) {
        FactoryRepository.addLinesFactory();
        DeviceRepository.addLinesDevice();
        Device device = new Device();
        Device device1 = new Device(1, "Smart", "SmartName", 2000.0d, Date.valueOf("2021-05-04"), "SmartUpdate", false, 1);
        Factory factory = new Factory();
        DeviceRepository.getDeviceById(device, 1);
        FactoryRepository.getFactoryByID(factory, device.getFactoryId());
        DeviceRepository.updateDevice(device.getDeviceId(), device1);
        DeviceRepository.getDeviceById(device, device.getDeviceId());
        DeviceRepository.delDevice(5);
        FactoryRepository.getDeviceByFactory(1);
        DeviceRepository.getSum();
    }
}