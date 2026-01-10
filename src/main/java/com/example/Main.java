package com.example;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ericb
 */

public class Main {
    public static Scanner s = new Scanner(System.in);
    public static ArrayList<House> houses = new ArrayList<House>();

    public static void displayMenu(){
        int choice;
        do  { 
            System.out.println("==== Menu ====");
            System.out.println("1. Make House");
            System.out.println("2. Display Houses");
            System.out.println("3. Make Realtor");
            System.out.println("4. Add Realtor to House Listing");
            System.out.println("5. Add Buyer");
            choice = s.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("\nMaking new House...\n");
                    MakeHome();
                    break;
                case 2:
                    System.out.println("\n=== House List ===\n");
                    break;
                case 3:
                    System.out.println("\nMaking Realtor...\n");
                    break;
                case 4:
                    System.out.println("\nAdding Realtor to Listing...\n");
                    break;
                case 5:
                    System.out.println("\nMaking Buyer...\n");
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (choice != 0);

        s.close();
    }

    public static void MakeHome(){
        int count;
        System.out.print("Enter number of new Houses: ");
        count = s.nextInt();
        for(int i = 0; i < count; i++){
            System.out.print("Enter ID: ");
            int id = s.nextInt();
            System.out.print("Enter Price: ");
            double price = s.nextDouble();
            s.nextLine();
            System.out.print("Enter location: ");
            String loca = s.nextLine();
            House house = new House(id, price, loca);
            houses.add(house);
            System.out.println("=== House Added ===");
            System.out.println("\n ID: " + id + "\n Price: " + price + "\n Adress: " + loca + "\n");
        }
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
