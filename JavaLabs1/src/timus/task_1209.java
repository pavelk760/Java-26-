package timus;

import java.util.Scanner;

public class task_1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            long K = in.nextLong();
            long d = 8 * K - 7;
            long sqrt = (long) Math.sqrt(d);
            if (sqrt * sqrt == d && sqrt % 2 == 1) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString().trim());
        in.close();
    }
}