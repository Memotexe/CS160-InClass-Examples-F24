import java.util.Scanner;
public class doWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int totalsales = 0;
        System.out.println("Welcome to our Store: Menards");
        System.out.println("SAVE BIG MONEY @ MENARDSSSSSSSSSSS! :D");

        System.out.println("Whatcha buying?");
        do{
            System.out.println("Please enter a product:");
            String product = scan.nextLine();
            System.out.println("Please enter a price");
            double price = scan.nextDouble();

            double tax = price * .07;
            double total = tax + price;

            System.out.println("You purchased a: " + product);
            System.out.println("The total:" + total);

            System.out.println("Do you want to run another Sale?!");
            String eat = scan.nextLine();
            totalsales++;
        }while((scan.nextLine()).equalsIgnoreCase("yes"));

        System.out.println("Total Number of Sales Today:" + totalsales);

        
    }
}
