public class Burger extends Composite {
    float price;

    public Burger(String d) {
        super(d);
        price = 5.59f;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String printDescription() {
        String des = this.description + "\t\t\t" + this.getPrice() + "\n";
        for (Component component : components){
            des += component.printDescription() + "\n";
        }
        return des;
    }
}
