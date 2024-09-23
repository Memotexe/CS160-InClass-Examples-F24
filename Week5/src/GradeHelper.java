import java.util.Scanner;

public class GradeHelper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        if (grade > 95)
            System.out.println("You get an A");
        else if (grade > 63)
            System.out.println("You get an B");
        else if (grade > 62)
            System.out.println("You get a C");
        else
            System.out.println("F!");
    }
}
