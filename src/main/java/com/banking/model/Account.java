package com.banking.model;

import java.util.HashSet;
import java.util.UUID;


public class Account {
    private UUID accountNumber;
    private double balance;
    private AccountType accountType;
    private final HashSet<Transaction> transactions;
    private UUID clientId;


    public Account(UUID accountNumber, AccountType accountType, UUID clientId) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.clientId = clientId;
        this.balance = 0.0;
        this.transactions = new HashSet<>();
    }
    public int getTransactionCount() {
        return transactions.size();
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(UUID accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public HashSet<Transaction> getTransactions() {
        return new HashSet<>(transactions);
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }
}