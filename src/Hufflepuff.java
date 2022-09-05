import lombok.Getter;

@Getter
public class Hufflepuff extends Hogwarts {
    private final int diligence;
    private final int loyalty;
    private final int honor;

    public Hufflepuff(String fullName, int magic, int teleport,int diligence, int loyalty, int honor) {
        super(magic,teleport,fullName);
        if(diligence<0||diligence>100) {
            throw new RuntimeException("Неверное начение diligence");
        }
        if(loyalty<0||loyalty>100) {
            throw new RuntimeException("Неверное начение loyalty");
        }
        if(honor<0||honor>100) {
            throw new RuntimeException("Неверное начение honor");
        }
        this.diligence = 0;
        this.loyalty = 0;
        this.honor = 0;
    }

    public int sumStudentPoints(){
        return super.sumStudentPoints()+this.diligence+this.loyalty+this.honor;
    }

    public void compareStudent(Hufflepuff student) {
        compareAndPrintResults(this, student);
    }
}
