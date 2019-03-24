public class Mechanic extends Employee {

    Mechanic(String name, int numberHours) {
        super(name);
        this.numberHours = numberHours;
    }

    private int numberHours;

    public void drink() {
        System.out.println("Я в хлам "+getName());
    }

    public double countSalary() {
        return numberHours * 5;
    }
}
