package com.banking.model;

public enum AccountType {
    CREATED("Account Created"),
    BLOCKED("Account Bocked"),
    ACTIVATED("Account ACTIVATED");
    private final String displayName;

    AccountType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}