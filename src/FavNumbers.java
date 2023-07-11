import java.util.Scanner; // import Scanner

public class FavNumbers { // class favNumbers
    public static void main(String[] args) { // main

        Scanner in = new Scanner(System.in); // Scanner in = new Scanner(System.in)
        // declare variables
        int integer = 0; // integer = 0
        double doubleNumber = 0; // doubleNumber = 0

        integer = SafeInput.getInt(in, "Enter your favorite integer"); // integer = SafeInput.getInt(in, "Enter your favorite integer")
        doubleNumber = SafeInput.getDouble(in, "Enter your favorite double"); // doubleNumber = SafeInput.getDouble(in, "Enter your favorite double")
        System.out.println("Your favorite integer and double are " + integer + " and " + doubleNumber); // output "Your favorite integer and double are " + integer + " and " + doubleNumber
    } // return
} // end class
