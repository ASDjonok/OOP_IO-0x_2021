package BRI_lab5;

public class Punctuation implements SentenceMember {
    private String sign;

    public Punctuation(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return sign;
    }
}
