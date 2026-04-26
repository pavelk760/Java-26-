package timus;

import java.util.Scanner;
import java.util.HashSet;

public class task_1563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine().trim());
        HashSet<String> visited = new HashSet<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String shop = in.nextLine().trim();
            if (visited.contains(shop)) {
                count++;
            } else {
                visited.add(shop);
            }
        }

        System.out.println(count);
        in.close();
    }
}