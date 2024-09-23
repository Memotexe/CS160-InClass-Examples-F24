import java.util.Scanner;

public class Branching {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Should you wear a jacket today? Enter 1 for yes, or any other number for no");
        int input = scan.nextInt();
        if (input >= 1) {
            System.out.println("You put on a jacket.");
        }
        else{
            System.out.println("You didn't put a jacket.");
        }
        scan.close();
    }

}
