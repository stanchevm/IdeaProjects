import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//        Task 1
/*        for (int i=1; i<101;i++) {
            System.out.println(i);
        }*/
//        Task 2
/*
        for (int i = -20;i<51;i++){
            System.out.println(i);
        }
*/
//        Task 3
/*        for (int i = -10;i<11;i++){
            if (i%2 == 1 || i%2 == -1){
                System.out.println(i);
            }
        }*/
//        Task 4
/*        for (int i = 10; i>0;i--){
            System.out.println(i);
        }*/
//        Task 5
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first number: ");
        int i = sc.nextInt();
        System.out.println("Please, enter second number: ");
        int j = sc.nextInt();
        if (i<j){
            for (int k = i;k<=j;k++){
                System.out.println(k);
            }
        }*/
//        Task 6
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first number: ");
        int i = sc.nextInt();
        int sum = 0;
        for (int k=1;k<=i;k++){
            sum +=k;
        }
        System.out.println(sum);*/
//        Task 7
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter number: ");
        int n = sc.nextInt();
        int k = n*3;
        String comma = ",";
        for (int i = 3; i<=k; i++){
            if (i%3 == 0) {
                if (i!=k) {
                    System.out.print(i + comma);
                } else {
                    System.out.print(i);
                }
            }
        }*/
//        Task 8
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number");
        int i = sc.nextInt();
        int smallest = i;
        int largest = i;
        while (i!=0){
            if (i<smallest){
                smallest = i;
            }
            if (i>largest){
                largest = i;
            }
            System.out.println("Please, enter a number");
            i = sc.nextInt();
        }
        System.out.println("Smallest number is " + smallest);
        System.out.println("Largest number is " + largest);*/
//        Task 11 - not finished
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int k = 0; k<=i; k++){
            for (int l = 0; l <= i-k; l++){
                System.out.print(" ");
            }
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        Task 13
/*        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int hundreds = 0;
        int tens = 0;
        int ones = 0;
        for (int i = 100; i<=999; i++){
            hundreds = i/100;
            tens = i%100;
            tens = tens/10;
            ones = i%10;
            if (hundreds+tens+ones == j){
                System.out.println(i);
            }
        }*/
//        Task 15
/*        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0;
        for (int i = 1; i <=n; i++){
            j +=i;
        }
        System.out.println(j);*/
//        Task 17
    /*    Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int k = 1; k <= i; k++) {
            for (int j = 1; j <= i; j++) {
                if (k==1 || k == i){
                    if (j != i) {
                        System.out.print("*");
                    } else {
                        System.out.println("*");
                    }
                } else {
                    if ( j ==1) {
                        System.out.print("*");
                    }else if (j == i) {
                        System.out.println("*");
                    }else {
                        System.out.print("+");
                    }
                }
            }
        }*/
//        Task 18
/*       Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first number: ");
        int i = sc.nextInt();
        System.out.println("Please, enter first number: ");
        int j = sc.nextInt();
        for (int k = 1; k<=i; k++){
            for (int l = 1; l<=j; l++){
                System.out.println(k+"*"+l+"="+k*l);
            }
        }*/
//        Task 20
/*        for (int i = 1;i<=10;i++){
            for (int j = i;j<=9;j++){
                System.out.print(j);
            }
            for (int k = 1;k<=i;k++){
                if (k<i){
                    System.out.print(k-1);
                }else {
                    System.out.println(k-1);
                }
            }
        }*/
//        Task 21
    /*    Scanner sc = new Scanner(System.in);
        int cardnumber = sc.nextInt();
        cardnumber -=1;
        String cardType = "";
        String cardColor = "";
        int j = cardnumber%4;
        int i = cardnumber/4;

        for (int card = i;card <=12;card++) {
            switch (card) {
                case 0:
                    cardType = "Two";
                    break;
                case 1:
                    cardType = "Three";
                    break;
                case 2:
                    cardType = "Four";
                    break;
                case 3:
                    cardType = "Five";
                    break;
                case 4:
                    cardType = "Six";
                    break;
                case 5:
                    cardType = "Seven";
                    break;
                case 6:
                    cardType = "Eight";
                    break;
                case 7:
                    cardType = "Nine";
                    break;
                case 8:
                    cardType = "Ten";
                    break;
                case 9:
                    cardType = "Jack";
                    break;
                case 10:
                    cardType = "Queen";
                    break;
                case 11:
                    cardType = "King";
                    break;
                case 12:
                    cardType = "Ace";
                    break;
            }
            if (i == card) {
                for (int color = j; color <= 3; color++) {
                    switch (color) {
                        case 0:
                            cardColor = "Clubes";
                            break;
                        case 1:
                            cardColor = "Diamonds";
                            break;
                        case 2:
                            cardColor = "Hearts";
                            break;
                        case 3:
                            cardColor = "Spades";
                            break;
                    }
                    System.out.println(cardType + " of " + cardColor);
                }
            } else {
                for (int color = 0; color <= 3; color++) {
                    switch (color) {
                        case 0:
                            cardColor = "Clubes";
                            break;
                        case 1:
                            cardColor = "Diamonds";
                            break;
                        case 2:
                            cardColor = "Hearts";
                            break;
                        case 3:
                            cardColor = "Spades";
                            break;
                    }
                    System.out.println(cardType + " of " + cardColor);
                }
            }
        }*/
//        Task 23
/*        int i = 1;

        while (i<=9){
            int j = i;
            while (j<=9){
                System.out.print(i + "*" + j + "; ");
                j++;
            }
            System.out.println();
            i++;
        }*/
//        Task 24
   /*     Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int numberIn = sc.nextInt();
        int reverse = 0;
        int palindrom = numberIn;
        int remainder;
        if (numberIn>10 && numberIn<30000) {

            do {
                remainder = palindrom % 10;
                reverse = reverse * 10 + remainder;
                palindrom = palindrom / 10;
            } while (palindrom > 0);
            if (numberIn == reverse) {
                System.out.println(numberIn + " is palindrome");
            } else {
                System.out.println(numberIn + " is NOT a palindrome");
            }
        } else {
            System.out.println("Please enter a number between 10 and 30000");
        }*/
    }
}
