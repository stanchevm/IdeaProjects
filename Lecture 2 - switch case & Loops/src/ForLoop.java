import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;

        for(int i=0; i<3; i++) {
            System.out.println("Enter number "+i);
            n = sc.nextInt();
            sum += n;
        }
        System.out.println(sum);

    }
}
