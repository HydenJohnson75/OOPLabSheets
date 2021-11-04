package LabSheet5.exercise4;

public class BankAccount {

    private String owner = "";
    private int number;
    private static double intrestRate;

    public BankAccount(){
        this.owner = "Owner Not available";
        this.number = 0;
        BankAccount.intrestRate = 0;
    }

    public BankAccount(String owner, int number, double intrestRate){
        this.setOwner(owner);
        this.setNumber(number);
        BankAccount.setIntrestRate(intrestRate);
    }


    public static void setIntrestRate(double intrestRate) {
        BankAccount.intrestRate = intrestRate;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static double getIntrestRate() {
        return intrestRate;
    }

    public int getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public String toString(){
        return "\n\n Owner: " + getOwner() + " Account Number: " + getNumber() + " Interest Rate: " + BankAccount.getIntrestRate();
    }
}
