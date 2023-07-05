package com.spring.di.ioc.loose_coupled;

/*
 * Concrete implementation clas
 */
public class Driver {
    private Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void drives(int kilometers) {
        vehicle.run(kilometers);
    }
}
