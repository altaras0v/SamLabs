package L6Tasks.L6Task1;

public class SwimmingAthleteImpl implements SwimmingAthlete {
    @Override
    public void participate() {
        SwimmingAthlete.availableDistance();
        swim();
    }
    @Override
    public void swim() {
        System.out.println("Swim");
    }
}


