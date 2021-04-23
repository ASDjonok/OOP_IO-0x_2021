package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

public class Punctuation /*extends*/implements SentenceMember {
//    todo think about name and type of the field
    private final String symbolsString;
//    todo think about use regex pattern "Punct"
    private static final String PUNCTUATION_VARIANTS_STRING = "...…?!,\"'—";

    public Punctuation(String symbolsString) {
        for (int i = 0; i < symbolsString.length(); i++) {
            if (!PUNCTUATION_VARIANTS_STRING
                    .contains("" + /*Character.toString(*/symbolsString.charAt(i)/*)*/)) {
//                throw new IllegalArgumentException("!!! Error, wrong argument for punctuation creation '" + symbolsString + "'.");
                System.out.println("!!! Error, wrong argument for punctuation creation '" + symbolsString + "'.");
            }
        }
        this.symbolsString = symbolsString;
        System.out.println(":)");
    }

    @Override
    public String toString() {
        return symbolsString;
    }
}
