package Lectures;

public class Simplesearch {
    public static Integer find(Integer[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
    return -1;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{4, 6, 9, 0, 8, 7, 5, 2, 1, 3};

        System.out.println("index: " +   find(array, 0));
    }
}
