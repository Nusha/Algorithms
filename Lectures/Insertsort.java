package Lectures;

public class Insertsort {
    public static void insertSort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{4, 6, 9, 0, 8, 7, 5, 2, 1, 3};
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.printf(array[i] + ", ");
            } else System.out.printf(array[i] + ";");
        }
    }
}
