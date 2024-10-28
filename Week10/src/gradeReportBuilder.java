import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class gradeReportBuilder {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("GradeReport.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNext()){
            System.out.println(scan.nextLine());
        }
    }
}
