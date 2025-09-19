package com.banking.model;

import java.util.HashMap;

public class Manager extends Person {
    private String managerId;

    public Manager(String managerId, String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
        this.managerId = managerId;
        HashMap<String, Client> managedClients = new HashMap<>();
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

}