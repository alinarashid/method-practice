package com.pluralsight;

public class Hello {
    public static void main(String[] args) {
        sayHello();        // Call sayHello method
        sayGoodbye();      // Call sayGoodbye method
        sayGoodMorning();  // Call sayGoodMorning method
    }

    /* Method to say hello world
       void because it returns nothing, it only prints
    */
    public static void sayHello() {
        System.out.println("Hello, World!");
    }


    /* Method to say Goodbye
       void because it returns nothing, it only prints
    */
    public static void sayGoodbye () {
        System.out.println("Goodbye!");
    }


    /* Method to say Good morning
       void because it returns nothing, it only prints
    */
    public static void sayGoodMorning () {
        System.out.println("Good morning");
    }
}
