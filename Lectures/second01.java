package Lectures;

public class second01 {



    public static void main(String[] args) {
        Integer[] array = new Integer[] {4,6,9,0,8,7,5,2,1,3};
        bubbleSort(array);
        for (Integer integer : array) {
            System.out.printf(integer + ", ");
        }

    }

    public static void bubbleSort(Integer[] arr) {
        boolean finish;
        do {

            finish = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    finish = false;
                }
            }
        } while (!finish);
    }
}
