package JavaStarterLesson9;

public class Arrays {

    public static void main(String[] args){

//  reverse order
        byte [] array1 = {5, 6, 7, -7, -9, 2, 0, 11, -35, 5};

        System.out.print("Reverse order :  " );

        for (int i = array1.length - 1; i > -1; i--) {
            System.out.print(array1[i] + " " );
        }

        System.out.println("" );

//  minimum value
        int min = array1[0];

        for (int j = 0; j < array1.length; j++) {

            if (array1[j] < min) {
                min = array1[j];
            }
        }

        System.out.println("The minimum value of the array is: " + min);

//  maximum value
        int max = array1[0];

        for (int g = 0; g < array1.length; g++) {

            if (array1[g] > max) {
                max = array1[g];
            }
        }

        System.out.println("The maximum value of the array is: " + max);

    }
}

