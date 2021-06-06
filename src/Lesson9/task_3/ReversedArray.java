package JavaStarterLesson9;

import java.util.Arrays;

public class ReversedArray {

static int [] myReverse(int [] array){

    int a = array.length;
    int [] tempArray = new int [a];
    int f = 0;

    System.out.print("Reverse order: " );

    for (int i = a - 1; i > -1; i--) {
        tempArray[f] = array[i];
        f++;
    }
    return tempArray;
}

static int [] subArray(int [] array, int index, int count){

    int a2 = array.length;
    int [] tempArray2 = new int [count];
    int z = 0;

    System.out.print("New subarray: " );

    for (int j = index - 1; j < index - 1 + count; j++) {
        if (j >= a2) {
            tempArray2[z] = 1;
        } else {
            tempArray2[z] = array[j];
        }
        z++;
    }
    return tempArray2;

}

public static void main(String[] args){

    int [] array1 = {1, 2, 3, 4, 5, 6, 7};

    System.out.println(Arrays.toString(myReverse(array1)));
    System.out.println(Arrays.toString(subArray(array1, 4, 7)));

}

}
