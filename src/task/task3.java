//Реализовать простой калькулятор Использовать сканнер: Scanner scanner = new Scanner(System.in);
//String enter = scanner.next(); int i = Integer.parseInt(enter);

package task;

import java.io.IOException;
import java.util.Scanner;

public class task3 {
    public static void run() throws IOException {
        double res = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введите первое число n=");
        String enter1;
        enter1 = iScanner.next();
        int n = Integer.parseInt(enter1);

        System.out.printf("введите значение действия =");
//        char enter2 = iScanner.next();
        char enter2 = (char) System.in.read();
//        int n = String.parseInt(enter);

        System.out.printf("введите второе число n=");
        String enter3;
        enter3 = iScanner.next();
        int m = Integer.parseInt(enter3);

        if (enter2 == '+') {
//            System.out.println(m + n)
            res = m + n;
        }
        if (enter2 == '-') {
            res = m - n;
        }
        if (enter2 == '*') {
            res = m * n;
        }
        if (enter2 == '/') {
            res = n / m;
        }

        System.out.println(res);
    }
}
