package BRI_lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
	        C5 = 1 -> C = Bт
	        C7 = 0 -> type of elements - double
	        C11 = 4 -> Обчислити суму найбільших елементів в рядках матриці з парними номерами та найменших елементів в рядках матриці з непарними номерами
	    */

        System.out.println("Enter total rows and columns:");

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        double[][] array_b = new double[row][column];
        double[][] array_c = new double[column][row];

        System.out.println("Enter matrix:");

        // Creating matrix B
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                array_b[i][j] = scanner.nextDouble();
                System.out.print(" ");
            }
        }

        // Printing matrix B
        System.out.println("Matrix B:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(array_b[i][j]+" ");
            }
            System.out.println(" ");
        }

        // Transposing
        for(int i = 0; i < column; i++) {
            for(int j = 0; j < row; j++) {
                array_c[i][j] = array_b[j][i];
            }
        }

        // Printing matrix C
        System.out.println("Matrix C:");
        for(int i = 0; i < column; i++) {
            for(int j = 0; j < row; j++) {
                System.out.print(array_c[i][j]+" ");
            }
            System.out.println(" ");
        }

        // Let's get the sum of the biggest elements in the even rows
        double sum_of_biggest = 0;
        for(int i = 1; i < column; i += 2) {
            double max = Double.MIN_VALUE;
            for(int j = 0; j < row; ++j) {
                if (array_c[i][j] > max) {
                    max = array_c[i][j];
                    System.out.println(max);
                }
            }
            sum_of_biggest += max;
        }

        System.out.println("Sum of biggest: " + sum_of_biggest);

        // Let's get the sum of the smallest elements in the odd rows
        double sum_of_smallest = 0;
        for(int i = 0; i < column; i += 2) {
            double min = Double.MAX_VALUE;
            for(int j = 0; j < row; ++j) {
                if (array_c[i][j] < min) {
                    min = array_c[i][j];
                    System.out.println(min);
                }
            }
            sum_of_smallest += min;
        }

        System.out.println("Sum of smallest: " + sum_of_smallest);
    }
}
