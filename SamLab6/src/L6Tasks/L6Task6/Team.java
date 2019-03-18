package L6Tasks.L6Task6;

import java.util.ArrayList;
import java.util.List;

/**
 * Class which creates team of workers with teamlead
 */
public class Team {
    TeamLeader teamLeader;

    public List<String> parts = new ArrayList(); // names of parts of house that workers built
    List<Worker> workers = new ArrayList<>(); // list of workers

    public Team() {
        teamLeader = new TeamLeader();
        teamLeader.setName("Alex");
        Worker worker1 = new Worker();
        worker1.setName("Misha");
        Worker worker2 = new Worker();
        worker2.setName("Petya");
        Worker worker3 = new Worker();
        worker1.setName("Zhenya");

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
    }

    int i, j;

    /**
     * Builds part of house. Checks that parts does not exist and adds it to the list
     * @param iPart
     */
    public void build(IPart iPart) {

        if (iPart.getName() == "Wall" && i < 4) {
            parts.add(iPart.getName());
            i++;
        } else if (iPart.getName() == "Window" && j < 4) {
            parts.add(iPart.getName());
            j++;
        } else if (!(parts.contains(iPart.getName()))) {
            parts.add(iPart.getName());

        } else {
            System.out.println(iPart.getName() + " built before");
        }
    }

    /**
     * Get list of names of parts of house that workers built
     * @return - String - name of parts
     */
    public List<String> getParts() {
        return parts;
    }

}

