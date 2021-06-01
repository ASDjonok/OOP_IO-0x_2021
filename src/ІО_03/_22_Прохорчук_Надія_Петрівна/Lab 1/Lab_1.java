import java.util.Scanner;

public class Lab_1 {

//      C2 = 0 O1 = "+"
//      C3 = 1 C = 1
//      C5 = 2 O2 = "%"
//      C7 = 0 тип індексів i та j = byte

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double S = 0;
         final int C = 1;
         byte a, b ,n, m;

         System.out.println("Введіть нижню границю:");
         while (!input.hasNextByte()){
             System.out.println("Введіть байтове число!");
             input.next();
         }
         a = input.nextByte();

         while (!input.hasNextByte()){
             System.out.println("Введіть байтове число!");
             input.next();
         }
         b = input.nextByte();

         System.out.println("Введіть верхню границю:");
         while (!input.hasNextByte()){
             System.out.println("Введіть байтове число!");
             input.next();
         }
         n = input.nextByte();
         
         while (!input.hasNextByte()){
             System.out.println("Введіть байтове число!");
             input.next();
         }
         m = input.nextByte();

         if(a>n || b>m){
             System.out.println("Верхня границя не може бути меншою за нижню!");
         }else if((a<=-C && n>=-C)||(b<=0 && m>=0)) {
             System.out.println("Недопустимі значення: присутнє ділення на нуль!");
         }else{
             for (byte i = a; i <= n; i++) {
                 for (byte j = b; j <= m; j++) {
                     S = S + ((i%j)/(double)(i+C));
                 }
             }
             String doubleS = String.format("S = %.3f", S);
             System.out.println(doubleS);
         }
     }
}
