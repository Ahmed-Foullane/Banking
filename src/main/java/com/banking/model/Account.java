package com.banking.model;

import java.util.HashSet;


public class Account {
    private String accountNumber;
    private double balance;
    private AccountType accountType;
    private final HashSet<Transaction> transactions;
    private String clientId;


    public Account(String accountNumber, AccountType accountType, String clientId) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.clientId = clientId;
        this.balance = 0.0;
        this.transactions = new HashSet<>();
    }
    public int getTransactionCount() {
        return transactions.size();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
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

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}