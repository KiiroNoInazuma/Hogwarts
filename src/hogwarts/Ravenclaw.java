package hogwarts;

public class Ravenclaw extends Hogwarts {

    private int intelligence;
    private int wisdom;
    private int creation;

    public Ravenclaw(String namePupils, int wizardry, int transgression, int intelligence, int wisdom, int creation) {
        super(namePupils,wizardry, transgression);
        setIntelligence(intelligence);
        setWisdom(wisdom);
        setCreation(creation);
    }

    public void setIntelligence(int intelligence) {
        if (intelligence < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        if (wisdom < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.wisdom = wisdom;
    }

    public void setCreation(int creation) {
        if (creation < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.creation = creation;
    }

    public static void comparePupils(Ravenclaw one, Ravenclaw two) {
        int x = one.creation + one.wisdom + one.intelligence;
        int y = two.creation + two.wisdom + two.intelligence;
        if (x > y) {
            System.out.println(one.getNamePupils() + " лучший Когтевранец, чем " + two.getNamePupils()+".");
        } else {
            System.out.println(two.getNamePupils() + " лучший Когтевранец, чем " + one.getNamePupils()+".");
        }
        System.out.println(one.getNamePupils() + ": " + x);
        System.out.println(two.getNamePupils() + ": " + y);
    }


    @Override
    public String toString() {
        return super.toString() + "Интеллект: " + intelligence + "\nМудрость: " + wisdom + "\nТворчество: " + creation;
    }
}
