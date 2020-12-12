import jdk.nashorn.internal.ir.WhileNode;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        Task 1
/*        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int[][] array2D = new   int[rows][column];
        for (int i = 0; i< array2D.length;i++){
            for (int j = 0; j< array2D[i].length; j++){
                System.out.println("Please, enter a number at row "+ i + ", column "+j);
                array2D[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array2D));*/
//        Task 2 - get the smallest number in each row
/*        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int[][] array2D = new   int[rows][column];
        int[] smallestArray = new int[rows];
        for (int i = 0; i< array2D.length;i++){
            int smallest = Integer.MAX_VALUE;
            for (int j = 0; j< array2D[i].length; j++){
                System.out.println("Please, enter a number at row "+ i + ", column "+j);
                array2D[i][j] = sc.nextInt();
                if (array2D[i][j]<smallest){
                    smallest = array2D[i][j];
                }
            }
            smallestArray[i] = smallest;
        }
        for (int i = 0;i<smallestArray.length;i++){
            System.out.println("Smallest number in row " + (i+1) + " is " + smallestArray[i]);
        }*/
//        Task 3 - get the smallest number in each column
        int[][] arr = {
                {1,-4,9},
                {0,14,23,9,4,5,6,7,8,9,0},
                {7,1,3,4,-6},
                {3,-10},
                {-1}
        };
        int max_size = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length;i++){ //find what is the highest length of a row in the array
            if (arr[i].length>max_size){
                max_size = arr[i].length;
            }
        }
        int num = 0;
        for (int j = 0;j<max_size;j++){ //use the hi
            int smallestNumber = Integer.MAX_VALUE;
            for (int i = 0;i<arr.length;i++){
                if (arr[i].length>j) {
                    num = arr[i][j];
                    if (num<smallestNumber){
                        smallestNumber = num;
                    }
                }
            }
            System.out.println("Lowest number in column number " + (j+1) + " is "+ smallestNumber);
        }
    }
}
