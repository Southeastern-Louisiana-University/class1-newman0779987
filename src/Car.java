package src;

public class Car {
    private String make;
    private String model;
    private int year;
    private double mileage;

    private double price;
    private double gasUsed;
    private double gasMileage;

    /*
        Overloaded method for creating the car object; one for the four data fields gone over in class and
        one including the three new data fields. It should be noted that full functionality cannot be received
        using the more simple method, unless the values for the datatypes are set outside of the new method.
    */

    public Car(String make, String model, int year, double mileage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public Car(String make, String model, int year, double mileage, double price, double gasUsed){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.gasUsed = gasUsed;
        this.calculateGasMileage();
    }

    /*
        Inputs the amount of miles driven in a session and prints it, as well as adding it to the total mileage and
        printing that out as well.
        If the gas mileage for the vehicle is calculated (done automatically with the more advanced overloaded method,
        done manually with the simple method), the method will also print how many gallons of gas were used in this
        drive, as well as add it to the total gas used and printing that as well.
    */

    public void drive(double miles){
        this.setMileage(this.getMileage() + miles);
        System.out.println(miles + " miles have now been driven, making the total mileage now " + this.mileage + " miles.");
        if(this.getGasMileage() > 0){
            this.setGasUsed(this.getGasUsed() + miles/this.getGasMileage());
            System.out.println("Given the gas mileage of the vehicle, " + miles/this.getGasMileage() + " gallons of gas were used, making the total gas used now " + this.getGasUsed() + " gallons.");
        }
    }

    public void calculateGasMileage(){
        this.gasMileage = (this.getMileage()/this.getGasUsed());
    }
    public double getGasMileage(){
        return this.gasMileage;
    }

    public String getMake(){return this.make;}
    public String getModel(){return this.model;}
    public int getYear(){return this.year;}
    public double getPrice(){return this.price;}
    public void setPrice(double price){this.price = price;}

    public double getMileage(){return this.mileage;}
    public void setMileage(double mileage){this.mileage = mileage;}

    public double getGasUsed(){return this.gasUsed;}
    public void setGasUsed(double gasUsed){this.gasUsed = gasUsed;}


    /*
        toString() makes this method redundant. Left in for observation.
     */

//    public void printFields(){
//        System.out.println("Make: " + this.getMake());
//        System.out.println("Model: " + this.getModel());
//        System.out.println("Year: " + this.getYear());
//        System.out.println("Mileage: " + this.getMileage());
//
//        System.out.println("Price: $" + this.getPrice());
//        System.out.println("Gallons of Gas Used: " + this.getGasUsed());
//        System.out.println("Gas Mileage: " + this.getGasMileage());
//    }

    public static void main(String[] args){
        Car vehicle1 = new Car("Nissan","Rogue",2024,1300);
        //vehicle1.printFields();
        vehicle1.drive(50);

        Car vehicle2 = new Car("Ford","F-150",2023,5000, 35000, 200);
        //vehicle2.printFields();
        vehicle2.drive(60);

        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
    }
    public String toString(){
        return "Make: " + this.make
                + "\nModel: " + this.model
                + "\nYear: " + this.year
                + "\nMileage: " + this.mileage
                + (this.getPrice() > 0 ? "\nPrice: $" + this.price : " ")
                + (this.getGasUsed() > 0 ? "\nGallons of Gas Used: " + this.gasUsed : " ")
                + (this.getGasMileage() > 0 ? "\nGas Mileage: " + this.gasMileage : " ");
    }

}
