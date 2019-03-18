package L6Tasks.L6Task6;

public class Worker implements IWorker {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Worker() {

    }

}
