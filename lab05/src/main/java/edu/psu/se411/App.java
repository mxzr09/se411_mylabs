package edu.psu.se411;

import java.math.BigDecimal;

import edu.psu.se411.exceptions.InsufficientFundsException;
import edu.psu.se411.exceptions.InvalidAgeException;

public class App {

    public static void main(String[] args) {
        testAgeValidation();
        testWallet();
    }

    private static void testAgeValidation() {
        try {
            validateAge(18);
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(
                "Validation failed: " + e.getMessage()
            );
        }
    }

    private static void testWallet() {
        Wallet wallet = new Wallet(new BigDecimal("500.00"));
        BankAccount bankAccount =
            new BankAccount(new BigDecimal("1000.00"));

        System.out.println("\nInitial wallet balance: "
                + wallet.getBalance());
        System.out.println("Initial bank balance: "
                + bankAccount.getBalance());

        try {
            transferToBank(
                wallet,
                bankAccount,
                new BigDecimal("200.00")
            );

            System.out.println("\nTransfer successful.");
            System.out.println("Wallet balance: "
                    + wallet.getBalance());
            System.out.println("Bank balance: "
                    + bankAccount.getBalance());

            transferToBank(
                wallet,
                bankAccount,
                new BigDecimal("400.00")
            );

        } catch (InsufficientFundsException e) {
            System.out.println(
                "\nWithdrawal failed: " + e.getMessage()
            );
        }
    }

    private static void transferToBank(
            Wallet wallet,
            BankAccount bankAccount,
            BigDecimal amount)
            throws InsufficientFundsException {

        wallet.withdraw(amount);
        bankAccount.deposit(amount);
    }

    public static void validateAge(int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                "Age must be at least 18."
            );
        }

        System.out.println("Age is valid.");
    }
}