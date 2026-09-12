package edu.psu.se411;

import java.math.BigDecimal;
import edu.psu.se411.exceptions.InsufficientFundsException;

public class Wallet {

    private BigDecimal balance;

    public Wallet(BigDecimal initialBalance) {
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

    public void withdraw(BigDecimal amount)
            throws InsufficientFundsException {

        if (amount == null
                || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be a positive number."
            );
        }

        if (amount.compareTo(balance) > 0) {
            throw new InsufficientFundsException(
                "Insufficient funds. Available: " + balance
                + ", requested: " + amount
            );
        }

        balance = balance.subtract(amount);
    }
}