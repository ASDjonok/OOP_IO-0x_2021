package BRI_lab5;

public class Letter {
    private char character;

//    Standard constructor
    public Letter(char character) {
        this.character = character;
    }
//    End of constructor

    @Override
    public String toString() {
        return "" + character;
    }
}
