/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.car;
import model.person;

/**
 *
 * @author Danilo Pincheira
 */
public class OOcar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    // instantiation of a person
    person p1 = new person("juan", 28, "male");
    
    person p2 = new person("mario", 30, "male");
    
    person p3 = new person("Mitzy", 18, "female"); // Hahaha Mitzy wishes to be 18 again! haha
  
     // instantiation of a car
    
     car car1 = new car();
     // setOwner, not print
     car1.setOwner(p1);
      // print the lines
        System.out.println(car1);
    
      //instantiaton of car 2
    car car2 = new car("Dodge", "challenger", 2020, "black");
        // setOwner
         car2.setOwner(p2);
       //print toString with the owner added
        System.out.println(car2);
        
     car car3 = new car();
     car car4 = new car();
     
     car car5= new car("Nissan","Juke", 2021, "Silver"); //I love this car but It's expensive for Mitzy :-P
        System.out.println("The new car for " + p3 + " is " + car5.getBrand()+", "+car5.getColour()+" "+ car5.getModel());
  
    }  
}
