import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        //user inputs numbers and at the end prin the sum of these numbers. When the user enters 0 no more numbers
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        int n = 0;
        while (true) {
            n = sc.nextInt();
            if (n==0){
                break;
            }
            if (n%2 == 0) {
                sum *=n;
            }
        }
        System.out.println(sum);

    }
}
