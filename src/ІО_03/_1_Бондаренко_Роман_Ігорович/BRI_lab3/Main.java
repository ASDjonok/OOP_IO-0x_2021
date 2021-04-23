package BRI_lab3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
            C3 = 1 -> type - StringBuffer
            C17 = 12 -> Відсортувати слова заданого тексту за кількістю входжень визначеного символу в них
        */

        Scanner scanner = new Scanner(System.in);

        // Entering some text
        System.out.println("Enter some text:");
        String string = scanner.nextLine();
        StringBuffer text = new StringBuffer(string);

        // Entering a symbol
        String symbol;
        do {
            System.out.println("Enter a symbol you want:");
            symbol = scanner.nextLine();
        } while (symbol.length() != 1);

        // Get words ONLY
        final Pattern pattern = Pattern.compile("\\b\\w+\\b");
        final Matcher matcher = pattern.matcher(text);

        ArrayList<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group(0));
        }

        // Create a list of lists (list of word's letters)
        String[][] letters = new String[words.size()][];
        for (int i = 0; i < words.size(); ++i) {
            letters[i] = words.get(i).split("");
        }

        // Counting your symbol in the words
        String[][] final_list = new String[words.size()][2];
        for (int i = 0; i <letters.length; ++i) {
            int count = 0;
            for (int j = 0; j < letters[i].length; ++j) {
                if (letters[i][j].equals(symbol)) {
                    ++count;
                }
            }
            final_list[i][0] = Integer.toString(count);
            final_list[i][1] = words.get(i);
        }

        // Bubble sorting
        for (int i = final_list.length - 1; i >= 1; --i) {
            for (int j = 0; j < i; ++j) {
                if (Integer.parseInt(final_list[j][0]) > Integer.parseInt(final_list[j + 1][0])) {
                    String[] temp = final_list[j];
                    final_list[j] = final_list[j + 1];
                    final_list[j + 1] = temp;
                }
            }
        }
        // Another way to sort
        // Arrays.sort(final_list, (a, b) -> Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0])));

        // Printing the result
        for (String[] d : final_list) {
            System.out.print(d[1] + " ");
        }
    }
}
