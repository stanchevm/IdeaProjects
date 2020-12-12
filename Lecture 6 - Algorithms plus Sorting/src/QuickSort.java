import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 4, 2};

        System.out.println("Array Before Quick Sort\n" + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);//sorting array elements using quick sort

        System.out.println("Array After Quick Sort\n" + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int begin, int end) {
        if (begin >= end || Math.abs(begin - end) == 1) {
            return;
        }

        int pivotIndex = partition(arr, begin, end);

        quickSort(arr, 0, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivotIndex = begin;
        int pivot = arr[end];

        for (int i = begin; i < end; i++) {
            if (pivot >= arr[i]) {
                int temp = arr[pivotIndex];
                arr[pivotIndex] = arr[i];
                arr[i] = temp;

                pivotIndex++;
            }
        }

        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[end];
        arr[end] = temp;

        return pivotIndex;
    }
}
