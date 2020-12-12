import java.util.Scanner;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
//
//        Task 1
/*      int[] myArray = {-9,123,5,-12,13,156,23234,245};
        int smallest = 0;
        for (int i = 0; i<myArray.length;i++){
            if (myArray[i]%3 == 0){
                if (smallest ==0) {
                    smallest = myArray[i];
                }else if (myArray[i] < smallest){
                    smallest = myArray[i];
                } else{
                    continue;
                }
            }
        }
        System.out.println(smallest);*/
//        Task 2
        int[] myArray = {-9,123,5,-12,13,156,23234,245};
        int[] myArrayTwo = new int[myArray.length];
        for (int i = 0;i<myArray.length/2;i++) {
//            myArrayTwo[i] = myArray[i];
            myArrayTwo[myArray.length/2-1-i] = myArray[i];
        }
        System.out.println(Arrays.toString(myArrayTwo));
//        Task 3
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int n = sc.nextInt();
        int m = 0;
        int[] myArray = new int[10];
        myArray[0] = n;

        for (int i = 1; i<10;i++){
            myArray[i] = n+m; //1+0 = 1
            n = myArray[i];
            m = myArray[i-1];
        }
        for (int i = 0; i<10;i++){
            System.out.println(myArray[i]);
        }*/
//        Task 4
/*        int[] myArray = {3,5,5,3};
        Scanner sc  = new Scanner(System.in);
        int[] myArrayOne = new int[myArray.length/2];
        int[] myArrayTwo = new int[myArray.length/2];
        for (int i = 0;i<myArray.length/2;i++) {
            myArrayOne[i] = myArray[i];
            myArrayTwo[i] = myArray[myArray.length-1-i];
        }
        System.out.println(Arrays.toString(myArrayOne));
        System.out.println(Arrays.toString(myArrayTwo));
        if (Arrays.equals(myArrayOne,myArrayTwo)) {
            System.out.println("Mirror");
        } else {
            System.out.println("Not mirror");
        }*/
//        Task 7
/*        int[] myArray = {-9,123,5,-12,13,156,23234,245};
        int[] myArrayOne = new int[myArray.length];

        for (int i = 0; i< myArray.length; i++){
            if (i == 0 || i == myArray.length-1) {
                myArrayOne[i] = myArray[i];
            }
            else {
                myArrayOne[i] = myArray[i-1] + myArray[i+1];
            }
        }
        System.out.println(Arrays.toString(myArrayOne));*/
//        Task 10
/*        int[] myArray = new int[7];
        double[] myArrayTwo = new double[myArray.length];
        double sum = 0;
        double Avg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        for (int i = 0; i<myArray.length;i++){
            myArray[i] = sc.nextInt();
            sum += myArray[i];
            }
        Avg = sum/myArray.length;
        System.out.println(Avg);
        for (int i = 0; i<myArray.length; i++){
            myArrayTwo[i] = myArray[i]-Avg;
        }
        System.out.println(Arrays.toString(myArrayTwo));*/
//        Task 11
/*        int[] myArray = new int[7];
        int[] myArrayTwo = new int[myArray.length];
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        for (int i = 0; i<myArray.length;i++){
            myArray[i] = sc.nextInt();
            if (myArray[i]%5 == 0 && myArray[i] >5){
                myArrayTwo[counter] = myArray[i];
                counter ++;
            }
        }
        for (int i = 0;i<myArrayTwo.length; i++){
            if (myArrayTwo[i] != 0) {
                System.out.print(myArrayTwo[i] + " ");
            }
        }
        System.out.print("- "+ counter + " numbers");*/
//        Task 13
/*        int[] myArray = {1,3,2,4,3,7};
        boolean check = true;
        for (int i = 1 ;i<myArray.length-2;i++){
            if (!(myArray[i]>myArray[i-1] && myArray[i]>myArray[i+1] && myArray[i+1]<myArray[i+2])){
                check = false;
                break;
            }
        }
        System.out.println(check);*/

//        Task 14
/*        int[] myArrayOne = {18,19,32,1,3, 4, 5, 6, 7, 8};
        int[] myArrayTwo = {1, 2, 3,4,5,16,17,18,27,11};
        int[] myArrayThree = new int[myArrayOne.length];
        int num = 0;
        for (int i = 0; i<myArrayOne.length; i++){
            if (myArrayOne[i]>myArrayTwo[i]){
                myArrayThree[i] = myArrayOne[i];
            }else if (myArrayOne[i]<myArrayTwo[i]){
                myArrayThree[i] = myArrayTwo[i];
            }
        }
        System.out.println(Arrays.toString(myArrayThree));*/
    }
}
