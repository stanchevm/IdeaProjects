import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
//        Write a function to generate random array of size n
/*        int n = 4;
        int[] arrTwo = RandomArray(n);
        arrTwo[0] = 5;
        System.out.println(Arrays.toString(arrTwo));

    }
    public static int[] RandomArray(int size){
        int arr[] = new int[size];
        return arr;
    }*/
//        Task 3 - Write a function to multiply two arrays A and B
/*        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(MultiplyArrays(arr1,arr2)));

    }
    public static int[] MultiplyArrays(int[] a,int[] b){
        int[] arrMultiplied = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arrMultiplied[i] = a[i]*b[i];
        }
        return arrMultiplied;
    }*/
//        Task 4 - Write a function to find the n-th number of Fibonachi sequence
/*        int n = 9;
        System.out.println(fibNumber(n));
    }
    public static int fibNumber(int n){
        int one = 0;
        int two = 1;
        int fn = 0;
        for (int i = 3; i <= n; i++) {
            fn = one + two;
            one = two;
            two = fn;
        }
        return fn;
    }*/
//        Task 5 - Write a function to find n! factorial
        int n = 2000;
        System.out.println(factorial(n));
    }

    public static long factorial(int n){
        long total = 1;
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        return total;
    }
}


