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
        

    
  
    }  
}
