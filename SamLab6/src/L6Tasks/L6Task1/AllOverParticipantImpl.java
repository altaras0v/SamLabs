package L6Tasks.L6Task1;

public class AllOverParticipantImpl implements SwimmingAthlete,JumpingAthlete,TeamPlayer {
    @Override
    public void participate() {
            playSpor();
            SwimmingAthlete.availableDistance();
            swim();
            highJump();
            longJump();
            trippleJump();
            showStatistics();
    }

    @Override
    public void swim() {
        System.out.println("I m swimming now");
    }

    @Override
    public void highJump() {
        System.out.println("I m high jumping now");
    }

    @Override
    public void longJump() {
        System.out.println("I m long jumping now");
    }

    @Override
    public void trippleJump() {
        System.out.println("I m tripple jumping now");
    }

    @Override
    public void playSpor() {
        System.out.println("I m playing football now");
    }
}
