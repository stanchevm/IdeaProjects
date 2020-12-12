import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class Tasks {
    public static void main(String[] args) {
        int[] numbers = {3, 7, -1, 8, 25, 16, 9, 3, 13, 2, -44, 59, 102, 3, 7, 5, 25, 25, 3, -25, 7};
//        Task 1
/*        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        String check = "No";
        for (int i=0; i < numbers.length; i++){
            if (numbers[i] == userInput){
                check = "Yes";
                break;
            }
        }
        System.out.println(check);*/
//        Task 2
/*        int mostCommon=0;
        int mostCommonCounter = 0;
        for (int i = 0; i<numbers.length; i++){
            int counter = 0;
            for (int j = 0; j < numbers.length;j++){
                if (numbers[i] == numbers[j]) {
                    counter +=1;
                }
                if (counter>mostCommonCounter) {
                    mostCommonCounter = counter;
                    mostCommon = numbers[i];
                }
            }
        }
        System.out.println("Most common number is " + mostCommon + ", " + mostCommonCounter + " times in total");*/
//        Task 3
/*int smallest=Integer.MAX_VALUE;
int largest=Integer.MIN_VALUE;
for (int i = 0; i < numbers.length; i++){
    if (numbers[i]<smallest){
        smallest = numbers[i];
    }else if (numbers[i]>largest){
        largest = numbers[i];
    }
}
System.out.println("Smallest is " + smallest + " largest is " + largest);*/
//        Task 4
/*        int negativeNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeNumbers += 1;
            }
        }
        int[] arrayNegativeNumbers = new int[negativeNumbers];
        int k = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] < 0) {
                arrayNegativeNumbers[k] = numbers[j];
                System.out.println(arrayNegativeNumbers[k]);
                k++;
            }
        }*/
//        Task 5
/*            int evenNumbers = 0;
        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i]%2 != 0){
                evenNumbers+=1;
            }
        }
        System.out.println("There are "+evenNumbers+" odd numbers");*/
    }
}
