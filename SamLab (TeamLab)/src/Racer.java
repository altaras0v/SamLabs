public class Racer extends Employee {
    Racer(String name, int numberRace) {
        super(name);
        this.numberRace = numberRace;
    }

    private int numberRace;

    public double countSalary() {
        return numberRace * 2;
    }

}
