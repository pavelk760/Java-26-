package timus;
import java.util.Scanner;

public class task_1253 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int result = N * (M + 1);

        System.out.println(result);
        in.close();
    }
}