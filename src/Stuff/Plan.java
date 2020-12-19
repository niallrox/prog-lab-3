package Stuff;

public class Plan {
    private int height;
    private int width;
    private int length;
    public Plan(Sketch sketch){
        height= sketch.getHeight();
        width= sketch.getWidth();
        length=20;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
