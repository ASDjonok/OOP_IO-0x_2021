package BRI_lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
           C2 = 1 -- "-"
           C3 = 1 -- "C = 1"
           C5 = 1 -- "/"
           C7 = 0 -- "byte"
           S = (i/j) / (i-C)
        */
        Scanner scanner = new Scanner(System.in);
        int a, b, n, m;

        do {
            System.out.println("Введіть першу нижню межу (від -128 до 127)");
            a = scanner.nextInt();

            System.out.println("Введіть першу верхню межу (від -128 до 127)");
            n = scanner.nextInt();
        } while (a > n);

        do {
            System.out.println("Введіть другу нижню межу (від -128 до 127)");
            b = scanner.nextInt();

            System.out.println("Введіть другу верхню межу (від -128 до 127)");
            m = scanner.nextInt();
        } while (b > m);

        double S = 0;
        final int C = 1;
        boolean div_by_zero = false;
        /*
            byte i = (byte)a
            byte j = (byte)b
            j != 0
            i != C
        */
        l:for (byte i = (byte) a; i <= n; i++) {
            if (i == C) {
                div_by_zero = true;
                break;
            }
            for (byte j = (byte) b; j <= m; j++) {
                if (j == 0) {
                    div_by_zero = true;
                    break l;
                }
                S += (((double) i / j) / (i - C));
            }
        }
        if (div_by_zero) {
            System.out.println("Присутнє ділення на 0!");
        } else {
            System.out.println("Відповідь: " + S);
        }
    }
}
