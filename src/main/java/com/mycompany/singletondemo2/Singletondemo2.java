package com.mycompany.singletondemo2;

public class Singletondemo2 {

    public static void main(String[] args) {
        System.out.println("*** A Singleton demo 2 ***");    
        // Captain captain = new Captain(); // Error - Can't instantiate
        
        Captain captain = Captain.getCaptain();
        System.out.println("\tTrying to create another captain...");
        
        Captain captain2 = Captain.getCaptain();
        if (captain.equals(captain2)) {
            System.out.println("\tBoth captain and captain2 are equal.");
        } 
        
        // The instantiation of the inner non-static class creates new objects
        // of it parent class (Captain). This is because CaptainDerived is 
        // a member of Captain, and does it "can execute" its parent's 
        // constructor.
        Captain captainDerived = captain.new CaptainDerived();
        Captain captainDerived2 = captain.new CaptainDerived();
        
    }
}
