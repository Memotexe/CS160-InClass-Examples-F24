public class casting {
    public static void main(String[] chase){
        int bananas = 10000000;
        double radiationPerBanana = 0.0000000000000000001;

        int totalRads = (int) (bananas * radiationPerBanana);

        System.out.println(totalRads);
    }
}
