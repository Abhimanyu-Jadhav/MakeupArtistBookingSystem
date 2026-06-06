package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeupArtistApp {

    static ArrayList<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Makeup Artist Booking System =====");
            System.out.println("1. Add Booking");
            System.out.println("2. View All Bookings");
            System.out.println("3. Search Customer");
            System.out.println("4. Total Revenue");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Booking ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Customer Name: ");
                    String customer = sc.nextLine();

                    System.out.print("Service Name: ");
                    String service = sc.nextLine();

                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();

                    bookings.add(new Booking(id, customer, service, amount));

                    System.out.println("Booking Added Successfully!");
                    break;

                case 2:
                    if (bookings.isEmpty()) {
                        System.out.println("No bookings found.");
                    } else {
                        for (Booking b : bookings) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    boolean found = false;

                    for (Booking b : bookings) {
                        if (b.getCustomerName().equalsIgnoreCase(name)) {
                            System.out.println(b);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 4:
                    double total = 0;

                    for (Booking b : bookings) {
                        total += b.getAmount();
                    }

                    System.out.println("Total Revenue: ₹" + total);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
