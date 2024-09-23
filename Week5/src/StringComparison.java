import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        String barret = "TacoBell Burrito";
        String mcDonalds = "Five Dollar Meal Deal";
        Scanner veryImportantPassowrdCXollector = new Scanner(System.in);
        String thePassword;

        System.out.println("Please enter the secret passcord");
        thePassword = veryImportantPassowrdCXollector.nextLine();
        if(thePassword.equals(barret)){
            System.out.println("NO BURRITO FOR YOU!");
        }else if(thePassword.equalsIgnoreCase(mcDonalds)){
            System.out.println("Your computer will self destruct");
        }else{
            System.out.println("Incorrect Password");
        }

        veryImportantPassowrdCXollector.close();
    }
}
