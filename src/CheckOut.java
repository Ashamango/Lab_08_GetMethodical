import java.util.Scanner; // import Scanner

public class CheckOut { // class CheckOut
    public static void main(String[] args) { // main
        Scanner in = new Scanner(System.in); // Scanner in = new Scanner(System.in)
        // declare variables
        double price = 0;  // num price = 0
        double total = 0; // num total = 0
        boolean answer = false; // boolean answer = false
        // Prompt and input
        do { // do
            price = SafeInput.getRangedDouble(in, "Please enter the price of the item ", 0.50, 10.00); // price = SafeInput.getRangedDouble(in, "Please enter the price of the item ", 0.50, 10.00)
            total = (price + total); // total = price + total
            answer = SafeInput.getYNConfirm(in, "Do you have another item? "); // answer = SafeInput.getYNConfirm(in, "Do you have another item? ")
        } while (!answer); // while !answer

        System.out.printf("The total cost of your items " + total + " dollars."); // output "The total cost of your items is " + total + " dollars."
    } // return
} // end class

