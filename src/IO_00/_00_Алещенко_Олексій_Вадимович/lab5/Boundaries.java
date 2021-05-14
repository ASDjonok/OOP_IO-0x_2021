package IO_00._00_Алещенко_Олексій_Вадимович.lab5;

public class Boundaries {
    private Letter startLetter;
    private Letter endLetter;

    public Boundaries(Letter startLetter, Letter endLetter) {
        this.startLetter = startLetter;
        this.endLetter = endLetter;
    }

    public Letter getStartLetter() {
        return startLetter;
    }

    public Letter getEndLetter() {
        return endLetter;
    }
}
