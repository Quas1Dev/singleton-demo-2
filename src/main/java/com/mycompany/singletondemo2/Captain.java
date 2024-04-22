package com.mycompany.singletondemo2;

public class Captain {
    private static Captain captain;
    static int totalCapitains;
    
    private Captain(){
        totalCapitains++;
        System.out.println("There are " + totalCapitains + 
                " instances of Capitain.");
    }
    
    public static Captain getCaptain(){
        if (captain == null) {
            captain = new Captain();
            System.out.println("\tA capitain has been elected for your team!");
        } else {
            System.out.println("\tYour team has a capitain yet.");
            System.out.println("\tSend him to toss the coin!");
        }
        return captain;
    }
    
    public class CaptainDerived  extends Captain {
        // Some code
    }
}
