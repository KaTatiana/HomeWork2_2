public abstract class Hogwarts {
    private final int magic;
    private final int teleport;
    private final String fullName;

    public Hogwarts(int magic, int teleport, String fullName){
        if(magic<0||magic>100) {
            throw new RuntimeException("Неверное начение magic");
        }
        if(teleport<0||teleport>100) {
            throw new RuntimeException("Неверное начение teleport");
        }
        this.teleport = 0;
        this.magic = 0;
        this.fullName=fullName;
    }

    public int sumStudentPoints(){
        return this.magic+this.teleport;
    }

    public void compareAndPrintResults(Hogwarts firstStudent, Hogwarts secondStudent){
        if (firstStudent.sumStudentPoints()>secondStudent.sumStudentPoints()){
            System.out.println(firstStudent.fullName+" сильнее "+secondStudent.fullName);
        }
        else if(firstStudent.sumStudentPoints()<secondStudent.sumStudentPoints()){
            System.out.println(secondStudent.fullName+" сильнее "+firstStudent.fullName);
        }
        else{
            System.out.println("Силы "+secondStudent.fullName+" и "+firstStudent.fullName+" равны");
        }
    }
}
