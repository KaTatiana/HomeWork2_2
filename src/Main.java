public class Main {
    public static void main(String[] args) {
        Gryffindor garryPotter = new Gryffindor("Garry Potter",10,8,50,35,40);
        Gryffindor ronaldWeasley = new Gryffindor("Ronald Weasley",14,20,45,35,60);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger",5,10,40,45,50);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 4,3,40,20,60,45,35);
        Slytherin grexemMontegy = new Slytherin("Grexem Montegy", 3,4,45,30,50,46,30);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 2,2,48,40,55,40,25);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith",6,9,30,45,36);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",7,5,60,35,46);
        Hufflepuff ustinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley",10,4,40,75,52);
        Ravenclaw choChang = new Ravenclaw("Cho Chang", 4,6,22,34,67,54);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 6,8,26,67,37,44);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 7,4,42,23,56,43);

        garryPotter.compareStudent(ronaldWeasley);
        hermioneGranger.compareStudent(ronaldWeasley);
        dracoMalfoy.compareStudent(grexemMontegy);
        grexemMontegy.compareStudent(gregoryGoyle);
        zachariasSmith.compareStudent(cedricDiggory);
        ustinFinchFletchley.compareStudent(cedricDiggory);
        choChang.compareStudent(padmaPatil);
        marcusBelby.compareStudent(padmaPatil);
    }
}