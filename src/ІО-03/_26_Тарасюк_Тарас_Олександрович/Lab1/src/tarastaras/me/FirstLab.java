package tarastaras.me;

import java.util.Scanner;

/**
 * 326 % 2 = Ñ2 = 0 --> O1 = "+" 
 * 326 % 3 = Ñ3 = 2 --> C3 = C = 2 
 * 326 % 5 = Ñ5 = 1 --> O2 = "/" 
 * 326 % 7 = Ñ7 = 4 --> char type of "i" and "j"
 */

public class FirstLab {

	public static void main(String[] args) {
		final int C = 2;
		double S = 0.0;
		Scanner input = new Scanner(System.in);
		short a, b, m, n;
		
		//a!=-2 b!=0
		System.out.println("Enter lower limit:");
		a = input.nextShort(); //short enter a<0
		b = input.nextShort();
		System.out.println("Enter upper limit:");
		n = input.nextShort();
		m = input.nextShort();
		input.close();
		if(a<0 | b<=0 | n<0 | m<0) {
			System.out.println("Eror! These values are invalid!");
			return;
		}
		else if (a > n | b > m) {
			System.out.println("Eror! Lower limit can't be bigger than upper limit!");
			return;
		} 
		else {
			for (char i = (char) a; i <= n; i++) {
					for (char j = (char) b; j <= m; j++) {
						S += (((double)i / j) / (i + C));
					}
			}
		}
		System.out.println("Result: S = "+S);
	}

}
