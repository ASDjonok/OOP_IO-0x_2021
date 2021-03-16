package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

public class Word extends Object {
//    todo remove this field in a final version
    private String wordString;

    public Word(String wordString) {
        this.wordString = wordString;
    }

    @Override
    public String toString() {
        return wordString;
    }
}
