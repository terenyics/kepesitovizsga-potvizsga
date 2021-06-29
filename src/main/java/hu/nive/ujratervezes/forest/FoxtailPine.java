package hu.nive.ujratervezes.forest;

public class FoxtailPine extends Tree {

    public FoxtailPine(){
        super();
    }

    public FoxtailPine(int height) {
        super(height);
    }

    public void irrigate() {
        this.height += 1;
    }

    @Override
    public String toString() {
        return "There is a " + this.getHeight() + " tall FoxtailPine in the forest.";
    }
}
