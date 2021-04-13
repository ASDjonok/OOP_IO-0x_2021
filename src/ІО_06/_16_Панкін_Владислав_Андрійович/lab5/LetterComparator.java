package ІО_06._16_Панкін_Владислав_Андрійович.lab5;

import java.util.Comparator;

public class LetterComparator implements Comparator<Word> {
    @Override
    public int compare(Word w1, Word w2) {
        if(w1.GetLetterCount()<2 & w2.GetLetterCount()>=2) {
            return w1.GetWordLetter(0) - w2.GetWordLetter(1);
        }
        else if(w1.GetLetterCount()>=2 & w2.GetLetterCount()<2) {
            return w1.GetWordLetter(1) - w2.GetWordLetter(0);
        }
        else if(w1.GetLetterCount()<2 & w2.GetLetterCount()<2) {
            return w1.GetWordLetter(0)-w2.GetWordLetter(0);
        }
        return w1.GetWordLetter(1) - w2.GetWordLetter(1);
    }
}