import java.util.Scanner; // import Scanner

public class GetUserName { // class GetUserName
    public static void main(String[] args) { // main

        Scanner in = new Scanner(System.in); // Scanner in = new Scanner(System.in);
        // declare variables
        String firstName = ""; // String firstName = ""
        String lastName = ""; // String lastName = ""
        // Prompt and input
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name"); // firstName = SafeInput.getNonZeroLenString(in, "Enter your first name")
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name"); // lastName = SafeInput.getNonZeroLenString(in, "Enter your last name")
        // output
        System.out.println("/nYour full name is: " + firstName + " " + lastName); // output "/nYour full name is: " + firstName + " " + lastName
    } // return
} // end class
