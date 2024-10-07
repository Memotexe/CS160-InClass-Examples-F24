import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        while(numbers <= 1 || numbers >= 100){
            System.out.println("That Number is Invalid");
            System.out.println("Please Try Again");
            numbers = scan.nextInt();
        }
    }
}
