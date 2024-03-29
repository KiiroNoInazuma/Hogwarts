package hogwarts;

public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String namePupils, int wizardry, int transgression, int diligence, int loyalty, int honesty) {
        super(namePupils, wizardry, transgression);
        setDiligence(diligence);
        setLoyalty(loyalty);
        setHonesty(honesty);
    }

    public void setDiligence(int diligence) {
        if (diligence < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.honesty = honesty;
    }

    public static void comparePupils(Hufflepuff one, Hufflepuff two) {
        int x = one.diligence + one.honesty + one.loyalty;
        int y = two.diligence + two.honesty + two.loyalty;
        if (x > y) {
            System.out.println(one.getNamePupils() + " лучший Пуффендуец, чем " + two.getNamePupils()+".");
        } else {
            System.out.println(two.getNamePupils() + " лучший Пуффендуец, чем " + one.getNamePupils()+".");
        }
        System.out.println(one.getNamePupils() + ": " + x);
        System.out.println(two.getNamePupils() + ": " + y);
    }


    @Override
    public String toString() {
        return super.toString() + "Трудолюбие: " + diligence + "\nВерность: " + loyalty + "\nЧестность: " + honesty;
    }
}
