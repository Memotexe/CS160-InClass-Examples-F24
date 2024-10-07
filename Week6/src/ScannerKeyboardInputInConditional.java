import java.util.Scanner;

public class ScannerKeyboardInputInConditional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(scan.nextLine().equalsIgnoreCase("test")){
            System.out.println("it works");
        }else{
            System.out.println("It doesn't");
        }
        scan.close();
    }
}
