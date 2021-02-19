package IO_00._00_Алещенко_Олексій_Вадимович;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value for 'a':");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Wrong input!");
        }
        int a = scanner.nextInt();
//      todo check is it necessary
        scanner.close();
        System.out.println(a);
*/
//        Scanner scanner = new Scanner(System.in);
//        char c = (char) scanner.nextShort();
//        char c = scanner.nextLine().charAt(0);

        /*char c = 5;
        System.out.println((int) c);
        c += 9;
//        scanner.close();
        System.out.println(c);
        System.out.println((int) c);*/


        int a = 1;
        int b = 1;
        int n = 2;
        int m = 2;

//        todo check case for constant in JCC
        final int C = 1;

        double result = 0;
        System.out.println("1/2 = " + 1.0/2);

//        j != 0; i != -C
//        todo & vs. &&
//        todo try/catch
        if (a <= -C && -C <= n || b <= 0 && 0 <= m) {
            System.out.println("Error division by zero!");
        } else {
            for (char i = (char) a; i <= n; i++) {
                for (char j = (char) b; j <= m; j++) {
                    result += ((double)i/j)/(i+C);
                }
            }
            System.out.println(result);
        }


    }
}
