import java.util.*;
import java.io.*;
public class AverageHighLowMedian {
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("numbers.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNext()){
            System.out.println(scan.nextInt());
        }
    }
}
