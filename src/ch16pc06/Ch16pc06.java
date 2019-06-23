package ch16pc06;

import java.util.Scanner;

/**
 * Character Counter
 * Count the number of times a user-specified character occurs in user-provided
 * text
 * @author frank
 */
public class Ch16pc06 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String string;
        char character;
        int result;
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Request user input
        System.out.println("Welcome to the Character Counter.");
        System.out.print("Please enter the text you wish to have searched. ");
        string = keyboard.nextLine();
        System.out.print("Please the character you wish to have counted. ");
        character = keyboard.nextLine().charAt(0);
        
        // Calculate the result
        result = countCharacters(string, character, 0);
        
        System.out.println("The number of character '" + Character.toString(character) +
                "' in the text '" + string + "' is: " + Integer.toString(result));
    }
    
    /**
     * Count the number of characters in a string
     * @param string String The text to parse
     * @param character char The character to count
     * @param position int The position of the character in the text
     * @return int The number of times the character appears in the text
     */
    private static int countCharacters(String string, char character, int position) {
        if (position >= string.length())
            return 0;
        else
            return compare(string.charAt(position), character) +
                countCharacters(string, character, position + 1);
    }
    
    /**
     * Compare one character to another
     * @param a char The first character to be compared
     * @param b char The second character to be compared
     * @return int 1 if they match; 0 otherwise
     */
    private static int compare(char a, char b) {
        if (a == b)
            return 1;
        else
            return 0;
    }
}
