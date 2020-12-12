import java.util.Scanner;

public class SystemInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*        System.out.println("Please enter a: ");
        int a = sc.nextInt();

        System.out.println("Please enter b: ");
        int b = sc.nextInt();*/

        System.out.println("Please enter a: ");
        float a = sc.nextLong();

        System.out.println("Please enter b: ");
        double b = sc.nextDouble();

        System.out.println(a+b);
    }
}
