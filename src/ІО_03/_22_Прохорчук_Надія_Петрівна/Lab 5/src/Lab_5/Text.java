package Lab_5;

public class Text {
    private final Sentences[] SENTENCES;

    public Text(String text){
        int massiveLength = text.split("(?<=[!.?])\\s?").length;
        SENTENCES = new Sentences[massiveLength];
        String[] whole_text = text.split("(?<=[!.?])\\s?");
        for(int i=0; i<massiveLength; i++){
            SENTENCES[i]=new Sentences(whole_text[i]);
        }

    }
    public void print(){
        for(Sentences sentence: SENTENCES){
            sentence.print();
        }
        System.out.print(" ");
    }
}
