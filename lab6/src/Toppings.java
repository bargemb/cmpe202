public class Toppings implements Component {
    protected String topping;

    public Toppings(String topping) {
        this.topping = topping;
    }

    @Override
    public String printDescription() {
        return topping;
    }

    @Override
    public void addChild(Component c) {

    }

    @Override
    public float getPrice() {
        return 0;
    }

}
