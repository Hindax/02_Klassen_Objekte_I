package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat("Grizabella", "white", 29);
        // output(cat.getName());
        // output(cat.getFurColor());
        // output(String.valueOf(cat.getAge()));

        System.out.println("Cat's name is " + cat.getName() + ", its fur color is " + cat.getFurColor() + ". " + cat.getName() + " is " + cat.getAge() + " years old."  );

          output("------------------------");
  

        Cat cat1 = new Cat("Leila","rot",  22);



        output(cat1.getName());
        output(cat1.getFurColor());
        output(String.valueOf(cat1.getAge()));

    
        output("------------------------");

  
    }

    // Methode witrd aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}
