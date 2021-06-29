package hu.nive.ujratervezes.forest;

public class WhitebarkPine extends Tree {

    public WhitebarkPine() {
        super();
    }

    public WhitebarkPine (int height) {
        super(height);
    }

    public void irrigate() {
        this.height += 2;
    }

    @Override
    public String toString(){
        return "There is a " + this.getHeight() + " tall WhitebarkPine in the forest.";
    }

}
