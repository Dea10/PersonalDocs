package com.dea;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Java!");

        User user = new User("Daniel", "Espinosa");

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
    }
}
