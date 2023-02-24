package com.cydeo;

public class BinarySearch {
    public static void main(String[] args) {


    }

    public static int binarySearch(int[] number, int numberToFind) {

        int low = 0; //indicates index 0
        int high = number.length - 1; //indicates last index

        while (low <= high) {  //while Loop works until low and high number do not meet each other and eventually cross.
            int middlePosition = ((low + high) / 2); //indicates middle index
            int middleNumber = number[middlePosition]; //middle number equals the index number which is in the middle position.

            if (numberToFind == middleNumber) { //if it finds the number loop returns the value and stops working;
                return middlePosition;
            }

            if (numberToFind < middleNumber) { //now we check if the number is below that middleNumber or not.
                high = middleNumber - 1; //if it is
            } else {
                low = middleNumber + 1;
            }
        }
        return -1;

    }
}