package lab5;

import java.util.Scanner;

public class lab5{
	public static void main(String[] args) {
		Scanner txt = new Scanner(System.in);
		System.out.println("Ваш текст:");
		String temp = txt.nextLine();
		txt.close();
		//System.out.println(temp);
		Text text = new Text(temp);
		String[] symbols = text.GetWords();
		Punctuation punc = new Punctuation(symbols);
		
		/*for(int i=0; i<symbols.length; i++) {
			System.out.println(symbols[i]);
		}*/
		
		
		
		System.out.println("Текст після обробки:");
		System.out.print(punc.GetFinal());
		
	}	
}