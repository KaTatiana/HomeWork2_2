import lombok.Getter;

@Getter
public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honour;
    private final int bravery;

    public Gryffindor(String fullName, int magic, int teleport, int nobility, int honour, int bravery) {
        super(magic, teleport, fullName);
        if(nobility<0||nobility>100) {
            throw new RuntimeException("Неверное начение nobility");
        }
        if(honour<0||honour>100) {
            throw new RuntimeException("Неверное начение honour");
        }
        if(bravery<0||bravery>100) {
            throw new RuntimeException("Неверное начение bravery");
        }
        this.nobility = 0;
        this.honour = 0;
        this.bravery = 0;
    }

    public int sumStudentPoints() {
        return super.sumStudentPoints() + this.nobility + this.honour + this.bravery;
    }

    public void compareStudent(Gryffindor student) {
        compareAndPrintResults(this, student);
    }
}