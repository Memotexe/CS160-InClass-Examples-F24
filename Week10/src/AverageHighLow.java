import java.util.*;
import java.io.*;
public class AverageHighLow {

    public static final double maxNumber = 0;
    public static void main(String[] args) throws FileNotFoundException {
        
        boolean flag = true;
        while(flag){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please provide me a file name, '.txt' included!");
            String filename = scan.nextLine();
            
            File file = new File(filename);
            fileReaderOutput(file);
            System.out.println(maxNumber);
            String response = "";
            System.out.println("Do you want to read another file? (y/n)");
            response = scan.nextLine();
            if(response.equalsIgnoreCase("y")){
                continue;
            }else{
                flag = false;
            }
        }
        

    }

    public static void fileReaderOutput(File file) throws FileNotFoundException{
        Scanner scan = new Scanner(file);

        //Average
        //Max
        //Min
        System.out.println(maxNumber);
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
