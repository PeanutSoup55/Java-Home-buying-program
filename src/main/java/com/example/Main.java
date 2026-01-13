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
    public static ArrayList<Realtor> realtors = new ArrayList<>();

    public static void displayMenu(){
        int choice;
        do  { 
            System.out.println("\n\n======== Menu ========");
            System.out.println("1. Make House");
            System.out.println("2. Display Houses");
            System.out.println("3. Make Realtor");
            System.out.println("4. Add Realtor to House Listing");
            System.out.println("5. Add Buyer");
            System.out.println("6. Exit");
            choice = s.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("\n== Making new House ==\n");
                    MakeHome();
                    break;
                case 2:
                    System.out.println("\n==== House List ====\n");
                    DisplayHomes();
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
            System.out.println("\n=== House Added ===");
            house.PrintDets();
            System.out.println("===================\n");
        }
    }

    public static void DisplayHomes(){
        if (houses.isEmpty()){
            System.out.println("No Houses ¯\\_(ツ)_/¯");
            return;
        }
        for (int i = 0; i < houses.size(); i++){
            House house = houses.get(i);
            house.PrintDets();
        }
    }

    public static void LinkRealtor(){
        if(realtors.isEmpty() || houses.isEmpty()){
            System.out.println("\nNeed both a populated HOUSE and REALTOR list to do this action\n");
            return;
        }

        System.out.println("Select Realtor index (0 - " + realtors.size() + ")");
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
