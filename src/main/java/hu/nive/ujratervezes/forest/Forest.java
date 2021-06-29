package hu.nive.ujratervezes.forest;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    List<Tree> trees;

    public Forest() {
        this.trees = new ArrayList<>();
    }

    public Forest(List<Tree> trees) {
        this.trees = trees;
    }

    public List<Tree> getTrees() {
        return this.trees;
    }

    public void rain() {
        for (Tree tree : this.trees) {
            tree.irrigate();
        }
    }

    public void cutTrees(Lumberjack lumberjack) {
        List<Tree> toRemove = new ArrayList<>();

        for (Tree tree : this.trees) {
            if (lumberjack.canCut(tree)) {
                toRemove.add(tree);
            }
        }

        for (Tree tree : toRemove) {
            this.trees.remove(tree);
        }
    }

    public boolean isEmpty() {
        return this.trees.size() == 0;
    }

    public List<String> getStatus() {
        List<String> output = new ArrayList<>();

        for (Tree tree : trees) {
            output.add(tree.toString());
        }
        return output;
    }
}
