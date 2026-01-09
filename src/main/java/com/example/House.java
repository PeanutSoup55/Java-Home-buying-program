package com.example;

public class House {
    public int id;
    public double price;
    public String location;
    
    public House(int id, double price, String location){
        this.id = id;
        this.price = price;
        this.location = location;
    }
    
    public void PrintDets(){
        System.out.println("\nID: " + this.id + "\nPrice: " + this.price + "\nLocation: " + this.location);
    }
}
