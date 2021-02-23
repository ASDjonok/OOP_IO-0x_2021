package com.fastroof.lab1;

public class Lab1Main {

    public static void main(String[] args) {
        /*
        0219
        C2 = 1 -> "-"
        C3 = 0 -> C = 0
        C5 = 4 -> "-"
        C7 = 2 -> "int"
        */

        final int C = 0; // константа С задана умовою лаб. роботи
        int a, b, n, m; // початки(а,b) та кіньці(n,m) циклів
        a = 1;
        b = 1;
        n = 10;
        m = 10;
        double S = 0; // збереження результату

        if (a <= C && n >= C) {
            System.out.println("Під час виконання відбувається ділення на нуль");
        } else {
            for (int i = a; i <= n; i++) {
                for (int j = b; j <= m; j++) {
                    S += (double) (i - j) / (i - C);
                }
            }
        }
        System.out.println(S);
    }
}
