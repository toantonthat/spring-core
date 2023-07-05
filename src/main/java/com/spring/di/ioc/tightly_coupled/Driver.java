package com.spring.di.ioc.tightly_coupled;

/*
 * This is concrete implementation class
 */
public class Driver {
    private Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void drive(int kilometer) {
        car.run(kilometer);
    }
}
