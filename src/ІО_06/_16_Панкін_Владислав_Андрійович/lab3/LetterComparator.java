package ІО_06._16_Панкін_Владислав_Андрійович.lab3;

import java.util.Comparator;

public class LetterComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if(s1.length()<2 & s2.length()>=2) {
            return s1.charAt(s1.length()-1) - s2.charAt(1);
        }
        else if(s1.length()>=2 & s2.length()<2) {
            return s1.charAt(1) - s2.charAt(s2.length()-1);
        }
        else if(s1.length()<2 & s2.length()<2) {
            return s1.charAt(s1.length()-1)-s2.charAt(s2.length()-1);
        }
        return s1.charAt(1) - s2.charAt(1);
    }
}