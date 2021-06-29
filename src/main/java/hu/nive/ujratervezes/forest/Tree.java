package hu.nive.ujratervezes.forest;

public class Tree {

    protected int height;

    public Tree() {
        this.height = 0;
    }

    public Tree(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void irrigate(){}
}
