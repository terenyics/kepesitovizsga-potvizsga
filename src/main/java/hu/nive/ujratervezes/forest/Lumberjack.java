package hu.nive.ujratervezes.forest;

public class Lumberjack {

    public Lumberjack() {}

    public boolean canCut(Tree tree) {
        return tree.getHeight() > 4;
    }
}
