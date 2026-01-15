package com.example;

public class House {
    public int id;
    public double price;
    public String location;
    public boolean sold;
    
    public House(int id, double price, String location, boolean sold){
        this.id = id;
        this.price = price;
        this.location = location;
        this.sold = sold;
    }
    
    public void PrintDets(){
        System.out.println("\nID: " + this.id + "\nPrice: " + this.price + "\nLocation: " + this.location);
    }

    public void Sold(){
        this.sold = true;
    }
}
