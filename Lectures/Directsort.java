package Lectures;

public class Directsort {

    public static void directSort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }

        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{4, 6, 9, 0, 8, 7, 5, 2, 1, 3};
        directSort(array);
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.printf(array[i] + ", ");
            } else System.out.printf(array[i] + ";");
        }
    }
}
