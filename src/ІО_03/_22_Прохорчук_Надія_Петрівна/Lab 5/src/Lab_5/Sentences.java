package Lab_5;

public class Sentences {
    private final Words[] WORDS;

    public Sentences(String sentence){
        int massiveLength = sentence.split(" ").length;
        WORDS = new Words[massiveLength];
        String[] words_massive = sentence.split(" ");
        for(int i=0; i<massiveLength; i++){
            WORDS[i]=new Words(words_massive[i]);
        }
    }
    public void print(){
        for(Words word: WORDS){
            System.out.print(word.get() + " ");
        }
    }
}
