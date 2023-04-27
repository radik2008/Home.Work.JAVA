//1. Реализовать алгоритм обратной сортировки списков компаратором.
//2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
//4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
//5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
//6. Повторить пятый пункт но с LinkedList.
//7. Сравнить время работы пятого и шестого пунктов.


import java.util.*;

public class task2 {
    public static void main(String[] args) {
        System.out.println(" ");
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 7; i++) myList.add(new Random().nextInt(10, 100));

        System.out.println("1. Реализовать алгоритм обратной сортировки списков компаратором.");
        System.out.println(myList + " Было");
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList + " Стало");

        System.out.println(" ");
        System.out.println("2. Пусть дан произвольный список целых чисел, удалить из него чётные числа.");
        for (int i = 0; i < 9; i++) myList.add(new Random().nextInt(10, 100));
        System.out.println(myList + " Было");
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                myList.remove(i);
                i--;
            }
        }
        System.out.println(myList + " Стало");

        System.out.println(" ");
        System.out.println("3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.");
        for (int i = 0; i < 9; i++) myList.add(new Random().nextInt(10, 100));
        System.out.println(myList);
        int sum = 0;
        for (int item : myList) sum += item;
        int average = Math.round((float) sum / myList.size());
        System.out.println(Collections.max(myList) + "-Max");
        System.out.println(Collections.min(myList) + "-Min");
        System.out.println(average + " -Average");

        System.out.println(" ");
        System.out.println("4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.");
        ArrayList<Integer> List1 = new ArrayList<>();
        for (int i = 0; i < 7; i++) List1.add(new Random().nextInt(1, 10));
        System.out.println(List1 + " First list");
        ArrayList<Integer> List2 = new ArrayList<>();
        for (int i = 0; i < 7; i++) List2.add(new Random().nextInt(1, 10));
        System.out.println(List2 + " Second list");
        List2.removeAll(List1);
        List1.addAll(List2);
        System.out.println(List1 + " - Result");

        System.out.println(" ");
        System.out.println("5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.");
        long start = System.currentTimeMillis();
        ArrayList<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 100000; i++) list5.add(0, 0);
        long finish = System.currentTimeMillis();

        System.out.println(" ");
        System.out.println("6. Повторить пятый пункт но с LinkedList.");
        long start2 = System.currentTimeMillis();
        LinkedList<Integer> list6 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) list5.add(0, 0);
        long finish2 = System.currentTimeMillis();

        System.out.println(" ");
        System.out.println("7. Сравнить время работы пятого и шестого пунктов.");
        System.out.println((finish-start) + " время работы пятого пункта");
        System.out.println((finish2-start2) + " время работы шестого пункта");

    }
}