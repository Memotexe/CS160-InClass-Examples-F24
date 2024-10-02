import java.util.Scanner;
import java.util.Random;
public class DiceSimulator {
    public static void main(String[] args){
        System.out.println("Lets Roll for Initiative");

        System.out.println("Please select what dice you wanna roll:\n" +
                            "D4, enter 4\n" +
                            "D6, enter 6\n" +
                            "D8, enter 8\n" +
                            "D10, enter 10\n" +
                            "D12, enter 12\n" +
                            "D20, enter 20\n" +
                            "D100, enter 100\n");
        Scanner userinput = new Scanner(System.in);
        int roll = userinput.nextInt();
        Random randy = new Random();
        
        switch(roll){
            case 4:
                int d4 = randy.nextInt(4)+1;
                System.out.println("You rolled a " + d4);
                break;
            case 6:
                int d6 = randy.nextInt(6)+1;
                System.out.println("You rolled a " + d6);
                break;
            case 8:
                int d8 = randy.nextInt(8)+1;
                System.out.println("You rolled a " + d8);
                break;
            case 10:
                int d10 = randy.nextInt(10)+1;
                System.out.println("You rolled a " + d10);
                break;
            case 12:
                int d12 = randy.nextInt(12)+1;
                System.out.println("You rolled a " + d12);
                break;
            case 20:
                int d20 = randy.nextInt(20)+1;
                System.out.println("You rolled a " + d20);
                break;
            case 100:
                int d100 = randy.nextInt(100)+1;
                System.out.println("You rolled a " + d100);
                break;
        }
        userinput.close();
    }
}
