package org.example;

public class Main {
    public static void main(String[] args) {
       //Four Pillars: Encapsulation, Inheritance, Abstraction, Polymorphism

        //instantiate a new Bank Account
        BankAccount jonsAccount = new BankAccount(1000);

        //depositing and withdrawing money
        jonsAccount.deposit(100);
        jonsAccount.withdraw(50);

        System.out.println("My balance is " + jonsAccount.getBalance());
    }
}