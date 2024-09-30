import java.util.Scanner;
import java.text.DecimalFormat;

public class printf {
    public static void main(String[] args) {
        double x = 233445.5436453;
        double y = 324344.52345;
        double division = x/y;
        String someText = "someText";
        System.out.println(division);
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.printf("This is the division output of these two crazy numbers: %.2f \n",division);
        System.out.printf("This is the value of the someText Variable: %s \n",someText);
        System.out.println(df.format(division));
        System.out.print("Enter the value of the Fleet Fuel Economy");
        double FFE = scan.nextDouble();
        System.out.print("Enter the Model Name:");
        String Model1 = scan.next();
        System.out.println("MPG?:");
        int value = scan.nextInt();

        System.out.println(FFE);
        System.out.println(Model1);
        System.out.println(value);
    }
}
