package com.library;

/**
 * Utility class for String operations.
 * 
 * @author Siddharth Lokh
 * @version 1.0.0
 */
public class Stringutils {

    /**
     * Greets the user with a welcome message.
     * 
     * @param name The name to greet
     * @return A greeting message
     */
    public static String greet(String name) {
        return "Hello, " + name + "! Welcome to SiddharthLokh library.";
    }

    /**
     * Checks if a string is null or empty.
     * 
     * @param str The string to check
     * @return true if null or empty, false otherwise
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * Checks if a string is NOT null or empty.
     * 
     * @param str The string to check
     * @return true if not null and not empty
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * Reverses a string.
     * 
     * @param str The string to reverse
     * @return The reversed string
     */
    public static String reverse(String str) {
        if (str == null)
            return null;
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Capitalizes the first letter of a string.
     * 
     * @param str The string to capitalize
     * @return The capitalized string
     */
    public static String capitalize(String str) {
        if (isEmpty(str))
            return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    /**
     * Counts the number of words in a string.
     * 
     * @param str The string to count words in
     * @return The word count
     */
    public static int wordCount(String str) {
        if (isEmpty(str))
            return 0;
        return str.trim().split("\\s+").length;
    }
}