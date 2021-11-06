package LabSheet9.exercise1;

public final class SelfEmployedWorker extends Employee{

    private double estimatedIncome;


    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);
        setEstimatedIncome();
    }

    public void setEstimatedIncome(){

       this.estimatedIncome =(int)(Math.random() * ((900 - 400+1) + 400));

    }

    public double earnings(){

        return estimatedIncome;
    }

    @Override
    public String toString() {
        return "Self employed worker's name is " + super.toString();
    }
}
