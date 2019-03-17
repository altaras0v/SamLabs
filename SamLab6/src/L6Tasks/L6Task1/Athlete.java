package L6Tasks.L6Task1;

interface Athlete {
   abstract void participate();
}
interface SwimmingAthlete extends Athlete{
    abstract void swim();
    static void availableDistance(){
        System.out.println("My distance: \n 100m \n 200m \n 500m");
    }
}
interface JumpingAthlete extends Athlete{
    abstract void highJump();
    abstract void longJump();
    abstract void trippleJump();
}
interface TeamPlayer extends Athlete{
    abstract void playSpor();
    default void showStatistics(){
        System.out.println("I have bad statistic");
    }
}