package com.banking.model;

public enum AccountType {
    CHECKING("Checking Account"),
    SAVINGS("Savings Account");

    private final String displayName;

    AccountType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}