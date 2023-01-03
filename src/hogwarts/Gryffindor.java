package hogwarts;


public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String namePupils, int wizardry, int transgression, int nobility, int honor, int bravery) {
        super(namePupils, wizardry, transgression);
        setNobility(nobility);
        setHonor(honor);
        setBravery(bravery);
    }

    public void setNobility(int nobility) {
        if (nobility < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        if (honor < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        if (bravery < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.bravery = bravery;
    }

    public static void сomPupils(Gryffindor one, Gryffindor two) {
        int x = one.bravery + one.honor + one.nobility;
        int y = two.bravery + two.honor + two.nobility;
        if (x > y) {
            System.out.println(one.getNamePupils() + " лучший Гриффиндорец, чем " + two.getNamePupils());
        } else {
            System.out.println(two.getNamePupils() + " лучший Гриффиндорец, чем " + one.getNamePupils());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Благородство: " + nobility + "\nЧесть: " + honor + "\nХрабрость: " + bravery;
    }
}
