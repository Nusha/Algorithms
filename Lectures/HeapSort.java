package Lectures;

import java.util.Arrays;

public class HeapSort {

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            heapify(arr, n, largest);
        }

    }

    public void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 9, 0, 8, 7, 5, 2, 1, 3};
        HeapSort sorting = new HeapSort();
        sorting.heapSort(array);
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}
