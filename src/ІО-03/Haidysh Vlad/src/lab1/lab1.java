package lab1;

import java.util.Scanner;
/*
 * C2=1 01 '-'
 * C3=2 C=2
 * C5=0 02 '*'
 * C7=4 char
 */

public class lab1 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Задайте верхню межу n:");
		int n = num.nextInt();
		System.out.print("Задайте верхню межу m:");
		int m = num.nextInt();
		System.out.print("Задайте нижню межу a:");
		int a = num.nextInt();
		System.out.print("Задайте нижню межу b:");
		int b = num.nextInt();
		double S = 0;
		final int C = 2;
		int t = 0;

		if (n < a) {
			System.out.println("Введіть коректний n");
			System.out.print("n=");
			n = num.nextInt();
		}
		if (m < b) {
			System.out.println("Введіть коректний m");
			System.out.print("m=");
			m = num.nextInt();
		}
		if (C <= n && C >= a) {
			System.out.print("Ділення на 0");
			t = 1;
		} else
			for (char i = (char) a; i <= n; i++) {
				for (char j = (char) b; j <= m; j++) {
					S += ((double) (i * j) / (i - C));
				}
			}
		if (t == 0) {
			System.out.print(S);
		}
	}
}