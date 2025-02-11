package src;
import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private int year;
    private double mileage;

    public Car(String make, String model, int year, double mileage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }
    public void drive(double miles){
        this.mileage += miles;
        System.out.println(miles + " miles have been driven, making the total mileage now " + this.mileage);
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public double getMileage(){
        return this.mileage;
    }
    public void printFields(){
        System.out.println(this.getMake());
        System.out.println(this.getModel());
        System.out.println(this.getYear());
        System.out.println(this.getMileage());
    }

    public static void main(String[] args){
        Car vehicle1 = new Car("Nissan","Rogue",2024,10);
        vehicle1.printFields();
        vehicle1.drive(50);
    }
}
