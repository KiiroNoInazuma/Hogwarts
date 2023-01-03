import hogwarts.*;

public class Pupils {

    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 92, 45, 35, 9, 47);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 78, 16, 16, 92, 96);
        Gryffindor ronaldWeasley = new Gryffindor("Рон Уизли", 79, 0, 64, 98, 28);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 63, 39, 81, 90, 0, 59, 36);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 53, 67, 8, 46, 93, 60, 1);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 55, 49, 40, 86, 63, 16, 66);

        Ravenclaw choChang = new Ravenclaw("Чо Чанг", 46, 91, 13, 48, 28);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 84, 89, 41, 81, 92);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Бэлби", 6, 95, 75, 23, 90);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смитт", 24, 43, 93, 56, 61);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 23, 50, 57, 97, 98);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флечли", 16, 80, 47, 52, 76);
       // Hufflepuff.comparePupils(cedricDiggory,justinFinchFletchley);
        dracoMalfoy.infoPupils();
    }
}
