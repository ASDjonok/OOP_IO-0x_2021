package ІО_06._16_Панкін_Владислав_Андрійович.lab5;

public class Letter {
    private final char letter;
    private final static String vowelLetter="aeyuioуеаояиюэёыAEYUIOУЕАОЯИЮЭЁЫ";

    public Letter(char symbol) {
        letter = symbol;
    }

    // метод повертає задану букву
    public char getLetter() {
        return letter;
    }

    // метод перевіряє чи є задана буква голосною
    public boolean isVowelLetter() {
        return vowelLetter.indexOf(letter) >= 0;
    }

}
