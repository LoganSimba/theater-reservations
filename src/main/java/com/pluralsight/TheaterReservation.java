package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservation {
    public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);

        //ask the user to enter their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        //parsed the name to get first and last name
        String[] fullName = name.split(" ");
        String firstName = fullName[0];
        String lastName = fullName[1];

        // ask user for what date they will come
        System.out.print("What date will be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine().trim();

        // ask user for how many tickets they would like
        System.out.print("How many tickets would you like? ");
        int desiredTickets = scanner.nextInt();

        //formatting i
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate theaterTickets = LocalDate.parse(date, formatter);

        //print the receipt
        System.out.println(desiredTickets + " tickets reserved for " + theaterTickets + " under " + lastName + ", " + firstName);

        scanner.close();

    }
}
