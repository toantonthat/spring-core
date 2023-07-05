package com.spring.di.ioc.loose_coupled;

public class Taxi implements Vehicle{
    @Override
    public void run(int kilometers) {
        System.out.println("Taxi runs " + kilometers + " kilometers");
    }
}
