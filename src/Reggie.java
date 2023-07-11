import java.util.Scanner; // import Scanner
public class Reggie { // class Reggie
    public static void main(String[] args) { // main
            Scanner in = new Scanner(System.in); // Scanner in = new Scanner(System.in)
            String SSN = ""; // String SSN = ""
            String  UCStudentMNumber = ""; // String  UCStudentMNumber = ""
            String menuChoice = ""; // String menuChoice = ""

            SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}"); // SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}")
            UCStudentMNumber = SafeInput.getRegExString(in, "Enter your UC Student M number", "(M|m)\\d{5}$"); // UCStudentMNumber = SafeInput.getRegExString(in, "Enter your UC Student M number", "(M|m)\\d{5}$")
            menuChoice = SafeInput.getRegExString(in, "Enter a menu choice", "[OoSsVvQq]$"); // menuChoice = SafeInput.getRegExString(in, "Enter a menu choice", "[OoSsVvQq]$");
            System.out.print("Your SSN is " + SSN + ", your UC Student M number is " + UCStudentMNumber + ", and your menu choice is " + menuChoice); // output "Your SSN is " + SSN + ", your UC Student M number is " + UCStudentMNumber + ", and your menu choice is " + menuChoice
    } // return
} // end class
