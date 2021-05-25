package IO_00._00_Алещенко_Олексій_Вадимович;

import IO_00._00_Алещенко_Олексій_Вадимович.lab6.Monocotyledons;

import java.util.Scanner;

public class Lab1 {
    static int myField;
    public static void main(String[] args) {
//        goto();
        int myInteger = 1;
        Integer myIntegerObject = Integer.valueOf(1);
        MyClass myClass = new MyClass();
        myClass.setValue(1);

        myField = 1;
        changeInt(myInteger);
        changeIntObject(myIntegerObject);
        changeMyClass(myClass);
        System.out.println("myInteger = " + myInteger);
        System.out.println("myIntegerObject = " + myIntegerObject);
        System.out.println("myClass = " + myClass.getValue());
        System.out.println("myField = " + myField);

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
        /*System.out.println("1/2 = " + 1.0/2);*/

        System.out.println("1|2 = " + (1|2));
        System.out.println("true | false = " + (true | false));
        System.out.println("true || false = " + (true || false));

        /*
        01
        |
        10
        --
        11
        */

//        j != 0; i != -C
//        todo & vs. &&
//        todo try/catch
        if ((a <= -C && -C <= n) || (b <= 0 && 0 <= m)) {
            System.out.println("Error division by zero!");
        } else {
//        int wasError = 0;
        /*System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
//        int integer = Integer.getInteger("1");
        boolean wasError = false;*/
//        boolean bool = false;
//        myLabel: for (char i = (char) a; i <= n; i++) {
            for (char i = (char) a; i <= n; i++) {
                for (char j = (char) b; j <= m; j++) {
                   /* if ((i + C == 0) || (j == 0)) { // 0|x=x; 1|x=1
                        System.out.println("Error");
                        wasError = true;
                        break myLabel;
                    } else {*/
                        result += ((double)i/j)/(i+C);
    //                }
                }
                /*if (wasError) {
                    break;
                }*/
            }
            System.out.println(result);
        }


    }

    private static void changeMyClass(MyClass myClass) {
        myClass.setValue(2);
    }

    static void changeInt(int i) {
        i++;
        myField++;
        System.out.println("i = " + i);
        System.out.println("myField = " + myField);
    }
    static void changeIntObject(Integer i) {
        i++;
        myField++;
        System.out.println("i = " + i);
        System.out.println("myField = " + myField);
    }
}

class MyClass {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
