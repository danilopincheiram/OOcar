/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Danilo Pincheira
 */
public class car {
   // properties 
    private String brand;
    private String model;
    private int year;
    private String colour;
    protected person owner;  
     
    //default constructor
    public car (){
        System.out.println("new car created");
        this.brand = "toyota";       
        this.model = "auris";
        this.year = 2020;
        this.colour = "red";
        this.owner = null;
    }
    //constructor
   public car(String brand, String model,int year, String colour){
       this.brand = brand;
       this.model = model;
       this.year = year;
       this.colour = colour;

       
   } 
   //methods
   public String Running(){
       return "the " + this.brand + ", " + this.brand + " is going very quick";
   }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public person getOwner() {
        return owner;
    }

    public void setOwner(person owner) {
        this.owner = owner;
    }
    
    public String running(){
        return " the car brand: " + this.brand + " model; " + this.model + "is going very fast";
        
    }
    @Override
   public String toString(){
       return "the car "  + this.brand + ", " + this.model + ", " + "year " + this.year + ", " + " colour " + this.colour + ", owner: " + this.owner.getName();
   }
}
