public class Beef implements Component {
    protected String beef;

    public Beef(String beef) {
        this.beef = beef;
    }

    @Override
    public String printDescription() {
        return beef;
    }

    @Override
    public void addChild(Component c) {

    }

    @Override
    public float getPrice() {
        return 0;
    }

}
