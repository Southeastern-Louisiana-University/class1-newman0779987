package src;

public class ArrayReview {
    public static void main (String[] args){
        // elementType arrayRefVar[];
        double[] doubleArray = new double[10];

        System.out.println("Before: ");
        printArray(doubleArray);

        for(int i = 0; i < doubleArray.length; i++){
            doubleArray[i] = i;
        }

        System.out.println("After: ");
        printArray(doubleArray);
        System.out.println(sumArray(doubleArray));
    }
    public static void printArray(double[] anyArray){
        //code in the function
        for(int i = 0; i < anyArray.length; i++){
            System.out.println("Value of anyArray[" + i + "] is: " + anyArray[i]);
        }
    }

    public static double sumArray(double[] anyArray){
        double sum = 0;
        for(int i = 0; i < anyArray.length; i++){
            sum += anyArray[i];
        }
        return sum;
    }
}
