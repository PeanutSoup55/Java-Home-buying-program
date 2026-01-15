package com.example;
import java.util.ArrayList;
public class Realtor extends Human{
    public String license;
    public ArrayList<House> listings = new ArrayList<>();

    public Realtor(int id, String name, int age, String phone, String license ){
        super(id, name, age, phone);
        this.license = license;
    }

    public void addListing(House house){
        this.listings.add(house);
    }

    public ArrayList<House> getListings(){
        return listings;
    }

    public void PrintDets(){
        System.out.println("name: " + this.name );
    }

    public String getName(){
       return name;
    }
}
