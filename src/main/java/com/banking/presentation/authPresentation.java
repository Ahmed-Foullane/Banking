package com.banking.presentation;

import com.banking.service.auth.Login;
import com.banking.service.auth.Register;

import java.util.Scanner;
import java.util.UUID;

public class authPresentation {
    static Login login = new Login();
    static Register register = new Register();
    Scanner sc = new Scanner(System.in);


    public void registerOrLoginMenu(){
        System.out.println("enter 1 to login");
        System.out.println("enter 2 to register new account");
        int option = Integer.parseInt(sc.nextLine());
        if (option == 1){
            loginForm();
        }else if (option == 2){
            registerForm();
        }
    }
    public void loginForm(){
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        if (login.authenticate(email, password)) {
            System.out.println("Logged in successfully");
        } else {
            System.out.println("Email or password is wrong");
            loginForm();
        }
    }

    public void registerForm(){
        UUID clientId = UUID.randomUUID();
        System.out.println("enter first name: ");
        String firstName = sc.nextLine();
        System.out.println("enter last name: ");
        String lastName = sc.nextLine();
        System.out.println("enter your email: ");
        String email = sc.nextLine();
        System.out.println("enter your password");
        String password = sc.nextLine();
        if(register.registerClient(clientId, firstName, lastName, email, password)){
            System.out.println("registered successfully");
            loginForm();
        }else{
            System.out.println("email already exists");
            registerForm();
        }

    }


}
