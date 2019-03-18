package L6Tasks.L6Task6;

public class Wall implements IPart {

    private int width;
    private int height;
    private int length;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public void setWidth(int width) {
        this.width=width;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void setHeight(int height) {
        this.height=height;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public void setLength(int length) {
        this.length=length;
    }
    public Wall() {
        name = "Wall";
    }
}
