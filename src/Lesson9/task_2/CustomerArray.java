package JavaStarterLesson9;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerArray {

    public static void main(String[] args){

        System.out.println("Enter the number of elements in the array: ");
        Scanner in = new Scanner(System.in);
        int numberOfElements = in.nextInt();

        int [] arrayXXL = new int [numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            System.out.println("Enter the " + i + " element in the array: ");
            Scanner inA = new Scanner(System.in);
            arrayXXL[i] = inA.nextInt();
        }

        System.out.print("This array is: ");
        System.out.println(Arrays.toString(arrayXXL));

// min
        int min = arrayXXL[0];

        for (int j = 0; j < arrayXXL.length; j++) {

            if (arrayXXL[j] < min) {
                min = arrayXXL[j];
            }
        }

        System.out.println("The minimum value of the array is: " + min);

// max
        int max = arrayXXL[0];

        for (int f = 0; f < arrayXXL.length; f++) {

            if (arrayXXL[f] > max) {
                max = arrayXXL[f];
            }
        }

        System.out.println("The maximum value of the array is: " + max);

// sum

        int sum = 0;

        for (int d = 0; d < arrayXXL.length; d++) {

                sum += arrayXXL[d];
        }

        System.out.println("The sum of all elements of the array is: " + sum);

// average

        int average = sum / numberOfElements;

        System.out.println("The average value of all elements of the array is: " + average);

// odd elements

        System.out.print("Odd elements of the array: ");
        for (int r = 0; r < arrayXXL.length; r++) {

            if (arrayXXL[r] % 2 != 0) {
                System.out.print(" " + arrayXXL[r]);
            }
        }
    }
}