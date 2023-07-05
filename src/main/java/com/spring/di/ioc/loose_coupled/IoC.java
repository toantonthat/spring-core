package com.spring.di.ioc.loose_coupled;

import com.spring.di.ioc.loose_coupled.Driver;

public class IoC {
    public static void main(String[] args) {
        Driver driver = new Driver(new Car());
        Vehicle vehicle = new Car();
        driver.drives(10);
    }
}
