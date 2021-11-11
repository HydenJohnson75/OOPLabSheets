package LabSheet8.exercise1;

public class TestVehicle {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(100000.0,4.5,1.25,2000.0,"Ferrari","F2",2,"05KY1");

        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle(500.0,1.5,1.0,50.0,"Raleigh","Mountainbike",4,true);

        System.out.println("Testing the no argument car constructor: \n\n" + c1 + "\n\nTesting the multi-argument Car constructor:\n\n" +  c2 + "\n\n"+ b1 + "\n\n" + b2);


    }


}
