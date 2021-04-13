package ІО_06._16_Панкін_Владислав_Андрійович.lab5;

public class Letter {
    private char letter;

    public Letter(char symbol) {
        letter = symbol;
    }

    // метод повертає задану букву
    public char getLetter() {
        return letter;
    }

    // метод перевіряє чи є задана буква голосною
    public boolean isVowelLetter() {
        String VowelLetter="aeyuioуеаояиюэёыAEYUIOУЕАОЯИЮЭЁЫ";

        if (VowelLetter.indexOf(letter) >= 0)
            return true;
        else
            return false;
    }

}
