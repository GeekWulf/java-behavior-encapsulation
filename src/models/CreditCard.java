package models;

public class CreditCard {
    private double balance;
    private String name;

    public CreditCard(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
