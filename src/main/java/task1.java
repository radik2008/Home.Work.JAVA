//Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
//        *Пункты реализовать в разных методах
//
//        int i = new Random().nextInt(k); //это кидалка случайных чисел!)


import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2001);
        System.out.println(i + "   1. Выбросить случайное целое число");
        System.out.println(" ");

        int n = Integer.toBinaryString(i).length() - 1;
        System.out.println(n + "   2. Посчитать и сохранить в n номер старшего значащего бита");
        System.out.println(" ");


        int[] m1 = new int[(Short.MAX_VALUE - i) / n + 1];
        int index = 0;
        for (int j = i; j <= Short.MAX_VALUE; j += 1) {
            if (j % n == 0) {
                m1[index] = j;
                index += 1;
            }
        }
        System.out.println(Arrays.toString(m1) + "   3. Найти все кратные n числа");
        System.out.println(" ");


        int[] m2 = new int[(i - Short.MIN_VALUE) / n + 1];
        int ind = 0;
        for (int j = Short.MIN_VALUE; j <= i; j += 1) {
            if (j % n != 0) {
                m2[ind] = j;
                ind += 1;
            }
        }
        System.out.println(Arrays.toString(m2) + "   4. Найти все некратные n числа");

    }
}
