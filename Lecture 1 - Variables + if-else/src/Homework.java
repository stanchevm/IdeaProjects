import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

//        Task 1
        Scanner sc = new Scanner(System.in);
 /*       System.out.println("Please enter a: ");
        double a = sc.nextLong();

        System.out.println("Please enter b: ");
        double b = sc.nextLong();

        System.out.println("Please enter c: ");
        double c = sc.nextLong();


        if (a<b) {
            if (a < c && b > c) {
                System.out.println(String.format("Number %s is between %s and %s", c, a, b));
            } else {
                System.out.println(String.format("Number %s is not between %s and %s", c, a, b));
            }
        }
        if (a>b) {
            if (a > c && b < c) {
                System.out.println(String.format("Number %s is between %s and %s", c, a, b));
            } else {
                System.out.println(String.format("Number %s is not between %s and %s", c, a, b));
                }
            }*/


//        Task 2

/*        System.out.println("Please enter a: ");
        double a = sc.nextLong();

        System.out.println("Please enter b: ");
        double b = sc.nextLong();
        double c = 0;
        System.out.println(String.format("Original numbers are %s and %s",a,b));
        c = b;
        b = a;
        a = c;
        System.out.println(String.format("Reversed numbers are %s and %s",a,b));*/

//        Task 5

/*        double highestNumber = 0;

        System.out.println("Please enter a: ");
        double a = sc.nextLong();
        highestNumber = a;

        System.out.println("Please enter b: ");
        double b = sc.nextLong();
        if(b>a) {
            highestNumber = b;
        }

        System.out.println("Please enter c: ");
        double c = sc.nextLong();
        if(c>a && c>b) {
            highestNumber = c;
        }

        System.out.println(String.format("Highest number is %s", highestNumber));*/

        //        Task 7

/*        System.out.println("Please enter hour: ");
        int a = sc.nextInt();

        System.out.println("Please enter amount of money: ");
        double b = sc.nextDouble();

        System.out.println("Please enter cif healthy - True or False ");
        boolean c = sc.nextBoolean();

        if(c == true) {
            System.out.println("I am sick and I will not go out");

            if (b > 0) {
                System.out.println("I will by medicine");
            } else {
                System.out.println("I will stay and home and drink tea");
            }
        }else {
            if (b<10){
                System.out.println("I will have coffee with friends");
            }
            else {
                System.out.println("I will go to the movies with friends");
            }
            }
        }
    }*/

//    Task 8

        boolean leapYear = false;
        System.out.println("Please enter day: ");
        int day = sc.nextInt();
/*        if (day<1 || day>31){
            System.exit();
        }*/

        System.out.println("Please enter month: ");
        int month = sc.nextInt();
/*        if (month<1 || month>12){
            System.exit();
        }*/

        System.out.println("Please enter year: ");
        int year = sc.nextInt();
        if (year%4 == 0 || year%400 == 0){
            leapYear = true;
        }


        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (month!=12) {
                if(day !=31){
                    day = day + 1;
                }else{
                    day = 1;
                    month = month +1;
                }
            } else {
                if(day !=31){
                    day = day + 1;
                }else{
                    day = 1;
                    month = 1;
                }
            }
        }else if (month == 4 || month == 6 || month == 9 || month == 11 ){
            if(day !=30){
                day = day + 1;
            }else{
                day = 1;
                month = month +1;
            }

        }else if (month == 2) {
            if (leapYear){
                if(day !=29){
                    day = day + 1;
                }else{
                    day = 1;
                    month = month +1;
                }
            }else{
                if(day !=28){
                    day = day + 1;
                }else{
                    day = 1;
                    month = month +1;
                }
            }
        }
        System.out.println(String.format("Next day is %s-%s-%s",day,month,year));
    }
}
