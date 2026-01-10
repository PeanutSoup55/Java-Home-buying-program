package com.example;

import java.util.Scanner;

/**
 *
 * @author ericb
 */

public class Main {
    private Scanner s = new Scanner(System.in);

    public static void displayMenu(){
        int choice = 0;
        System.out.println("==== Menu ====");
        System.out.println("1. Make House");
        System.out.println("2. Display Houses");
        System.out.println("3. Make Realtor");
        System.out.println("4. Add Realtor to House Listing");
        System.out.println("5. Add Buyer");
        

    }
    public static void main(String[] args) {
        displayMenu();
    }
}
