public class CtoFTableDisplay { // class CtoFTableDisplay
    public static void main(String[] args) { // main
    CtoF(); // go to method CtoF()
    }
    // public static double CtoF()

    /**
     * @param
     * @return temperatureC
     */
    public static double CtoF() { // CtoF
        double temperatureC = 0; // num temperatureC = 0
        double temperatureF = 0; // temperatureF = 0
        for (int x = 0; x <= 5; x++) // for x = 0 to 5 step 1
        {
            System.out.print("_"); // output "_"
        } // end for
        for (int x = 0; x <= 0; x++) // for x = 0 to 0 step 1
        {
            System.out.print("_|_"); // output "_|_"
        } // end for
        for (int x = 0; x <= 5; x++) // for x = 0 to 5 step 1
        {
            System.out.print("_"); // output "_"
        } // end for
        System.out.print("\n"); // output new line
        for (double cel = -100; cel <= 100; cel++) { // for cel = -100 to 100 step 1
            temperatureF = (cel * 9 / 5) + 32; // temperatureF = ( temperatureC - 32 ) * 5/9

            for (double fah = temperatureF; fah <= temperatureF; fah++) { // for fah = temperatureF to temperatureF step 1
                System.out.println(cel + " |  "+ fah); // output cel + " |  "+ fah
            } // end for
        } // end for
    return temperatureC;
    } // return
} // end class
