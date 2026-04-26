package lr1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;

        System.out.println("Сумма: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Разность: " + num1 + " - " + num2 + " = " + diff);
        in.close();
    }
}

