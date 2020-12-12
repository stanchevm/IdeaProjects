import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {2, 31, 15, 42, -4, 200, 1, 45, 36, -2};

        System.out.println("Array Before Bubble Sort\n" + Arrays.toString(arr));

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort\n" + Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        /* Not optimized

            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j - 1] > arr[j]) {
                        //swap elements
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
         */

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 1; j < arr.length - i; j++) {
                counter++;
                if (arr[j-1] > arr[j]) {
                    arr[j-1] += arr[j];
                    arr[j] = arr[j-1] - arr[j];
                    arr[j-1] = arr[j-1] - arr[j];
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println("Number of iterations: " + counter);
    }
}
