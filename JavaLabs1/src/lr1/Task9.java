package lr1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        int prev = num - 1;
        int next = num + 1;
        int sum = prev + num + next;
        int square = sum * sum;

        System.out.println("Последовательность: " + prev + ", " + num + ", " + next);
        System.out.println("Квадрат суммы (" + prev + " + " + num + " + " + next + ")^2 = " + square);
        in.close();
    }
}