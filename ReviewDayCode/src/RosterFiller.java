import java.util.Scanner;

public class RosterFiller {
    public static void main(String[] args) throws Exception {
        Student roster[] = new Student[12];
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        String FirstName = "";
        String LastName = "";
        double GPA = 0.0;

        for(int i = 0; i < roster.length;i++){
            System.out.println("What is your first name:");
            FirstName = scan.next();
            System.out.println("What is your last name:");
            LastName = scan.next();
            System.out.println("What is your GPA:");
            GPA = scan.nextDouble();
            roster[i] = new Student(FirstName, LastName, GPA);
        }

        while(flag){
            System.out.println("Give me a number between 0-11");
            int value = scan.nextInt();
            System.out.println(roster[value]);
        }

        


    }
}
