package L6Tasks.L6Task1;

public class TeamPlayerImpl implements TeamPlayer {
    @Override
    public void participate() {
        showStatistics();
        playSpor();
    }

    @Override
    public void playSpor() {
        System.out.println("I playing football");
    }
}
