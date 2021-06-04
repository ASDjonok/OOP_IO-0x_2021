import java.util.Scanner;
//    C5 == 2 => C5 = '+'
//    C7 == 0 => C7 = double
//    C11 == 3 => C11 = Обчислити суму найбільших елементів кожного рядка матриці

public class Lab_2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double Sum = 0;
        double value;
        int x, y;

        System.out.println("Введи кількість рядків матриць:");
        while (!input.hasNextInt()){
            System.out.println("Введи ціле число!");
            input.next();
        }
        x = input.nextInt();

        System.out.println("Введи кількість стовпців матриць:");
        while (!input.hasNextInt()){
            System.out.println("Введи ціле число!");
            input.next();
        }
        y = input.nextInt();

        double[][] arr_A = new double[x][y];
        double[][] arr_B = new double[x][y];
        double[][] arr_C = new double[x][y];
        System.out.printf("А тепер давай згенеруємо матрицю А! Введи %d цілих чисел або чисел з плаваючою точкою через пробіл:\n", x*y);
        arr_A = Matrix(arr_A, x, y);
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.print(arr_A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.printf("Ітс тайм ту згенерувати матрицю В! Введи ще %d чисел з плаваючою точкою через пробіл:\n", x*y);
        arr_B = Matrix(arr_B, x, y);
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.print(arr_B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Сумуємо дві матриці:");
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                arr_C[i][j] = arr_A[i][j] + arr_B[i][j];
                System.out.printf("%.2f  ", arr_C[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("Трохи магії...");
        System.out.println("\\*****-_-*****/");
        for(int i = 0; i < x; i++){
            value = arr_C[i][0];
            for(int j = 1; j < y; j++){
                if(arr_C[i][j]>value){
                    value = arr_C[i][j];
                }
            }
            Sum += value;
        }
        System.out.printf("%.2f", Sum);
    }
    
    public static double[][] Matrix(double[][] arr, int x, int y){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if (!input.hasNextInt()||!input.hasNextDouble()){
                    System.out.printf("Треба вводити тільки числа типу int або double! Спробуй ще раз: введи %d цілих чисел або чисел з плаваючою точкою через пробіл:\n", x*y);
                    arr = Matrix(arr, x, y);
                    return arr;
                }
                arr[i][j] = input.nextDouble();
            }
            System.out.println();
        }
        return arr;
    }
}
//5,2 1,6 2,3 1,4 8,5 4,2
//7,4 1,5 2,6 8,2 5,3 1,2