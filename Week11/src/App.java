public class App {
    public static void main(String[] args) throws Exception {
        int x, y;
        x = 5;
        y= -12;
        Boolean value = Comparison(x, y);
        System.out.println("True or False, is X > Y? " + value);

        //VOID METHOD CALL
        //Comparison(23,4);


    }

    public static Boolean Comparison(int x, int y){
        if(x > y){
            return true;
        }else{
            return false;
        }
    }


    // public static void Comparison(int x, int y){

    //     if(x > y){
    //         System.out.println("TRUE");
    //     }else{
    //         System.out.println("FALSE");
    //     }
    // }
}
