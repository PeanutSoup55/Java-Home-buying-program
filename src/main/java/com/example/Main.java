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
    public static ArrayList<Buyer> buyers = new ArrayList<>();

    public static void displayMenu(){
        int choice;
        do  { 
            System.out.println("\n\n=========== Menu ===========");
            System.out.println("1. Make House");
            System.out.println("2. Display Houses");
            System.out.println("3. Make Realtor");
            System.out.println("4. Add Realtor to House Listing");
            System.out.println("5. Add Buyer");
            System.out.println("6. Realtor Sales List");
            System.out.println("7. Sold Houses");
            System.out.println("8. Exit");
            System.out.println("============================");
            choice = s.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("\n==== Making new House ====\n");
                    MakeHome();
                    break;
                case 2:
                    System.out.println("\n======= House List =======\n");
                    DisplayHomes();
                    break;
                case 3:
                    System.out.println("\n===== Making Realtor =====\n");
                    MakeRealtor();
                    break;
                case 4:
                    System.out.println("\nAdding Realtor to Listing\n");
                    LinkRealtor();
                    break;
                case 5:
                    System.out.println("\nMaking Buyer...\n");
                    MakeBuyer();
                    break;
                case 6:
                    System.out.println("List of Realtors and their Houses for sale");
                    HomeListRealtor();
                    break;
                case 7:
                    System.out.println("Displaying Sold Houses");
                    SoldList();
                    break;
                case 8:
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
            boolean sold = false;
            House house = new House(id, price, loca, sold);
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

    public static void MakeRealtor(){
        System.out.print("Enter number of new Realtors: ");
        int count = s.nextInt();
        s.nextLine(); 
    
        for(int i = 0; i < count; i++){
            System.out.print("Enter ID: ");
            int id = s.nextInt();
            s.nextLine(); 
    
            System.out.print("Enter Name: ");
            String name = s.nextLine(); 
    
            System.out.print("Enter Age: ");
            int age = s.nextInt();
            s.nextLine(); 
    
            System.out.print("Enter Phone Number: ");
            String phone = s.nextLine(); 
    
            System.out.print("Enter License: ");
            String lic = s.nextLine(); 
    
            Realtor r1 = new Realtor(id, name, age, phone, lic);
            realtors.add(r1);
            
            System.out.println("\n=== Realtor Added ===");
            r1.PrintDets();
            System.out.println("===================\n");
        }
    }
    

    public static void LinkRealtor(){
        if(realtors.isEmpty() || houses.isEmpty()){
            System.out.println("\nNeed both a populated HOUSE and REALTOR list to do this action\n");
            return;
        }

        System.out.print("Select Realtor index (0 - " + (realtors.size()-1) + "): ");
        int rIndex = s.nextInt();

        System.out.print("Select House ID to assign to realtor (0 - " + (houses.size()-1) + "): ");
        int hId = s.nextInt();

        House selectedHouse = null;
        for(House h : houses){
            if (h.id == hId){
                selectedHouse = h;
                break;
            }
        }

        if (selectedHouse == null) {
            System.out.println("Error: House with ID " + hId + " does not exist.");
        } else if (rIndex < 0 || rIndex >= realtors.size()) {
            System.out.println("Error: Realtor index " + rIndex + " is out of range.");
        } else {
            realtors.get(rIndex).addListing(selectedHouse);
            System.out.println("Success! House " + hId + " added to " + realtors.get(rIndex).getName());
        }
        
    }

    public static void HomeListRealtor(){
        for(Realtor r: realtors){
            System.out.println("Realtor: " + r.getName());
            ArrayList<House> listings = r.getListings();
            if(listings.isEmpty()){
                System.out.println("XXXXXXXXXXXX");
            } else {
                System.out.println("  Listings:");
                for (House h : listings){
                    System.out.println("    ");
                    h.PrintDets();
                }
            }
            System.out.println("-------------------------");
        }
    }

    public static void MakeBuyer() {
        System.out.print("Enter number of new Buyers: ");
        int count = s.nextInt();
        s.nextLine(); 
    
        for (int i = 0; i < count; i++) {
            System.out.print("Enter ID: ");
            int id = s.nextInt();
            s.nextLine(); 
    
            System.out.print("Enter Name: ");
            String name = s.nextLine();
    
            System.out.print("Enter Age: ");
            int age = s.nextInt();
            s.nextLine(); 
    
            System.out.print("Enter Phone Number: ");
            String phone = s.nextLine();
    
            System.out.print("Enter Total Budget: ");
            double budget = s.nextDouble();
    
            System.out.print("Enter Minimum House Price: ");
            double min = s.nextDouble();
    
            System.out.print("Enter Maximum House Price: ");
            double max = s.nextDouble();
            s.nextLine(); 
    
            Buyer b1 = new Buyer(id, name, age, phone, budget, min, max);
            
            buyers.add(b1);
    
            System.out.println("\n=== Buyer Added ===");
            b1.BuyerStat(); 
            System.out.println("===================\n");
        }
    }

    public static void SoldList(){
        for (House h: houses){
            if (h.sold == false){
                System.out.println("No sold houses!");
            } else {
                System.out.println("    ");
                h.PrintDets();
            }
        }
    }
    

    public static void main(String[] args) {
        displayMenu();
    }
}
