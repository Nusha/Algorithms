package Lectures;

import java.util.Arrays;

public class Binarysearch {
    public static int binarySearch(Integer[] arr, int value, int min, int max) {
        if (max < min) {
            return -1;
        } else {
            int mid = (max - min) / 2 + min;
            if (arr[mid] < value) {
                return binarySearch(arr, value, mid + 1, max);
            } else {
                if (arr[mid] > value) {
                    return binarySearch(arr, value, min, mid - 1);
                } else return mid;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{4, 6, 9, 0, 8, 7, 5, 2, 1, 3};
        Arrays.sort(array);
        System.out.println("array = " + Arrays.toString(array));
        System.out.println(binarySearch(array,4, 0, array.length-1));
    }
}
