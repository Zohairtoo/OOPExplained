package org.xohairtoo;

import org.xohairtoo.testClasses.Computer;
import org.xohairtoo.testClasses.Desktop;
import org.xohairtoo.testClasses.Laptop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Computer computer = new Computer();
        computer.Type();

        //Polymorphism: Dynamic method Dispatch
        computer = new Laptop();
        computer.Type();

        //Polymorphism: Dynamic method Dispatch
        computer = new Desktop();
        computer.Type();

        //What i can't do
        Desktop desktop = new Desktop();
        desktop.Type();
//        desktop = new Laptop(); this is problematic because laptop class does not extend Desktop.
//        desktop.Type();
    }
}
