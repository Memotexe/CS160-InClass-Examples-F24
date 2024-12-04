import java.util.Random;

public class ArraysYay {
    public static void main(String[] args){
        int[] grades = new int[44];
        //0 -> 95
        Random rand = new Random();

        for(int i = 0; i <= grades.length;i++){
            grades[i] = rand.nextInt(100);
        }

        for(int i = 0; i < grades.length;i++){
            System.out.println(grades[i]);
        }




    }
}
