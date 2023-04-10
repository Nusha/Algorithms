package Lectures;

import java.util.Arrays;

public class Quicksort {
    public static void quickSort(Integer[] arr, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = arr[(startPosition + endPosition) / 2];
        do {
            while (arr[leftPosition] < pivot) {
                leftPosition++;
            }
            while (arr[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int tmp = arr[leftPosition];
                    arr[leftPosition] = arr[rightPosition];
                    arr[rightPosition] = tmp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);
        if (leftPosition < endPosition) {
            quickSort(arr, leftPosition, endPosition);
        }
        if (startPosition < rightPosition) {
            quickSort(arr, startPosition, rightPosition);
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{4, 6, 9, 0, 8, 7, 5, 2, 1, 3};
        quickSort(array,0,9);
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}
