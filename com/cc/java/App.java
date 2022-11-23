package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "Grizabella";
        cat.furColor = "white";
        cat.age = 29;

        // output(cat.name);
        // output(cat.furColor);
        // output(String.valueOf(cat.age));

        App.output(cat.tellYourName());
        output(cat.tellYourFurColor());
        output(String.valueOf(cat.tellYourAge()));

        // cat.tellYourAddress();

        output("------------------------");

        Cat cat1 = new Cat();
        cat1.name = "Alonzo";
        cat1.furColor = "grey";
        cat1.age = 18;
        
        // neues Objekt wird erzeugt, Adresse wird cat zugewiesen
        // Cat cat = new Cat();
        // // Methode output befindet sich in der KLASSE App
        // App.output("Blick von aussen: "+ cat); 
        // // Methode tellYourAddress() befindet sich im OBJEKT cat 
        // cat.tellYourAddress();
    
        output("------------------------");

        // // neues Objekt wird erzeugt, Adresse wird cat1 zugewiesen
        // Cat cat1 = new Cat();
        // // Methode output befindet sich in der KLASSE App
        // output("Blick von aussen: "+ cat1); 
        // // Methode tellYourAddress() befindet sich im OBJEKT cat1 
        // cat1.tellYourAddress();

    }

    // Methode witrd aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}
