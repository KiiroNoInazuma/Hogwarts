package hogwarts;

import lombok.Getter;

@Getter

public class Hogwarts {


    private int wizardry;
    private int transgression;

    Hogwarts(int wizardry, int transgression) {
        setWizardry(wizardry);
        setTransgression(transgression);
    }

    public void setWizardry(int wizardry) {
        if (wizardry < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.wizardry = wizardry;
    }

    public void setTransgression(int transgression) {
        if (wizardry < 0) {
            throw new RuntimeException("Значение не может быть отрицательное!");
        }
        this.transgression = transgression;
    }
}
