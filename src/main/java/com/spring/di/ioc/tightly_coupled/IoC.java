package com.spring.di.ioc.tightly_coupled;

/*
 * Dependency Inversion
 * Rely on abstraction rather than concrete implementation
 */
public class IoC {

    private static int kilometer = 10;

    public void test() {
        System.out.println("kilometer " + kilometer);
    }

    public static void main(String[] args) {
        Driver driver = new Driver(new Car());
        driver.drive(kilometer);
    }
}
