package lr3.Task9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int size = 17_000_000; // 17 * 1_000_000

        // Создание коллекций
        List<Integer> arrayList = new ArrayList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();

        // Заполнение коллекций
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            arrayDeque.add(i);
            treeMap.put(i, i);
        }

        // 1. Добавление в начало
        long start = System.nanoTime();
        arrayList.add(0, 100);
        long end = System.nanoTime();
        System.out.println("ArrayList добавление в начало: " + (end - start) + " ns");

        start = System.nanoTime();
        arrayDeque.addFirst(100);
        end = System.nanoTime();
        System.out.println("ArrayDeque добавление в начало: " + (end - start) + " ns");

        // TreeMap - нет операции "в начало"

        // 2. Добавление в конец
        start = System.nanoTime();
        arrayList.add(100);
        end = System.nanoTime();
        System.out.println("ArrayList добавление в конец: " + (end - start) + " ns");

        start = System.nanoTime();
        arrayDeque.addLast(100);
        end = System.nanoTime();
        System.out.println("ArrayDeque добавление в конец: " + (end - start) + " ns");

        start = System.nanoTime();
        treeMap.put(size + 1, 100);
        end = System.nanoTime();
        System.out.println("TreeMap добавление в конец: " + (end - start) + " ns");

        // 3. Добавление в середину
        start = System.nanoTime();
        arrayList.add(size / 2, 100);
        end = System.nanoTime();
        System.out.println("ArrayList добавление в середину: " + (end - start) + " ns");

        // ArrayDeque - не поддерживает добавление в середину

        start = System.nanoTime();
        treeMap.put(size / 2, 100);
        end = System.nanoTime();
        System.out.println("TreeMap добавление в середину: " + (end - start) + " ns");

        // 4. Удаление из начала
        start = System.nanoTime();
        arrayList.remove(0);
        end = System.nanoTime();
        System.out.println("ArrayList удаление из начала: " + (end - start) + " ns");

        start = System.nanoTime();
        arrayDeque.removeFirst();
        end = System.nanoTime();
        System.out.println("ArrayDeque удаление из начала: " + (end - start) + " ns");

        // TreeMap - удаление первого элемента (минимальный ключ)
        start = System.nanoTime();
        treeMap.remove(treeMap.keySet().iterator().next());
        end = System.nanoTime();
        System.out.println("TreeMap удаление из начала: " + (end - start) + " ns");

        // 5. Удаление из конца
        start = System.nanoTime();
        arrayList.remove(arrayList.size() - 1);
        end = System.nanoTime();
        System.out.println("ArrayList удаление из конца: " + (end - start) + " ns");

        start = System.nanoTime();
        arrayDeque.removeLast();
        end = System.nanoTime();
        System.out.println("ArrayDeque удаление из конца: " + (end - start) + " ns");

        // TreeMap - удаление последнего элемента (максимальный ключ)
        start = System.nanoTime();
        treeMap.remove(treeMap.keySet().stream().max(Integer::compare).get());
        end = System.nanoTime();
        System.out.println("TreeMap удаление из конца: " + (end - start) + " ns");

        // 6. Удаление из середины
        start = System.nanoTime();
        arrayList.remove(size / 2);
        end = System.nanoTime();
        System.out.println("ArrayList удаление из середины: " + (end - start) + " ns");

        // ArrayDeque - не поддерживает удаление из середины

        start = System.nanoTime();
        treeMap.remove(size / 2);
        end = System.nanoTime();
        System.out.println("TreeMap удаление из середины: " + (end - start) + " ns");

        // 7. Получение по индексу
        int index = size / 2;

        start = System.nanoTime();
        arrayList.get(index);
        end = System.nanoTime();
        System.out.println("ArrayList получение по индексу: " + (end - start) + " ns");

        // ArrayDeque - не поддерживает доступ по индексу

        start = System.nanoTime();
        treeMap.get(index);
        end = System.nanoTime();
        System.out.println("TreeMap получение по индексу: " + (end - start) + " ns");
    }
}