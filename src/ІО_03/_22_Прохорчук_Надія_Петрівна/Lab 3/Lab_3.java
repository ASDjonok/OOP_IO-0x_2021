import java.util.Scanner;

//    C3 == 1 => type = StringBuffer
//    C17 == 16 => C17 = В кожному слові заданого тексту, видалити всі попередні входження останньої літери цього слова.

public class Lab_3 {
    public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          System.out.println("Введи текст:");
          String text = input.nextLine();
          System.out.println("Ти ввів такий текст: " + text);
          String[] arr = text.split(" ");
          char last_symbol;
          char[] symbols_array;
          int number;
          StringBuffer whole_text = new StringBuffer();
          int sign;
          for(String i : arr){
              StringBuffer word = new StringBuffer(i);
              last_symbol = word.charAt(word.length()-1);
              symbols_array = i.toCharArray();
              if(last_symbol==',' || last_symbol=='.' || last_symbol==':' || last_symbol==';' || last_symbol=='!' || last_symbol=='?' || last_symbol=='\"' || last_symbol=='»'){
                  last_symbol = word.charAt(word.length()-2);
                  sign = 1;
                  if(last_symbol=='\"' || last_symbol=='»'){
                      last_symbol = word.charAt(word.length()-3);
                      sign = 2;
                  }else if (last_symbol=='.'){
                      last_symbol = word.charAt(word.length()-4);
                      sign = 3;
                  }
              }else{
                  sign = 0;
              }

              number = 0;
              for(int j = 0; j < symbols_array.length - 1; j++){
                  if(Character.toLowerCase(symbols_array[j]) ==  Character.toLowerCase(last_symbol)){
                      if(sign==1 && j<symbols_array.length - 2 || sign==2 && j<symbols_array.length - 3 || sign==3 && j<symbols_array.length - 4 || sign==0){
                          word.deleteCharAt(j - number);
                          number += 1;
                      }
                  }
              }

              whole_text.append(word);
              whole_text.append(" ");
          }

        System.out.println("А оть відформатований текст: " + whole_text);
    }
}
