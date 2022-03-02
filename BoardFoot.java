/**
 * The BoardFoot program calculates the length of a foot
 * board given its width, height, and 144''^2 as the total volume
 *
 * @author  Jonathan Kene
 * @version 1.0
 * @since   2022-02-28
 **/

import java.util.Scanner;  
// Import the Scanner class

class Boardfoot { // the function that calculates the length of the board
    public static float footBoard(float width, float height)  {
	int CONST_VOLUME = 144;    
        return (CONST_VOLUME / (width * height));
        // returns the length by
        // dividing 144 by (height * width)
    }

    public static void main(String[] args) {
        while (true) {
            Scanner myObj = new Scanner(System.in);
            // Create a Scanner object
            System.out.println("Enter width in inches");
            String widthString = myObj.nextLine();
            // Get users width as string
            System.out.println("Enter height in inches");
            String heightString = myObj.nextLine();
            // Get users height as string

            try {
                float width = Float.parseFloat(widthString);
                float height = Float.parseFloat(heightString);
                // inputs into floats
                if (width > 0 && height > 0) {
                    // ensures that the integers are positive
                    // passes the height and width to the function and stores the result as
                    // length
                    float length = footBoard(width, height);
                    // prints the result
                    System.out.println("the length of your board is " + length + " inches");
                    break;
                } else {
                    // if the numbers were not positive
                    System.out.println("The number must be positive");
                }
            } catch (NumberFormatException exception) {
                // if the input wasn't two numbers
                System.out.println("You must input a number");
            }
        }
    }
}
