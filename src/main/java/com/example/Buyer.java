package com.example;

public class Buyer extends Human{
    private double budget;
    private double min;
    private double max;  
    
    public Buyer(int id, String name, int age, String phone, double budget, double min, double max){
        super(id, name, age, phone);
        this.budget = budget;
        this.min = min;
        this.max = max;
    }

    public void BuyerStat(){
        System.out.println("\n   Budget: " + this.budget + "\n   Min: " + this.min + "\n   Max: " + this.max);
    }
}
