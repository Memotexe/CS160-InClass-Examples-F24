public class PrintsAndComments {
    
    /*
     * What we did here was just simply show 
     * how we can print to the console
     * how comments are not seen as code by the compiler
     * utilize various escape sequences and string concatenation
     * to print statements in weird formats
     * and finall we made a variable and performed
     * math with it!
     */
    
    
    
    //This is the main method
    //the variable mayo means 3.14

    /*
     * This is a comment block
     */
    public static void main(String[] REDACTED) throws Exception {
        System.out.print("Hello,\n World!\n");
        System.out.print("Do you \nlike REDACTED?\n");
        System.out.println("Chase \nlike Pickles");
        System.out.print("Michigan\n Wolverines Suck");

        System.out.print("These are our top sellers" +
        " Black ops 6"+
        " REDACTED" +
        " pickles:\n");
        System.out.print("\tCompute`r games\n\tCoffee\n ");
        System.out.println("\tAspirin");
        double Trouble;
        Trouble = 3.1415976254793165846;
        System.out.println("The value of our double variable" +
        " named trouble is: " +
        Trouble * 10.27);

    }
}
