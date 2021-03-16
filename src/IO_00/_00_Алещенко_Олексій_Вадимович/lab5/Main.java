package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

public class Main {
    public static void main(String[] args) {
        Word word = new Word("Hello");
        Word word2 = new Word("world");
        System.out.println(word.toString());
        Sentence sentence = new Sentence(new Word[]{word, word2});
        System.out.println(sentence);
    }
}
