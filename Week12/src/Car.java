import java.util.Scanner;

public class Car {

    private String make;
    private String model;
    private int year;
    private int mileage;
    private double cityMPG;
    private double highwayMPG;
    private double price;
    private String color;
    private boolean isSalvage;
    private String carFacts;
    private boolean doesItRun;
    private boolean doBumperStickersExist;
    private String fuelType;
    private int carVictims;



    public Car(String make, String model, int year, int mileage, double cityMPG, double highwayMPG, double price,
            String color, boolean isSalvage, String carFacts, boolean doesItRun, boolean doBumperStickersExist,
            String fuelType, int carVictims) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.cityMPG = cityMPG;
        this.highwayMPG = highwayMPG;
        this.price = price;
        this.color = color;
        this.isSalvage = isSalvage;
        this.carFacts = carFacts;
        this.doesItRun = doesItRun;
        this.doBumperStickersExist = doBumperStickersExist;
        this.fuelType = fuelType;
        this.carVictims = carVictims;
    }

    public void depreciation(){
        double depreciationValue = this.year + (this.mileage * 0.01);
        this.price = this.price - depreciationValue;
    }

    public void doorDinkgs(int dingks){
        if(this.price >= 1000){
            this.price = this.price - (dingks * 100);
        }else{
            System.out.println("EHHH IM ALREADY A FEW STELLAS IN BRUV I DONT CARE ABOUT MY"
             + "BEATER, WHO CARES");
        }
    }

    public void NewPaintJob(){
        Scanner scan = new Scanner(System.in);
        if(this.carVictims % 5 == 0){
            System.out.println("What color do you want");
            this.color = scan.nextLine();
            doorDinkgs(carVictims);
            System.out.println("Your " + this.year + " " + this.make + " " + this.model 
            + "'s car color is now" + this.color);
        }
    }




    public String getMake() {
        return make;
    }


    public void setMake(String make) {
        this.make = make;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public int getMileage() {
        return mileage;
    }


    public void setMileage(int mileage) {
        this.mileage += mileage;
    }


    public double getCityMPG() {
        return cityMPG;
    }


    public void setCityMPG(double cityMPG) {
        this.cityMPG = cityMPG;
    }


    public double getHighwayMPG() {
        return highwayMPG;
    }


    public void setHighwayMPG(double highwayMPG) {
        this.highwayMPG = highwayMPG;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public boolean isSalvage() {
        return isSalvage;
    }


    public void setSalvage(boolean isSalvage) {
        this.isSalvage = isSalvage;
    }


    public String getCarFacts() {
        return carFacts;
    }


    public void setCarFacts(String carFacts) {
        this.carFacts = carFacts;
    }


    public boolean isDoesItRun() {
        return doesItRun;
    }


    public void setDoesItRun(boolean doesItRun) {
        this.doesItRun = doesItRun;
    }


    public boolean isDoBumperStickersExist() {
        return doBumperStickersExist;
    }


    public void setDoBumperStickersExist(boolean doBumperStickersExist) {
        this.doBumperStickersExist = doBumperStickersExist;
    }


    public String getFuelType() {
        return fuelType;
    }


    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCarVictims() {
        return carVictims;
    }

    public void incrementCarVictims() {
        this.carVictims++;
    }



}
