package com.banking.repository;

import com.banking.model.Account;

import java.util.HashSet;
import java.util.UUID;

public class AccountRepository {
    private static final AccountRepository INSTANCE = new AccountRepository();
    private final HashSet<Account> accounts;
    private AccountRepository(){
        this.accounts = new HashSet<>();
    }
    public static AccountRepository getInstance(){
        return INSTANCE;
    }

    public boolean add(Account account){
        return accounts.add(account);
    }

    public boolean remove(Account account){
        return accounts.remove(account);
    }

    public Account update(Account updatedAccount) {
        if (accounts.remove(updatedAccount)) {
            accounts.add(updatedAccount);
            return updatedAccount;
        }
        return null;
    }

    public void deposit(double amount, UUID accountNumber){
        for(Account a: accounts){
            if (a.getAccountNumber().equals(accountNumber)){
                if (amount > 0){
                double currentBalance = a.getBalance();
                a.setBalance(amount + currentBalance);
                }
            }
        }
    }

    public  void withdraw(double amount, UUID accountNumber){
        for (Account a: accounts){
            if(a.getAccountNumber().equals(accountNumber)){
                if(amount > a.getBalance()){
                double currentBalance = a.getBalance();
                a.setBalance(currentBalance - amount);
                }
            }
        }
    }

    public int count(){
        return accounts.size();
    }




}
