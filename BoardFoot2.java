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

/**
* To get rid of style error.
*
**/
final class BoardFoot2 {
    // the function that calculates the length of the board
    public static float footBoard(float width, float height)  {
        final int VOLUME = 144;
        return VOLUME / (width * height);
        // returns the length by
        // dividing 144 by (height * width)
    }
    /**
    * Main entry point into program.
    *
    * @throws NumberFormatException To get rid of style error
    * @throws com.myorg.NumberFormatException1 To gain access to throw
    */

    private BoardFoot2() {
        throw new NumberFormatException("Utility class");
    }

    /**
     * To get rid of style error.
     *
     *
     * @param args nothing passed in
     *
     **/
    public static void main(String[] args) {
        while (true) {
            final Scanner myObj = new Scanner(System.in);
            // Create a Scanner object
            System.out.println("Enter width in inches");
            final String widthString = myObj.nextLine();
            // Get users width as string
            System.out.println("Enter height in inches");
            final String heightString = myObj.nextLine();
            // Get users height as string

            try {
                final float width = Float.parseFloat(widthString);
                final float height = Float.parseFloat(heightString);
                // inputs into floats
                if (width > 0 && height > 0) {
                    // ensures that the integers are positive
                    // passes the height and width to the
                    // function and stores the result as
                    // length
                    final float length = footBoard(width, height);
                    // prints the result
                    System.out.println("the length of your board is "
                                       + length + " inches");
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
