import java.util.Random;

public class ArraysYay {
    public static void main(String[] args){
        int[] grades = new int[44];
        //0 -> 95
        Random rand = new Random();

        for(int i = 0; i < grades.length;i++){
            grades[i] = rand.nextInt(100);
        }

        for(int i = 0; i < grades.length;i++){
            System.out.println(grades[i]);
        }

        System.out.println("This is the max: " + max(grades));
        System.out.println("This is the min: " + min(grades));
        System.out.println("The average value is:" + average(grades));

    }

    public static int max(int[] grades){
        int max = 0;
        for(int i = 0; i < grades.length; i++){
            if(max < grades[i])
                max = grades[i];
        }
        return max;
    }

    public static int min(int[] grades){
        int min = 2000;
        for(int i = 0; i < grades.length; i++){
            if(min > grades[i])
            min = grades[i];
        }
        return min;
    }

    public static double average (int[] grades){
        double average;
        double sum = 0;
        for (int j = 0; j < grades.length; j ++){
            sum += grades[j];
        }
        average = sum/grades.length;
        return average;
    }








}
