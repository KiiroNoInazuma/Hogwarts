package hogwarts;

public abstract class Hogwarts {


    private int wizardry;
    private int transgression;
    private String namePupils;

    Hogwarts(String namePupils, int wizardry, int transgression) {
        setWizardry(wizardry);
        setTransgression(transgression);
        try {
            if (namePupils == null || namePupils.isBlank()) {
                throw new RuntimeException();
            }
            this.namePupils = namePupils;
        } catch (RuntimeException e) {
            System.out.println("Ошибка! Не заполнено или неправильно указано имя ученика в объекте класса " + getClass().getSimpleName() + ".");
        }
    }


    public void infoPupils() {
        System.out.println("<<" + this.namePupils + ">>");
        System.out.println(this);
    }

    String getNamePupils() {
        return namePupils;
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

    public static void compareAll(Hogwarts... hogwarts) {
        int max = 0;
        int result;
        int sum;
        for (Hogwarts ht : hogwarts) {
            result = ht.transgression + ht.wizardry;
            max = Integer.max(result, max);
            System.out.println(ht.namePupils + ": " + result);
        }
        for (Hogwarts ht : hogwarts) {
            sum = ht.transgression + ht.wizardry;
            if (max == sum) {
                System.out.println(ht.namePupils + " самый сильный волшебник!");
            }
        }
    }


    @Override
    public String toString() {
        return "Мощность колдовства: " + wizardry + "\nСила трансгрессирования: " + transgression + "\n";
    }
}
