import java.util.Scanner;

public class ObjectTester {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Car IsaiCar = new Car("Toyota", "Tacoma", 2019, 50000, 19, 24, 20000, "Grey", false, "1 Owner, No Wrecks", true, true, "87 gasoline", 0);

        System.out.println("Hey Isai, how many miles did you drive today?");
        int milesDrive = scan.nextInt();

        IsaiCar.setMileage(milesDrive);

        IsaiCar.depreciation();

        System.out.println(IsaiCar.getPrice());

        System.out.println("Hey Isai, you hit a few road bumps near a local highschool, are you sure it was a racoon?");
        Boolean answer = scan.nextBoolean();
        if(answer){
            System.out.println("How many bumps were there");
            int poorTargets = scan.nextInt();
            for(int i = 0; i < poorTargets; i++){
                IsaiCar.incrementCarVictims();
            }
            IsaiCar.NewPaintJob();
        }

        
        

































        // double length = 0;
        // double width = 0;

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Please enter the rectangle width");
        // length = scan.nextDouble();
        // System.out.println("Please enter the rectangle length");
        // width = scan.nextDouble();
        
        // Rectangle rectangle = new Rectangle(length,width);
        // Rectangle rect =  new Rectangle();
        // double area = rectangle.getArea();

        // System.out.println("This is the rectangles length: " + rectangle.getLength());
        // System.out.println("This is the rectangles width: " + rectangle.getWidth());
        // System.out.println("This is the rectangles Area: " + area);

        // rectangle.setLength(scan.nextDouble());
        // rectangle.setWidth(scan.nextDouble());

        // System.out.println("This is the rectangles length: " + rectangle.getLength());
        // System.out.println("This is the rectangles width: " + rectangle.getWidth());

        // area = rectangle.getArea();
        // System.out.println("This is the rectangles new Area: " + area);





    }
}
