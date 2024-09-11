import java.util.Scanner;

/* We used the concept of a Muffin Shop ran by the Muffin man to explore how we can store
 * values in variable as well as predefine variables which their value will always be static
 * like State Tax as seen for the "inTax" variable. 
 * Aside from that you can see how we utilize the Scanner API function provided by JAVA to 
 * create a object in which we record user input, as seen named as "keyboard"
 * With that we would ask the user how many muffins they would want and in return 
 * repeat to them the same value they entered to ensure that the values matched.
 * Finally we took our gathered information and spat out a tiny report showing how
 * much it would cost and then we closed out our keyboard with the code on line 33
 */
public class muffinMan {
    public static void main(String[] args) {
        String greeting = "Welcome Stranger";
        String orderAsk = "Whatcha Buyin'";
        double muffinPrice = 3.00;
        int quantityOfMuffins = 0;
        double inTax = 1.07;
        double totalPrice = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println(greeting);
        System.out.println(orderAsk);

        System.out.println("How many muffins are you buying?");
        quantityOfMuffins = keyboard.nextInt();
        System.out.println("You are buying " + quantityOfMuffins + " Muffins");

        totalPrice = (quantityOfMuffins * muffinPrice) * inTax;
        System.out.println("Your total is: $" + totalPrice);

        keyboard.close();





    }
}
