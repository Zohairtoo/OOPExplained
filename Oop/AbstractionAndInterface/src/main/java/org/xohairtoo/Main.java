package org.xohairtoo;

import org.xohairtoo.abstractionTestClasses.CarWithAllAbstractMethod;
import org.xohairtoo.abstractionTestClasses.CarWithSomeAbstractMethods;
import org.xohairtoo.abstractionTestClasses.GasolineCar;
import org.xohairtoo.interfaceTestClasses.CarImpl;
import org.xohairtoo.interfaceTestClasses.ICar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.println("Playing with the Abstraction classes");
        CarWithAllAbstractMethod carWithAllAbstractMethod = new GasolineCar();
        carWithAllAbstractMethod.car();
        carWithAllAbstractMethod.carType();
        System.out.println("--");

        CarWithSomeAbstractMethods carWithSomeAbstractMethods = new GasolineCar();
        carWithSomeAbstractMethods.car();
        carWithSomeAbstractMethods.carTires();
        System.out.println("--");

        GasolineCar gasolineCar = new GasolineCar();
        gasolineCar.car();
        gasolineCar.carType();
        gasolineCar.carTires();


        System.out.println("Playing with the Abstraction classes");
        System.out.println("--");
        ICar car = new CarImpl();
        car.car();
        System.out.println("--");
        car.carType();
        System.out.println("--");
        car.carTries();
    }
}
