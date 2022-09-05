import lombok.Getter;

@Getter
public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;


    public Slytherin(String fullName, int magic, int teleport, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magic,teleport,fullName);

        if(cunning<0||cunning>100) {
            throw new RuntimeException("Неверное начение cunning");
        }
        if(determination<0||determination>100) {
            throw new RuntimeException("Неверное начение determination");
        }
        if(ambition<0||ambition>100) {
            throw new RuntimeException("Неверное начение ambition");
        }
        if(resourcefulness<0||resourcefulness>100) {
            throw new RuntimeException("Неверное начение resourcefulness");
        }
        if(thirstForPower<0||thirstForPower>100) {
            throw new RuntimeException("Неверное начение thirstForPower");
        }
        this.cunning = 0;
        this.determination = 0;
        this.ambition = 0;
        this.resourcefulness = 0;
        this.thirstForPower = 0;
    }
    public int sumStudentPoints(){
        return super.sumStudentPoints()+this.thirstForPower+this.ambition+this.cunning+this.cunning+this.resourcefulness;
    }

    public void compareStudent(Slytherin student) {
        compareAndPrintResults(this, student);
    }
}
