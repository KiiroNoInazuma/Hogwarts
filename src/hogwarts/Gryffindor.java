package hogwarts;

import lombok.Getter;

@Getter
public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int wizardry, int transgression, int nobility, int honor, int bravery) {
        super(wizardry, transgression);
    }

}
