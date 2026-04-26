package lr1;

import java.util.Scanner;
import java.time.Year;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = in.nextLine();

        System.out.print("Введите год рождения: ");
        int birthYear = in.nextInt();

        int age = Year.now().getValue() - birthYear;

        System.out.println(name + ", ваш возраст: " + age + " лет");
        in.close();
    }
}