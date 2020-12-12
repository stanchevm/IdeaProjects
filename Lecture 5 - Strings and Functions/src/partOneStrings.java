import java.util.Arrays;
import java.util.Scanner;

public class partOneStrings {
    public static void main(String[] args) {
/*        char[] ch ={'J','a','v','a'};
        System.out.println(ch);
        System.out.println(Arrays.toString(ch));*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first string: ");
//        String str1 = sc.nextLine();
//        System.out.println("Enter second string: ");
//        String str2 = sc.nextLine();
//        System.out.println(str1==str2); //content is the same, but reference is not

/*
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String(s2);
        String s4 = null;
        System.out.println(s1==s2); //content and reference are the same
        System.out.println(s2==s3); //content is the same, but reference is not
*/

        //Compare strings for real this time
/*        System.out.println(".equals() " + s3.equals(s2)); //boolean
        System.out.println(".equalsIgnoreCase() " + s3.equalsIgnoreCase(s2)); //case unsensitive, boolean
        System.out.println("compareTo() " + s1.compareTo(s2)); //compares all characters and puts out total number of difference, integer. If number is positive first string is igger than second string
        System.out.println("compareTo() " + s2.compareTo(s1)); //compares all characters and puts out total number of difference, integer. If number is positive first string is igger than second string
        System.out.println("compareToIgnoreCase() " + s2.compareToIgnoreCase(s2));
        System.out.println(".equals() " + s4.equals(s1)); //returns error, s4 has no value to be compared
        System.out.println(".equals() " + s1.equals(s4)); //compares s1 to null and returns false*/
        //Concatenation
        String s1 = "abc";
        String s2 = "def";
        String s3 = null;
//        String s4 = s1+s2;
        String s4 = s1.concat(s2);
        System.out.println(s4);
        String s5 = s3+s1;
        System.out.println(s5);
//        String s6 = s3.concat(s1);
//        System.out.println(s6); //returns NullPointerException as we cannot cast a method to a string
        String s7 = "";
        for (int i = 0; i<10;i++){
            s7 += i + ", ";       // create new string every time, first is 0,; second is 0,1,; etc.
        }
        StringBuilder sd = new StringBuilder("My array is ");

        for (int i = 0; i<10;i++){
            sd.append(i + ", ");       // create new string every time, first is 0,; second is 0,1,; etc.
        }
        System.out.println(sd.toString());
    }
}
