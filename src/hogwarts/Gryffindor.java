package hogwarts;

import lombok.Getter;

@Getter
public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int wizardry, int transgression, int nobility, int honor, int bravery) {
        super(wizardry, transgression);
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
}
