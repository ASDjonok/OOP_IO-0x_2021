package BRI_lab5;

public class Punctuation implements SentenceMember {
    private String sign;

//    Standard constructor
    public Punctuation(String sign) {
        this.sign = sign;
    }
//    End of constructor

    @Override
    public String toString() {
        return sign;
    }
}
