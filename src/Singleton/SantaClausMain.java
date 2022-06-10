package Singleton;

import Command.Command;
import Command.NeedBike;
import Command.NeedDoll;
import FactoryMethod.ToyFactory;

public class SantaClausMain {

    public static void Main(String[] args) {

        SantaClaus connection = SantaClaus.getInstance();
        ToyFactory factory = new ToyFactory();
        
        NeedDoll doll = new NeedDoll();
        NeedBike bike = new NeedBike();

        System.out.println("Трябват ми кукли");
        System.out.println("Трябват ми колелета");
    }
}