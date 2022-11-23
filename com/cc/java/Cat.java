package com.cc.java;

public class Cat {

   public String name = "nobody";
   public String furColor;
   public int age;
    
      // public Cat(String name, String furColor, int age) {
      //   this.name = name;
      //   this.furColor = furColor;
      //   this.age = age;
      // }

      public Cat(String name, String furColor, int age) {
         this.name = name;
         this.furColor = furColor;
         this.age = age;
      }

   public String tellYourName() {
      return this.name;
   }

   public String tellYourFurColor() {
      return furColor;

   }
   public int tellYourAge(){
      return this.age;
   }




public void tellYourAddress(){
   // Aufruf der Methode output() in der KLASSE App
   // this ist die Referenz des Objektes auf sich selbst
    App.output("Blick von innen: " + this);
}




    
}