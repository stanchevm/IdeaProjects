import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {

        System.out.println("Counting sort in Java");
        int[] input = {6, 4, 3, 1, 2, -1, 4, 3, 6, -6, 2, 4, 3, 4};
        //int[] input = {-3,-4,-5,-6,-5,-6,-4,-6,-3,-4,-6,-4,-5,-3,-3};
        //int[] input = {-3, -3};

        System.out.println("integer array before sorting");
        System.out.println(Arrays.toString(input));

        // sorting array using Counting Sort Algorithm
        countingSort(input);
        //sort(input);

        System.out.println("integer array after sorting using counting sort algorithm");
        System.out.println(Arrays.toString(input));
    }

    public static void countingSort(int[] input) {
        // Max element in the input
        // new int[] counterArr using MAX+1
        // using counterArr counting the numbers from input
        // using counterArr sorting put

        int minNumber = input[0];
        int maxNumber = input[0];
        for (int i = 0; i < input.length; i++) {
            if (maxNumber < input[i]) {
                maxNumber = input[i];
            }
            if (minNumber > input[i]) {
                minNumber = input[i];
            }
        }
        System.out.println("Min: " + minNumber + " ,Max: " + maxNumber);
        // {6, 4, 3, 2, -1, 4, 3, -6, 6, 2, 4, 3, 4};
        // counter = {0, 0, 0, 0, 0, 0, 0}
        // counter = {0, 1, 2, 3, 4, 0, 3, 0, 0, 0... 1}
        // input = {1,2,2,3,3,3,4,4,4,4,6,6,6}
        //6 -(-6)= 12
        //-3 - (-6) = -3 + 6 = 3+1
        int[] counterArr = new int[maxNumber - minNumber + 1];
        System.out.println("Counter Arr: " + Arrays.toString(counterArr));

        for (int number : input) {
            counterArr[number - minNumber]++;
        }

        System.out.println(Arrays.toString(counterArr));
        int index = 0;
        for (int i = 0; i < counterArr.length; i++) {
            while (counterArr[i] > 0) {
                System.out.println("i: " + i + " index: " + index + " i+min: " + (i + minNumber));
                input[index] = i + minNumber;
                index++;
                counterArr[i]--;
            }
        }
    }

}
