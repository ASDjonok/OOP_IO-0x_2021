package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

public class Main {
    public static void main(String[] args) {
        Letter letter = new Letter('H');
        Word word = new Word("Hello");
        Word word2 = new Word("world");
        Word word3 = new Word(new Letter[]{
                letter,
                new Letter('e'),
                new Letter('l'),
                new Letter('l'),
                new Letter('o'),
        });
        System.out.println(word/*.toString()*/);
        System.out.println(word3);
        Sentence sentence = new Sentence(new Word[]{word, word2});
        Sentence sentence2 = new Sentence("Hello, world.");

        Punctuation punctuation = new Punctuation("a");
        System.out.println(":/");
        System.out.println(sentence);

//        new SentenceMember();
    }
}
