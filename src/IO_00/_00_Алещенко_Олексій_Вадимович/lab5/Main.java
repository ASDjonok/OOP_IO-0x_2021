package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Text text = new Text("Hello, world. How are you?");
//        Text text = new Text("А роза упала на лапу Азора.");
//        Text text = new Text("O, world. How are you?");
//        Text text = new Text("Hel");
        System.out.println(text);
        System.out.println("Largest Palindromic Substring: " + text.findLargestPalindromicSubstring());









        /*Letter letter = new Letter('H');
        Word word = new Word("Hello");
        Word word2 = new Word("world");
        Word word3 = new Word(new Letter[]{
                letter,
                new Letter('e'),
                new Letter('l'),
                new Letter('l'),
                new Letter('o'),
        });
        System.out.println(word*//*.toString()*//*);
        System.out.println(word3);
//        new Number(1);
//        Sentence sentence = new Sentence(new Word[]{word, word2});
        Sentence sentence2 = new Sentence("Hello, world.");

        Punctuation punctuation = new Punctuation("a");
        System.out.println(":/");
//        System.out.println(sentence);
        System.out.println(sentence2);

        System.out.println(sentence2 instanceof Sentence);
        System.out.println(word instanceof Word);
        System.out.println(punctuation instanceof Punctuation);

        Object*//*SentenceMember*//* sentenceMember = word;
        System.out.println(sentenceMember instanceof Punctuation);
        System.out.println(sentenceMember.getClass());
        System.out.println(Arrays.toString(sentenceMember.getClass().getDeclaredFields()));
        sentenceMember = punctuation;
        System.out.println(sentenceMember instanceof Punctuation);
        System.out.println(sentenceMember.getClass());*/
//        new SentenceMember();


    }
}
