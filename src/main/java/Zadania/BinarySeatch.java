package Zadania;

import java.util.Arrays;

public class BinarySeatch {
    public static void main(String[] args) {
        int[] searchArray = new int[]{1, 4, 6, 8, 10, 12, 14};

        int number = 12;
        Arrays.sort(searchArray);
        System.out.printf("Binary Search %d in integer array %s %n", number, Arrays.toString(searchArray));
        binarySearch(searchArray, 12);
        System.out.printf("Binary Search %d in integer array %s %n", 43, Arrays.toString(searchArray));
        binarySearch(searchArray, 43);
        searchArray = new int[]{123, 243, 331, 1298};
        number = 331;
        Arrays.sort(searchArray);
        System.out.printf("Binary Search %d in integer array %s %n", number, Arrays.toString(searchArray));
        binarySearch(searchArray, 331);
        System.out.printf("Binary Search %d in integer array %s %n", 331, Arrays.toString(searchArray));
        binarySearch(searchArray, 1333);
        Arrays.sort(searchArray);
        int index = Arrays.binarySearch(searchArray, 3);
    }
    public static void binarySearch(int[] input, int number) {
        int first = 0;
        int last = input.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (input[middle] < number) {
                first = middle + 1;
            } else if (input[middle] == number) {
                System.out.printf(number + " found at location %d %n", middle);
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(number + " is not present in the list.\n");
        }
    }
    public static int binarySearchRecursive(int search, int[] array, int start, int end){

        int middle = (start + end)/2;

        if(end < start){
            return -1;
        }
        if (search < array[middle]){
            return binarySearchRecursive(search, array, start, middle - 1);
        }
        if (search > array[middle]){
            return binarySearchRecursive(search, array, middle + 1, end);
        }
        if (search == array[middle]){
            return middle;
        }
        return -1;
    }
}




