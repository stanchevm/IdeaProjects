import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
//        Task 1
/*        int n = 4578;
        System.out.println(reverseNumber(n,0));
    }
    public static int reverseNumber(int n,int result){
        int temp = n%10;
        if (n>0){
            result = temp + result*10;
            return reverseNumber(n/10,result);
        }
        return result;
    }*/
//        Task 2
/*        int n = 5;
        System.out.println(factorialCalc(n));
    }
    public static long factorialCalc(int factorialNum){
        if (factorialNum >=1) {
            return factorialNum * factorialCalc(factorialNum-1);
        }
        return 1;
    }*/
//        Task 3
/*        String str = "abcdef";
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        if (str.length() == 1){
         return str;
        }
        return str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
    }*/
//        Task 4 - Import from console you name and print out initials
/*        String str1 = "";
        System.out.println(initialsGet(str1));
    }
    public static String initialsGet (String str){
        String[] str2 = str.split(" ");
        String initials = "";
        for (int i = 0; i < str2.length; i++) {
            initials += str2[i].charAt(0);
        }
        return initials;
    }*/
//        Task 5
/*        String str1 = "aaabbBc ddd"; // print array with number of occurences
        str1 = str1.toLowerCase().replaceAll("\\W","");
        int[] myArray = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            myArray[str1.charAt(i)-'a']++;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println((char)(i+'a')+ "-" + myArray[i]);
        }*/
//        Task 6
/*        String str1 = "adam"; // print array with number of occurrences
        String str2 = "main"; // print array with number of occurrences
        str1 = str1.toLowerCase().replaceAll("\\W","");
        str2 = str2.toLowerCase().replaceAll("\\W","");
        int[] myArrayOne = new int[26];
        int[] myArrayTwo = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            myArrayOne[str1.charAt(i)-'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            myArrayTwo[str2.charAt(i)-'a']++;
        }
        if (Arrays.equals(myArrayOne,myArrayTwo)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }*/
//        Task 8
/*        String str = "ghost";
        System.out.println(shortString(str));

    }
    public static String shortString(String str1){
        String str2 = str1.substring(2);
        String first = str1.substring(0,1);
        String second = str1.substring(1,2);

        if (second.equals("h")){
            str2 = second + str2;
        }
        if (first.equals("g")){
            str2 = first + str2;
        }

        return str2;
    }*/
//        Task 9
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please, provide first string: ");
        String str1 = sc.nextLine();

        System.out.println("Please, provide second string: ");
        String str2 = sc.nextLine();
        System.out.println("Is one of the strings at the end of the other? " + checkStrings(str1,str2));
    }
    public static boolean checkStrings(String str1, String str2){
//        first
       int l1 = str1.length();
        int l2 = str2.length();
        boolean result = true;

        if (l1 > l2){
            result  = str2.equalsIgnoreCase(str1.substring(l1-l2));
        } else if (l1 < l2){
            result = str1.equalsIgnoreCase(str2.substring(l2-l1));
        }else {
            result = str1.equalsIgnoreCase(str2);
        }
        return result;
//        second
        str1 =str1.toLowerCase();
        str2 = str2.toLowerCase();
        return str1.endsWith(str2) || str2.endsWith(str1);
    }*/
//        Task 10
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Please, provide a string");
        String str1 = sc.nextLine();
        System.out.println("Please, provide a character");
        String str2 = sc.nextLine();
        System.out.println("Is " + str2 + " happy in the string? " + happyChar(str1,str2));
    }
    public static boolean happyChar (String str1,String str2){
        boolean result = false;
        for (int i = 0; i < str1.length()-1; i++) {
            if (str1.charAt(i)==str1.charAt(i+1)){
                result = true;
                break;
            }
        }
        return result;
    }*/
//        Task 11
/*        Scanner sc = new Scanner(System.in);
        String str1 = "Stara Zagora"; // print array with number of occurrences
        char[] myArrayOne = new char[str1.length()];
        char[] myArrayTwo = new char[str1.length()];
        myArrayOne[0] = str1.charAt(0);
        myArrayTwo[0] = str1.charAt(0);
        for (int i = 1; i < str1.length(); i++) {
            myArrayOne[i] = '_';
            myArrayTwo[i] = str1.charAt(i);
        }

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < str1.length(); j++) {
                System.out.print(myArrayOne[j]);
            }
            System.out.println("");
            if (Arrays.equals(myArrayOne, myArrayTwo)) {
                System.out.println("Great job! You got the word right");
                break;
            } else if (i == 10){
                System.out.println("Sorry, you ran out of tries! Maybe next time :(");
            }else{
                System.out.println("You have " + (10 - i) + " number of tries left!");
                System.out.println("");
                System.out.println("Please enter a letter: ");
                String inputLetter = sc.nextLine();
                char strChar = inputLetter.charAt(0);
                for (int j = 0; j < str1.length(); j++) {
                    if (strChar == str1.charAt(j)) {
                        myArrayOne[j] = strChar;
                    }
                }
            }
        }
    }*/
}
