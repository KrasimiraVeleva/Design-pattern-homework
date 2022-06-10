package Command;

import FactoryMethod.Bike;

    public class NeedBike implements Command {

        @Override
        public void execute() {
            System.out.println("Трябва ми колело");
        }
    }