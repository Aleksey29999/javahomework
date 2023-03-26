//Вывести все простые числа от 1 до 1000



package task;

import java.util.Arrays;

public class task2 {

    public static void run() {

        int[] arr = new int[1000];
        for (int i = 2; i < 1000; i++) {

            if ((i % 2 == 0 && i != 2) || (i % 3 == 0 && i != 3) || (i % 5 == 0 && i != 5) || (i % 7 == 0 && i != 7)) {
            } else {
                arr[i] = i;
            }
        }
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] > 0) {
                System.out.printf("%s,", String.valueOf(arr[i]));
            }
        }
    }
}
