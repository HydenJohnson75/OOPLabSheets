package LabSheet5.exercise5;

public class BankAccount {

    private String owner = "";
    private int number;
    private static double intrestRate;
    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BankAccount.count = count;
    }

    public static void incrementCount(){
        count++;
    }

    public BankAccount(){
        this.owner = "Owner Not available";
        this.number = BankAccount.getCount();
        BankAccount.intrestRate = 0;
        incrementCount();
    }

    public BankAccount(String owner, double intrestRate){
        this.setOwner(owner);
        this.number = BankAccount.getCount();
        BankAccount.setIntrestRate(intrestRate);
        incrementCount();
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
