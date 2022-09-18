/*
* This program calculates the max amount of logs
*
*
* @author  Lily Liu
* @version 1.0
* @since   2022-09-15
*
* This is the log calculator  program.
*/

import java.util.Scanner;

/**
 * This the log calculating program.
 */

final class Log {

    /**
    * This is the weight per log.
    */
    public static final double MASS = 20;

    /**
    * This is the max capacity in the truck.
    */
    public static final double MAXCAPACITY = 1100;
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Log() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // print out "Log Capacity!"
        final Scanner myObj = new Scanner(System.in);
        System.out.print("Enter log length of logs: ");
        final float lognumber = myObj.nextFloat();
        System.out.println("Number of logs that can be placed on a truck : "
            + MAXCAPACITY / (lognumber * MASS));
        System.out.println("\nDone.");
    }
}
