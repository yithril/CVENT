package org.example;

public class BankAccount {
    static int bankCode = 1234;
    double balance = 1000.0;

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        acc1.bankCode++;
        acc1.balance += 500;

        acc2.bankCode++;
        acc2.balance += 200;

        System.out.println("acc1 bankCode: " + acc1.bankCode); // Output?
        System.out.println("acc1 balance: " + acc1.balance); // Output?
        System.out.println("acc2 bankCode: " + acc2.bankCode); // Output?
        System.out.println("acc2 balance: " + acc2.balance); // Output?
    }
}
