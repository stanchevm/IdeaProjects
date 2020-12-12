import java.util.Scanner;

public class WhileLoopTask {
    public static void main(String[] args) {
        //in a while loop, apply three numbers and at the end print sum
        Scanner sc = new Scanner(System.in);
        int index = 3;
        int sum = 0;
        while(index>0) {
            int i = sc.nextInt();
            sum += i;
            index--;
        }
        System.out.println(sum);

    }
}
