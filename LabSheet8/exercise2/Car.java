package LabSheet8.exercise2;

public class Car extends Vehicle {

    private int maxPassengers;
    private String registrationNumber;

    public Car(){

        setMaxPassengers(0);
        setRegistrationNumber("No registration number specified");

    }

    public Car(double price,double length,double height,double weight,String manufacturer,String model,int maxPassengers,String registrationNumber){
        super(price,length,height,weight,manufacturer,model);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if(Validator.isValidRegistrationNumber(registrationNumber)){
            this.registrationNumber = registrationNumber;
        }
        else
            this.registrationNumber = "Invalid Registration Number";
    }

    @Override
    public String toString() {
        return super.toString() + "\nMax Passengers: " + getMaxPassengers() + "\nRegistration Number: " + getRegistrationNumber();
    }
}
