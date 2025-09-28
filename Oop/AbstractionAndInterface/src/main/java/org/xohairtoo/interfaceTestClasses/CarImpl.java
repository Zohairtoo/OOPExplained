package org.xohairtoo.interfaceTestClasses;

public class CarImpl implements ICar{

    @Override
    public void car() {
        System.out.println("This is a car from the interface implementation");
    }

    @Override
    public void carType() {
        System.out.println("This car type is Gasoline");
    }

    @Override
    public void carTries() {
        System.out.println("This car has 4 tires");
    }

}
