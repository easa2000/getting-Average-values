import java.util.Scanner;

//Enter 5 numbers as your wish and
// get that Average values...

public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args) {
        int[] myIntegers = getIntegers(5);
        for (int i=0; i<myIntegers.length; i++ ) {
            System.out.println("Element " + i + " typed value was : " + myIntegers[i]);
        }
        System.out.println("The Average Value was : " + getAverage(myIntegers) );
    }

    public static int[] getIntegers(int numbers) {
        System.out.println("Enter " + numbers + " Integers value: ");
        int[] values = new int[numbers];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int arrays[]) {
        int sum = 0;
        for (int i=0; i<arrays.length; i++) {
            sum = arrays[i];
        }
        return (double) sum / (double) arrays.length;
    }

}






















