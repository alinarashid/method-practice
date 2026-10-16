package com.pluralsight;

public class Format {

    public static void main(String[] args) {

        // Call formatName and print the name it returns
        System.out.println(formatName("Alina", "Rashid"));
    }


    /* Formats a name as "Last, First"
   Returns a String, so it gives the formatted name back to main
   (main does the printing)
    */
    public static String formatName (String first, String last) {
        String formattedName = last + ", " +first ;     // build "Last, First"
        return formattedName;                           // send it back to the main (Caller!)

    }
}
