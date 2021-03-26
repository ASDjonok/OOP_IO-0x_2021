package com.fastroof.lab2;

import java.util.Random;

public class Lab2Main {
    public static void main(String[] args) {
        /*
        0219
        C5 = 4 -> C=A×B
        C7 = 2 -> "short"
        C11 = 10 -> Знайти середнє значення елементів матриці
        */

        int m1,n1,m2,n2; // зберігають значення розмірності матриці А[m1,n1] та B[m2,n2]
        m1 = 3; n1 = 4; m2 = 4; n2 = 5;

        // Для множення A[m1xn1] на B[m2xn2] потрібно щоб n1 == m2
        if (n1 != m2) {
            System.out.println("Так як не виконується умова (n1 = m2) для множення матриці A на B, то подальші дії з матрицями неможливі і результуюча матриця не існує.");
        }  else {

            short[][] A = new short[m1][n1];
            short[][] B = new short[m2][n2];

            // Генеруємо матриці А та В та виводимо їх
            System.out.println("Матриця А:");
            generateAndPrintMatrix(A);
            System.out.println("Матриця  B:");
            generateAndPrintMatrix(B);

            short[][] C = new short[m1][n2];
            double S = 0;
            System.out.println("Матриця  C (C=A×B):");
            // Виконуємо множення A×B та виводимо результат, також знаходимо суму усіх елементів S матриці C
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    for (int k = 0; k < n1; k++) { // m2 == n1 (можна замінити)
                        C[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.format("%5d", C[i][j]);
                    S += C[i][j];
                }
                System.out.println();
            }
            // Виводимо середнє значення елементів матриці
            System.out.println("Середнє значення елементів матриці C = " +  Math.round(S/(m1*n2)));
        }
    }

    public static void generateAndPrintMatrix(short[][] matrix){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) { // matrix.length -> m
            for (int j = 0; j < matrix[0].length; j++) { // matrix[0].length -> n
                matrix[i][j] = (short)(random.nextInt(10) * (random.nextBoolean() ? 1 : -1)); // short [від -32 768 до 32 767], тому беремо значення поменше, щоб при типізації не втратити значення у майбутніх розрахунках
                System.out.format("%3d",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
