package L6Tasks.L6Task6;

/**
 * Creates teamlead
 */
public class TeamLeader implements IWorker {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public TeamLeader() {

    }

    /**
     * Display information about house (already built) when will call teamlead
     * @param team
     */
    public void viewResult(Team team){
        System.out.println("Уже построено:" + team.getParts());
        // Percent of house that building now
        System.out.println("Дом закончен на " + (int)(team.parts.size()/11.0*100) + " %");
    }
}
