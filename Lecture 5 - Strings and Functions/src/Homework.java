import java.util.Scanner;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
//        Task 1
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first string");
        String str1 = sc.nextLine();
        System.out.println("Please, enter first string");
        String str2 = sc.nextLine();

        if (str1.length()>40 || str2.length()>40){
            System.out.println("String limit is 40 characters");

        } else {
            System.out.println(str1.toUpperCase());
            System.out.println(str1.toLowerCase());
            System.out.println(str2.toUpperCase());
            System.out.println(str2.toLowerCase());
        }*/
//        Task 2
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first string");
        String str1 = sc.nextLine();
        System.out.println("Please, enter first string");
        String str2 = sc.nextLine();

        if ((str1.length()>20 || str1.length()<1) || (str2.length()>20 || str2.length()<1)){
            System.out.println("String limit is between 10 and 20 characters");

        } else {
            String str3 = new String(str1);
            str1 = str2.substring(0,5)+str1.substring(5);
            str2 = str3.substring(0,5)+str2.substring(5);
            if (str2.length()>str1.length()){
                System.out.println(str2.length());
            } else {
                System.out.println(str1.length());
            }
            System.out.println(str1);
            System.out.println(str2);
        }*/
//        Task 3
//        Task 4
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter names");
        String str1 = sc.nextLine();
        int seperator = str1.indexOf(",");
        String str2 = new String(str1.substring(0,seperator));
        String str3 = new String(str1.substring(seperator+2));
        if (str2.compareToIgnoreCase(str3)<0){
            System.out.println(str2);
        }
        else if (str2.compareToIgnoreCase(str3)>0) {
            System.out.println(str3);
        } else {
            System.out.println("Equal");
        }*/
//        Task 5
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first string");
        String str1 = sc.nextLine();
        System.out.println("Please, enter first string");
        String str2 = sc.nextLine();
        boolean common = false;
        int intersect = 0;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt((j))) {
                    common = true;
                    break;
                }
            }
            if (common){
                intersect = i;
                break;
            }
        }
        System.out.println(intersect);
        if (common) {
            for (int i = 0; i < str1.length(); i++) {
                if (i == intersect) {
                    System.out.println(str2);
                } else {
                    System.out.println(str1.charAt(i));
                }
            }
        }*/
//        Task 7
//        Task 10
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str1 = sc.nextLine();
        String str2 = new String(str1);

        for (int i = 0; i < str1.length(); i++) {
            int ascii = str1.charAt(i);
            ascii +=5;
            char c=(char)ascii;
            System.out.print(c);
        }*/
//        Task 12
/*        int k = 7;
        System.out.println(Arrays.toString(printArray(k)));
    }

    public static int[] printArray(int n){
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }
        return arr;
    }*/
//        Task 13
/*        int[] arrOne = {1,2,3,4,5,4};
        int[] arrTwo = {6,7,8,9,10,12,13};
        System.out.println(Arrays.toString(combinedArray(arrOne, arrTwo)));
    }

    public static int[] combinedArray(int[] a,int[] b){
        int[] arr = new int[a.length+b.length];
        for (int i = 0; i < arr.length; i++) {
            if (i<a.length){
                arr[i] = a[i];
            } else {
                arr[i] = b[i-a.length];
            }

        }
        return arr;
    }*/
//        Task 14
/*        int n = 5;
        System.out.println(factoriel(n));
    }

    public static long factoriel(int n) {
        long total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }*/
    }
}

