import java.io.*;
public class PrintWriterExample{
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("outputFile.txt");
        PrintWriter brokenHeart = new PrintWriter(fw);
        double vehicleFootPrint = 34.44;
        double targetFuelEconomy;
        String models[] = new String[3];
        int productionAmounts[] = new int[3];
        Double mpgRatings[] = new Double[3];

        models[0] = "45691856";
        models[1] = "python";
        models[2] = "ruby";
        
        productionAmounts[0] = 2000;
        productionAmounts[1] = 21000;
        productionAmounts[2] = 32000;

        mpgRatings[0] = 23.93;
        mpgRatings[1] = 24516248956120645126485164851.99;
        mpgRatings[2] = 45612301654.04;

        double fleetFuelEconomy = 32.40;
        targetFuelEconomy = 12.23;

        brokenHeart.println("\n\nCafe Compliance Report");
        brokenHeart.println("----------------------");
        brokenHeart.println("Vehicle Footprint: " + vehicleFootPrint + " sq. ft.");
        brokenHeart.println("Target Fuel Economy: " + targetFuelEconomy + " mpg.\n\n");

        //outputting the vehicle models, production amounts, and mpg ratings for three vehicles
        brokenHeart.printf("%-15s %-20s %-10s%n", "Model", "Production Amount", "MPG Rating");
        brokenHeart.printf("%-15s %-20s %-10s%n", "-----", "-----------------", "----------");
        brokenHeart.printf("%-15s %-20d %-10.2f%n", models[0], productionAmounts[0], mpgRatings[0]);
        brokenHeart.printf("%-15s %-20d %-10.2f%n", models[1], productionAmounts[1], mpgRatings[1]);
        brokenHeart.printf("%-15s %-20d %-10.2f%n", models[2], productionAmounts[2], mpgRatings[2]);
        
        brokenHeart.println("\nFleet Fuel Economy: " + fleetFuelEconomy + " mpg");
        //Checking if the fleet fuel economy is greater than or equal to the target fuel economy
        brokenHeart.println("\nCompliance Status: " + (fleetFuelEconomy >= targetFuelEconomy ? "Pass" : "Not pass"));
        brokenHeart.close();

    }
}