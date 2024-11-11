import java.util.Scanner;

public class ObjectTester {
    public static void main(String[] args) throws Exception {

        double length = 0;
        double width = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the rectangle width");
        length = scan.nextDouble();
        System.out.println("Please enter the rectangle length");
        width = scan.nextDouble();
        
        Rectangle rectangle = new Rectangle(length,width);
        double area = rectangle.getArea();

        System.out.println("This is the rectangles length: " + rectangle.getLength());
        System.out.println("This is the rectangles width: " + rectangle.getWidth());
        System.out.println("This is the rectangles Area: " + area);

        rectangle.setLength(scan.nextDouble());
        rectangle.setWidth(scan.nextDouble());

        System.out.println("This is the rectangles length: " + rectangle.getLength());
        System.out.println("This is the rectangles width: " + rectangle.getWidth());

        area = rectangle.getArea();
        System.out.println("This is the rectangles new Area: " + area);





    }
}
