import lombok.Getter;

@Getter
public class Ravenclaw extends Hogwarts {
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String fullName, int magic, int teleport, int intelligence, int wisdom, int wit, int creativity) {
        super(magic,teleport,fullName);
        if(intelligence<0||intelligence>100) {
            throw new RuntimeException("Неверное начение intelligence");
        }
        if(wisdom<0||wisdom>100) {
            throw new RuntimeException("Неверное начение wisdom");
        }
        if(wit<0||wit>100) {
            throw new RuntimeException("Неверное начение wit");
        }
        if(creativity<0||creativity>100) {
            throw new RuntimeException("Неверное начение creativity");
        }
        this.intelligence = 0;
        this.wisdom = 0;
        this.wit = 0;
        this.creativity = 0;
    }
    public int sumStudentPoints(Ravenclaw secondStudent){
        return super.sumStudentPoints()+this.creativity+this.intelligence+this.wisdom+this.wit;
    }

    public void compareStudent(Ravenclaw student) {
        compareAndPrintResults(this, student);
    }
}
