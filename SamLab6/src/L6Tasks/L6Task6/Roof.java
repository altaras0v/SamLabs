package L6Tasks.L6Task6;

public class Roof implements IPart {
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
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width=width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height=height;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void setLength(int length) {
        this.length=length;
    }
    public Roof() {
        name = "Roof";
    }
}
