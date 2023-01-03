package hogwarts;

public class Slytherin extends Hogwarts {

    private int cunning;
    private int resolve;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;


    public Slytherin(String namePupils, int wizardry, int transgression, int cunning, int resolve, int ambition, int resourcefulness, int lustForPower) {
        super(namePupils,wizardry, transgression);
        setCunning(cunning);
        setResolve(resolve);
        setAmbition(ambition);
        setResourcefulness(resourcefulness);
        setLustForPower(lustForPower);
    }

    public void setCunning(int cunning) {
        if (cunning < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.cunning = cunning;
    }

    public void setResolve(int resolve) {
        if (resolve < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.resolve = resolve;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        if (lustForPower < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.lustForPower = lustForPower;
    }

    public static void comparePupils(Slytherin one, Slytherin two) {
        int x = one.ambition + one.lustForPower + one.resourcefulness + one.resolve + one.cunning;
        int y = two.ambition + two.lustForPower + two.resourcefulness + two.resolve + two.cunning;
        if (x > y) {
            System.out.println(one.getNamePupils() + " лучший Слизеринец, чем " + two.getNamePupils()+".");
        } else {
            System.out.println(two.getNamePupils() + " лучший Слизеринец, чем " + one.getNamePupils()+".");
        }
        System.out.println(one.getNamePupils() + ": " + x);
        System.out.println(two.getNamePupils() + ": " + y);
    }


    @Override
    public String toString() {
        return super.toString() + "Хитрость: " + cunning + "\nРешительность: " + resolve + "\nАмбициозность: " +
                ambition + "\nНаходчивость: " + resourcefulness + "\nЖажда власти: " + lustForPower;
    }
}
