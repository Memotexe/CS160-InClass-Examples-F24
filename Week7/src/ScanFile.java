import java.io.*;
import java.util.*;
public class ScanFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("outputFile.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNext()){
            System.out.println(scan.nextLine());
        }
    }   
}
