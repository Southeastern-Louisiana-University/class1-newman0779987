package src;
import java.util.Scanner;
//hw calculate average, display to user, provide latter grade based on ten point scale
public class loopsReview {
    public static void main(String[] args) {
        double grade = 0;
        double sum = 0;
        double count = 0;
        Scanner input = new Scanner(System.in);
        while (grade >= 0) {
            System.out.println("Please input a grade from 0 to 110 (-1 to terminate)");
            grade = input.nextDouble();
            if(grade > 110) {
                System.out.println("Invalid! Must be between 0 and 110");
            }
            else if (grade >= 0){
                calculateGrade(grade);
                sum += grade;
                count++;
            }
            System.out.println("Count is " + count + ", Sum is " + sum);
        }
        System.out.println("The average of your grades is: " + (sum / count));

    }
    public static void calculateGrade(double grade) {
        if (grade > 100){
            System.out.println("Your grade is: A+!");
        } else if (grade >= 90){
            System.out.println("Your grade is: A");
        } else if (grade >= 80){
            System.out.println("Your grade is: B");
        } else if (grade >= 70){
            System.out.println("Your grade is: C");
        } else if (grade >= 60){
            System.out.println("Your grade is: D");
        } else {
            System.out.println("Your grade is: F");
        }
    }
}
