public class JuniorMechanic extends Mechanic {
    JuniorMechanic(String name, int numberHours) {
        super(name, numberHours);
    }

    @Override
    public double countSalary() {
        double buf=super.countSalary()/2;

        drink();
        return buf;
    }
}
