//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


package task;

import java.time.LocalDateTime;
import java.util.Scanner;

public class task1 {
    public static void run() {
        int res = 0;
        int res1 = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введите число n=");
        String enter;
        enter = iScanner.next();
        int n = Integer.parseInt(enter);


        for (int i = 1; i <= n; i++) {
            res1=0;
            for (int j = 1; j <= i; j++) {
                res1 += j;
            }
            res += res1;
        }
        System.out.println(res);
    }
}

