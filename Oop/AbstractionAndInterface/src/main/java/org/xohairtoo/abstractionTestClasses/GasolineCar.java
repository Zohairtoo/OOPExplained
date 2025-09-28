package org.xohairtoo.abstractionTestClasses;

public class GasolineCar extends CarWithAllAbstractMethod {
    @Override
    public void car() {
        System.out.println("This is a Gasoline Car");
    }

    @Override
    public void carType() {
        System.out.println("It can run on Petrol");
    }

}
