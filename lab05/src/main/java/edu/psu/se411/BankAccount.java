package edu.psu.se411;

import java.math.BigDecimal;

public class BankAccount {

    private BigDecimal balance;

    public BankAccount(BigDecimal initialBalance) {
        if (initialBalance == null
                || initialBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException(
                "Initial balance must be provided and cannot be negative."
            );
        }

        this.balance = initialBalance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        if (amount == null
                || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be a positive number."
            );
        }

        balance = balance.add(amount);
    }
}