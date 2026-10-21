package com.pluralsight;

import java.util.Scanner;

public class TheaterReservation {
    public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);

        //as the user to enter their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        // ask user for what date they will come
        System.out.print("What date will be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine().trim();

        // ask user for how many tickets they would like
        System.out.println("How many tickets would you like? ");
        int desiredTickets = scanner.nextInt();



    }
}
