package org.example;

public class BankAccount {
    //backing variable
    //By making balance private, withdraw and deposit, and the getter
    //are the only means to interact with the balance.
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
