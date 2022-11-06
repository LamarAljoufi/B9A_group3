package b9a_group3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MarineDreamDemo {
    
    private static Scanner input;
    private static PrintWriter output;

    public static void main(String[] args) throws FileNotFoundException {
        input = new Scanner(System.in);
        output = new PrintWriter("output.txt");
        ArrayList<Ticket> tickets = new ArrayList<>();

        displayMenu();
        int choice = input.nextInt();

        //if users chooses Fishing (fill info)
        if (choice == 1) {
            System.out.print("\n------- Redervation Details -------");
            System.out.print("\n-- Enter time in hours: ");
            String time = input.next();

            System.out.print("-- Enter date as dd/mm: ");
            String date = input.next();

            System.out.print("-- Enter duration in hours: ");
            int duration = input.nextInt();

            Fishing fishing = new Fishing(time, date, duration);

            tickets.add(new Ticket(createCustomer(), fishing));

        } else if (choice == 2) {
            System.out.print("\n------- Redervation Details -------");
            System.out.print("\n-- Enter time: ");
            String time = input.next();

            System.out.print("-- Enter date as dd/mm: ");
            String date = input.next();

            System.out.print("-- Enter duration in hours: ");
            int duration = input.nextInt();

            System.out.print("-- Enter number of people: ");
            int numOfPeople = input.nextInt();
            Sailing sailing = new Sailing(numOfPeople, time, date, duration);

            tickets.add(new Ticket(createCustomer(), sailing));

        }

        output.print(tickets.get(0).displayTicket()); // index
        System.out.println("\n----------- You booked your ticket successfully -----------\n");

        upgradeMenu(tickets.get(0).getBooking());
        choice = input.nextInt();

        if (tickets.get(0).getBooking().checkUpgradeTicket(choice)) {
            displayUgrade(tickets.get(0).getBooking(), choice);
        }

        System.out.println("\nThanks for your reservation, have fun in your trip  ");

        output.close();
        output.flush();

    }

      //crearting customer object (fill info)
    static Customer createCustomer() {
        System.out.print("\n------- Customer Information -------");
        System.out.print("\n-- Enter your first name: ");
        String name = input.next();

        System.out.print("-- Enter your age: ");
        int age = input.nextInt();

        System.out.print("-- Enter your phone number: ");
        String phone = input.next();

        return new Customer(name, phone, age);
    }
    
    static void displayUgrade(Service service, int choice) {
        if (service instanceof Fishing) {
            output.println(((Fishing) service).upgradeTicket(choice));
        } else {
            output.println(((Sailing) service).upgradeTicket(choice));
        }
    }
    
     //print menu only
    static void displayMenu() {
        System.out.print("\n\n---------------------------------------------------"
                + "\n----------- Welcome to Marine Dream App -----------"
                + "\n---------------------------------------------------"
                + "\n\nEnjoy sea trips with Marine Dream online booking service!"
                + "\n\n--------------------------------------"
                + "\nChoose a marine service:"
                + "\n1- Fishing"
                + "\n2- Sailing"
                + "\nEnter your choice: ");
    }
    
    
     static void upgradeMenu(Service service) {
        System.out.println("---------------------------------------------------"
                + "\nMake your trip enjoyable and upgrade your ticket with marine app  "
                + "\n---------------------------------------------------");

        if (service instanceof Fishing) {
            System.out.println("------- VIP -------"
                    + "\n- Fisherman helper"
                    + "\n- 2x Fishing payload"
                    + "\n- Inshore fishing");
            System.out.println("\n------- VVIP -------"
                    + "\n- Fisherman helper"
                    + "\n- 3x Fishing payload"
                    + "\n- Deep sea fishing");

        } else {
            System.out.println("------- VIP -------"
                    + "\n- Meal of your choice"
                    + "\n- Sea activites");
            System.out.println("\n------- VVIP -------"
                    + "\n- Cuisine of your choice"
                    + "\n- Snorkeling"
                    + "\n- Jetski");

        }

        System.out.print("\nServices list:"
                + "\n1- VIP"
                + "\n2- VVIP"
                + "\notherwise press 0 to exit"
                + "\n--Enter your choice:");
    }
}
