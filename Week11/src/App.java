import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        int x, y;
        x = 5;
        y= 12;
        // File file = new File("totalSales.txt");
        // Boolean value = Comparison(x, y, file);
        // System.out.println("True or False, is X > Y? " + value);

        // VOID METHOD CALL
        Comparison(x,y);
        Comparison(23, 5);
        Comparison(1212,543534);


    }


/**
 * Paragraph
 * 
 * 
 * 
 * 
 * @param x
 * @param y
 * @param file This takes the users file input
 * @return Boolean True or False
 */
    // public static Boolean Comparison(int x, int y, File file){
    //     if(x > y){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }


    public static void Comparison(int x, int y){

        if(x > y){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}
