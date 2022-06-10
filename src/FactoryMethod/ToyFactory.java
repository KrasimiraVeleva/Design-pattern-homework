package FactoryMethod;

public class ToyFactory {

    public Toy createProduct(String productName) {

        if(productName == "Doll") {
            return new Doll();
        }
        if(productName == "Bike") {
            return new Bike();
        }
        System.out.println("Unknown toy");
        return  null;
    }
}