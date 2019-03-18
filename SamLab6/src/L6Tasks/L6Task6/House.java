package L6Tasks.L6Task6;

/**
 * Class which creates house
 */
public class House {
    /**
     * Constructor of house
     * Adds parts of house and display information about ending
     */
    public House() {

        Team team = new Team();
        Basement basement = new Basement();
        team.build(basement);
        Wall wall = new Wall();
        for (int i = 0; i < 4; i++) {
            team.build(wall);
        }
        Roof roof = new Roof();
        team.build(roof);
        team.teamLeader.viewResult(team);
        Door door = new Door();
        team.build(door);
        Window window = new Window();
        for (int i = 0; i < 4; i++) {
            team.build(window);
        }

        System.out.println("Строительство дома завершено "+team.getParts());
        team.getParts().clear();
    }

}

