import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Verizon Call Center");
        System.out.println("Please enter the number to the options below so I can help you!");
        System.out.println("1. How's Service in my Area");
        System.out.println("2. Pay a Bill");
        System.out.println("3. Talk to a sales represenative");
        System.out.println("4. Connect to a tech representative");
        System.out.println("5. English or Spanish?");
        Scanner scan = new Scanner(System.in);

        int Input = scan.nextInt();

        switch(Input){
            case 1:
                System.out.println("Its ok");
                break;
            case 2:
                System.out.println("You owe $55.99");
                break;
            case 3:
                System.out.println("We are connecting you now");
                break;
            case 4:
                System.out.println("They are all on break. Sorry");
                break;
            case 5:
                System.out.println(">_>");
                break;
                default:
                    System.out.println("We will just connect you to a representative i guess.");



        }
    }
}
