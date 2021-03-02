package ІО_06._16_Панкін_Владислав_Андрійович.lab2;

public class Main {
    public static void main(String[] args) {
        /*
          C5 = 4 C = A×B
          C7 = 3, int
          C11 = 3 Обчислити суму найбільших елементів кожного рядка матриці
        */

        int NZK=619;
        int C5=NZK%5;
        int C7=NZK%7;
        int C11=NZK%11;
        System.out.println ("C5 = " + C5);
        System.out.println ("C7 = " + C7);
        System.out.println ("C11 = " + C11);

        int A[][] = {{4,7,7},
                     {-5,1,8},
                     {4,8,4,},
                     {4,5,3},
                     {2,4,8}};
        int B[][] = {{8,1,4,6},
                     {2,7,1,9},
                     {4,5,6,7}};

/*
        int A[][] = {{1,2,3,4,5},
                     {6,7,8,9,10}};
        int B[][] = {{1,2,1},
                     {3,4,2},
                     {5,6,3},
                     {7,8,4},
                     {9,10,5}};

*/
/*
        int A[][] = {{1,2},
                {3,4},
                {5,6}};
        int B[][] = {{1,2,3,4,5},
                {6,7,8,9,10}};
*/
        int an = A[0].length; //столбцы
        int am = A.length;//строки
        int bn = B.length;//строки
        int bk = B[0].length;//столбцы

        /* Am×n * Bn×k = Cm×k */
        if (an != bn){
            System.out.println("n value of A and n value of B must be equal in order to perform multiplication");
            return;
        }
        int[][] C = new int[am][bk];

        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);
        for (int i = 0; i < C.length; i++) { //Matrix multiplication
            for (int j = 0; j < C[i].length; j++){
                C[i][j] = 0;
                for (int k = 0; k < A[i].length; k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("Matrix C:");
        printMatrix(C);

        int cmax;
        int S=0;
        for (int i = 0; i < C.length; i++) {
//            cmax = -65535;
//            cmax = Integer.MIN_VALUE;
            cmax = C[i][0];
            for(int j = 1; j < C[0].length; j++) {
                if (C[i][j] > cmax) {
                    cmax = C[i][j];
                }
            }
            S += cmax;
        }
        System.out.println("The result is " + S);

    }

    public static void printMatrix(int[][] Matr){
        for (int i = 0; i < Matr.length; i++) {
            for (int j = 0; j < Matr[i].length; j++){
                System.out.print(Matr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


