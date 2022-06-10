package Command;

import FactoryMethod.Doll;

public class NeedDoll implements Command {

    @Override
    public void execute() {
       System.out.println("Трябва ми кукла");
    }
}