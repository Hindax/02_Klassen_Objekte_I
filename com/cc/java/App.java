package com.cc.java;

public class App {

    public static void main(String[] args) {

        /**Typkonvertierung  */
        App.output(String.valueOf(2)); // int --> String
        App.output(Integer.toString(2)); // int--> String
        App.output("Das ist ein Ziffer: " + 2); // int --> String


        Cat cat = new Cat();
        output("Blick von aussen " + cat);

        cat.tellYourAddress();

        output("-----------------");

        Cat cat1 = new Cat();
        output("Blink von aussen " + cat1);
        
        cat1.tellYourAddress();

        App.tellYourAddress();

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

    public static void tellYourAddress() {
        System.out.println("Hallo!");
    }
}
