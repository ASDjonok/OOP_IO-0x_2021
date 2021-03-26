package lab2;

import java.util.Scanner;
/*C5=0
 * C7=4
 * C11=8
 */

public class lab2 {
	public static void main() {
		final int a = 5;
		Scanner arg = new Scanner(System.in);

		System.out.println("Введіть розмірність матриці nxm:");
		System.out.print("n=");
		int n = arg.nextInt();
		System.out.print("m=");
		int m = arg.nextInt();
		System.out.println();

		double B[][] = new double[n][m];
		double C[][] = new double[n][m];
		double F[] = new double[n];
		double t = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				B[i][j] = (int) (Math.random() * (100 - 0));
			}

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				C[i][j] = a * B[i][j];
			}

		for (int i = 0; i < n; i++) {
			t = 0;
			for (int j = 0; j < m; j++) {
				t += B[i][j];
			}
			t = t / m;
			F[i] += t;
		}

		System.out.println("Матриця B:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Матриця C:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.println("Cереднє значення елементів кожного рядка матриці B:");
		int p;
		for (int i = 0; i < n; i++) {
			p = i + 1;
			System.out.println("рядок " + p + ":" + F[i]);

		}
	}
}
