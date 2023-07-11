import java.util.Scanner; // import scanner

public class BirthDateTime { // class BirthDateTime
    public static void main(String[] args){ // main

        Scanner in = new Scanner(System.in); // Scanner in = new Scanner(System.in)
        // declare variables
        int year; // num year
        int month; // num month
        int day = 0; // num day = 0
        int min; // num min
        // Prompt and input
        year = SafeInput.getRangedInt(in, "Enter the year you were born ", 1950, 2010); // year = SafeInput.getRangedInt(in, "Enter the year you were born ", 1950, 2010)
        month = SafeInput.getRangedInt(in, "Enter the month you were born ", 1, 12); // month = SafeInput.getRangedInt(in, "Enter the month you were born ", 1, 12)
        switch(month) // switch(month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: // cases for months 1, 3, 5, 7, 8, 10, 12
            day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 31); // day = SafeInput.getRangedInt(in, "Enter the day you were born", 1, 31)
            break; // break;
            case 2: // case for month 2
                day = SafeInput.getRangedInt(in, "Enter the day you were born", 1,29 ); // day = SafeInput.getRangedInt(in, "Enter the day you were born", 1,29 )
                break; // break
            case 4: case 6: case 9: case 11: // cases for months, 4, 6, 9, 11
            day = SafeInput.getRangedInt(in, "Enter the day you were born", 1,30 ); // day = SafeInput.getRangedInt(in, "Enter the day you were born", 1,30 )
            break; // break
        }
        min = SafeInput.getRangedInt(in, "Enter number of minutes", 1, 59); // min = SafeInput.getRangedInt(in, "Enter number of minutes", 1, 59);
        // output
        System.out.println("Your birthday is " + min + " minutes, " + month + " " + day + ", " + year); // output ("Your birthday is " + min + " minutes, " + month + " " + day + ", " + year)
    } // return
} // end class

