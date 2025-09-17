package com.banking.model;

import java.util.HashMap;
import java.util.Collection;

public class Client extends Person {
    private String clientId;
    private final HashMap<String, Account> accounts;

    public Client(String clientId, String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
        this.clientId = clientId;
        this.accounts = new HashMap<>();
    }

    public Collection<Account> getAllAccounts() {
        return accounts.values();
    }

    public int getAccountCount() {
        return accounts.size();
    }


    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public HashMap<String, Account> getAccounts() {
        return new HashMap<>(accounts);
    }


}