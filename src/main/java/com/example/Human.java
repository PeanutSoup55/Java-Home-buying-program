package com.example;

public class Human {
    public int id;
    public String name;
    public int age;
    public String phone;
    
    public Human(int id, String name, int age, String phone){
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    public void Introduce(){
        System.out.println("Hi I'm " + this.name);
    }
    
    public void Tour(){
        System.out.println("Tour time");
    }
}
