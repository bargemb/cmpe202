public class Fries extends Composite {
    float price;

    public Fries(String d) {
        super(d);
        price = 2.79f;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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
