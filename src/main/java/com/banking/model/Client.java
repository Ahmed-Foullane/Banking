package com.banking.model;

import java.util.HashMap;
import java.util.Collection;
import java.util.UUID;

public class Client extends Person {
    private UUID clientId;
    private final HashMap<String, Account> accounts;

    public Client(UUID clientId, String firstName, String lastName, String email, String password) {
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


    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public HashMap<String, Account> getAccounts() {
        return new HashMap<>(accounts);
    }


}