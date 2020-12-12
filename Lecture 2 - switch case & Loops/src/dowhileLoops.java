import java.util.Scanner;

public class dowhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = 0;
        int sum=0;
        do {
                n = sc.nextInt();
                sum +=n;
                i++;
            }while(i<3);
        System.out.println(sum);
    }
}
