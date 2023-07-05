package com.spring.di.ioc.loose_coupled;

public class Car implements Vehicle{
    @Override
    public void run(int kilometers) {
        System.out.println("The car runs " + kilometers + " kilometers");
    }
}
