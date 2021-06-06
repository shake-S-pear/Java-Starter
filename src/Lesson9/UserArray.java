package Lesson9;

import java.util.Arrays;

public class UserArray {

    static int[] userArray(int [] array, int value){

        int w = array.length;
        int [] tempArray = new int [w + 1];

        tempArray[0] = value;
        int j = 1;

        for (int i = 0; i < w; i++){
            tempArray[j] = array[i];
            j++;
        }

        System.out.print("New user's array: ");
        return tempArray;
    }

    public static void main(String[] args){

        int [] arrayCurrent = {1, 3, 5, 7, 9, 11, 13, 15};

        System.out.println(Arrays.toString(userArray(arrayCurrent, 222)));
    }

}