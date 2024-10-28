import java.util.*;
import java.io.*;
public class AverageHighLow {
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("numbers.txt");
        Scanner scan = new Scanner(file);

        //Average
        //Max
        //Min

        double average = 0;
        int max = 12;
        int min = 703;
        int sum = 0;
        int count = 0;
        int currentNumber = 0;

        while(scan.hasNext()){
            currentNumber = scan.nextInt();
            sum += currentNumber;
            count++;
            if(currentNumber <= min){
                System.out.println("The Current Min Number is: " + min + 
                "\n The new Min number is: " + currentNumber);
                min = currentNumber;
            }

            if(currentNumber >= max){
                System.out.println("The Current Max Number is: " + max + 
                "\n The new Max number is: " + currentNumber);
                max = currentNumber;
            }
        }

        average = sum/count;

        System.out.println("The current max is:" + max);
        System.out.println("The current min is:" + min);
        System.out.println("The current average is:" + average);

    }
}
