package hogwarts;


abstract class Hogwarts {


    private int wizardry;
    private int transgression;
    private String namePupils;

    Hogwarts(String namePupils, int wizardry, int transgression) {
        setWizardry(wizardry);
        setTransgression(transgression);
        setNamePupils(namePupils);
    }


    public void infoPupils() {
        System.out.println("<<" + this.namePupils + ">>");
        System.out.println(this);
    }

    String getNamePupils() {
        return namePupils;
    }

    public void setNamePupils(String namePupils) {
        try {
            if (namePupils == null || namePupils.isBlank()) {
                throw new RuntimeException();
            }
            this.namePupils = namePupils;
        } catch (RuntimeException e) {
            System.out.println("Ошибка! Не заполнено или неправильно указано имя ученика.");
        }
    }

    public void setWizardry(int wizardry) {
        if (wizardry < 0) {
            throw new RuntimeException("Значение не может быть отрицательным!");
        }
        this.wizardry = wizardry;
    }

    public void setTransgression(int transgression) {
        if (transgression < 0) {
            throw new RuntimeException("Значение не может быть отрицательное!");
        }
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Мощность колдовства: " + wizardry + "\nСила трансгрессирования: " + transgression + "\n";
    }
}
