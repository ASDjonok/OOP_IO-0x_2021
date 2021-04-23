package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLab {

    public static void main(String[] args) {

        String text = "Оце то він хлопець неу тут мне оуф? Невже я ніколи нічого не навчусь? Хіба ж він мало мне мене дурив він? Час би вже порозумнішати! Але, мабуть, старий дурень найдурніший за всіх. Недарма кажуть, що стару собаку не навчиш нових штук.";

        // delete commas and split setences
        String sentences[] = text.replace(",","").split("(?<=[.!?])");
        // show result
        System.out.println("Text with splitted sentences:\n"+Arrays.deepToString(sentences));

        // determine the number of queArray[] - array of interrogative sentences
        int queSentences = 0;
        for (int i=0; i< text.length(); i++){
            if (text.charAt(i)=='?'){
                queSentences++;
            }
        }

        // array of interrogative sentences
        String queArray[] = new String[queSentences];  // порахувати к-кість знаків питання

        // index for filling queArray
        int queNum = 0;

        // filling array of interrogative sentences
        for (int i = 0; i < sentences.length; ++i) {
            if (sentences[i].contains("?")){
                queArray[queNum++] = sentences[i];
            }
        }

        // show interrogative sentences
        System.out.println("Text with interrogative sentences:\n"+Arrays.deepToString(queArray));

        // array of splitted words and replaced "?"
        String words[][] = new String[queArray.length][];

        // replace "?" and split
        for (int i = 0; i < queArray.length; ++i) {
            words[i] = queArray[i].replace("?","").split(" ");//ділимо на слова
        }

        // splitted words
        System.out.println("Text with splitted words without '?':\n"+Arrays.deepToString(words));

        // get wanted words length from user
        int userLength;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length:");
        userLength = input.nextInt();
        input.close();


        // determine the quantity of elements
        int wantedWordsSpace = 0;
        for (int i = 0; i < words.length; ++i) {
            for (int j = 0; j < words[i].length; ++j) {
                if (words[i][j].length()==userLength) {
                    wantedWordsSpace++;
                }
            }
        }

        String [] wantedWords = new String[wantedWordsSpace];

        // show words of a given length
        int indexMas=0;
        for (int i = 0; i < words.length; ++i) {
            for (int j = 0; j < words[i].length; ++j) {
                if (words[i][j].length()==userLength) {
                    wantedWords[indexMas++] = words[i][j];
                }
            }
        }

        if(indexMas==0) {
            System.out.println("There are no words!");
            return;
        }

        // show wanted words
        System.out.println("Array of wanted words:\n"+Arrays.deepToString(wantedWords));
        Arrays.sort(wantedWords);
        System.out.println("Wanted unique words:");
        String temp = "";
        for (int i = 0; i < wantedWords.length; ++i) {
            if(!wantedWords[i].equals(temp)) {
                System.out.print(wantedWords[i]+" ");
                temp = wantedWords[i];
            }
        }


    }
}