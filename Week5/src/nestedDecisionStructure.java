import java.util.Scanner;

public class nestedDecisionStructure {
    public static void main(String[] args) {
        int comparison1 = 22;
        double comparison2 = 15.22;
        boolean IdontknowMyCat = false;
        double PizzaPrice = 12.41;
        boolean inStock = true;
        Scanner scan = new Scanner(System.in);
        int userInput1 = 0;
        double userInput2 = 0.0;
        boolean userInput3;
        double userInput4 = 0.0;
        boolean userInput5;
        System.out.println("Please enter the number to be compared");
        userInput1 = scan.nextInt();
        if(comparison1 > userInput1){
            System.out.println("You've unlocked the first lock");
            System.out.println("Please enter the next Number to be compared");
            userInput2 = scan.nextDouble();
            if(comparison2 > userInput2){
                System.out.println("You've unlocked the second lock");
                System.out.println("Do you know your cat?");
                userInput3 = scan.nextBoolean();
                if(userInput3 == IdontknowMyCat){
                    System.out.println("You've unlocked the Third lock");
                    System.out.println("Whats the price of Gabriel's Pizza");
                    userInput4 = scan.nextDouble();
                    if(userInput4 == PizzaPrice){
                        System.out.println("You've unlocked the Fourth lock");
                        System.out.println("Is the pizza in stock");
                        userInput5 = scan.nextBoolean();
                        if(userInput5 == inStock){
                            System.out.println("Coupon");
                        }else{
                            System.out.println("You failed to pick the 5th lock");
                        }
                    }else{
                        System.out.println("You failed to pick the 4th lock");
                    }
                }else{
                    System.out.println("You failed to pick the 3rd lock");
                }
            }else{
                System.out.println("You failed to pick the 2nd lock");
            }
        }else{
            System.out.println("You failed to pick the 1st lock");
        }

    }
}
