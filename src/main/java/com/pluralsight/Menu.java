package com.pluralsight;

public class Menu {

    public static void main(String[] args) {
        displayMenu();         // Call displayMenu
        displayMenu();         // Call displayMenu to check for reusability
    }

    // Void because it returns nothing, it only prints
    public static void displayMenu() {

        // Printing a text block
        System.out.println("""
                ======MENU=======
                1. Coffee - $3.99
                2. Tea - $2.99
                3. Cookie - $1.99
                """ );
    }
}
