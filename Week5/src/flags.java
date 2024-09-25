import java.util.Scanner;

public class flags {
    public static void main(String[] args) {
        boolean flag = false;
        String userInput = "";
        String userInput2 = "";
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the Secret Code and his Social Security # to Isai's Front Door");
        userInput = scan.nextLine();
        userInput2 = scan.nextLine();
        if(userInput.equals("4206969") || (userInput2.equals("909-12-9437"))){
            flag = true;
        }

        if(flag){
            System.out.println("Your kidney are mine!");
        }
        
    }
}
