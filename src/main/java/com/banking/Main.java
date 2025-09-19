package com.banking;


import com.banking.presentation.authPresentation;

public class Main {
    static private final authPresentation AUTH_PRESENTATION = new authPresentation();
    public static void main(String[] args) {
           AUTH_PRESENTATION.registerOrLoginMenu();

    }
}