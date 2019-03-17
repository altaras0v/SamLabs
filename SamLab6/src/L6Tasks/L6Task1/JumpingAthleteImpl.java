package L6Tasks.L6Task1;

public class JumpingAthleteImpl implements JumpingAthlete {
    @Override
    public void participate() {
        highJump();
        longJump();
        trippleJump();
    }


    @Override
    public void highJump() {
        System.out.println("It is high jump");
    }

    @Override
    public void longJump() {
        System.out.println("It is long jump");
    }

    @Override
    public void trippleJump() {
        System.out.println("It is tripple jump");
    }
}
