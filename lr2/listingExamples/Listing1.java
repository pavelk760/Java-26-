package lr2.listingExamples;

import java.util.Arrays; // для сортировки массива
import java.util.Random; // для генерации случайных чисел
import java.util.Scanner; // для ввода данных

public class Listing1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt(); // пользователь задаёт размер
        int[] nums = new int[size]; // создание массива
        Random random = new Random();

        // Заполнение массива случайными числами от 0 до 199
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }

        // Сортировка массива по возрастанию
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Элемент массива [" + i + "] после сортировки = " + nums[i]);
        }
    }
}