package com.burda.hw10;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        PassengerCar passengerCar = new PassengerCar(Series.AH, "1991", Colour.BLACK, 50.0d);
        Truck truck = new Truck(Series.AM, "2020", Colour.WHITE, 50.0d);
        truck.addCargo();
        truck.dischargeCargo();
        System.out.println(truck.getTraffic());
        truck.refuel();
        System.out.println(truck);

        passengerCar.addPassenger(passenger);

        Recovery car = new PassengerCar(Series.AH, "1991", Colour.BLACK, 50.0d) {
            @Override
            public void refuel() {
                System.out.println("refuel");
            }
        };
        car.refuel();
    }
}
