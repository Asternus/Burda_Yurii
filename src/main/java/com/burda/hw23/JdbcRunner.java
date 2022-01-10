package com.burda.hw23;

import com.burda.hw23.entity.Device;
import com.burda.hw23.entity.Factory;
import com.burda.hw23.repository.DeviceRepository;
import com.burda.hw23.repository.FactoryRepository;

public class JdbcRunner {
    public static void main(String[] args) {
        FactoryRepository.addLinesFactory();
        DeviceRepository.addLinesDevice();
        Device device = new Device();
        Factory factory = new Factory();
        DeviceRepository.getDeviceById(device, 1);
        FactoryRepository.getFactoryByID(factory, device.getFactoryId());
        DeviceRepository.updateDevice(device.getDeviceId());
        DeviceRepository.getDeviceById(device, device.getDeviceId());
        DeviceRepository.delDevice(5);
        FactoryRepository.getDeviceByFactory(1);
        DeviceRepository.getSum();
    }
}