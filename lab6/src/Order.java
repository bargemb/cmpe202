public class Order extends Composite {

    public Order(String d) {
        super(d);
    }

    @Override
    public String printDescription() {
        String des = this.description + "\n";
        for (Component component : components){
            des += component.printDescription() + "\n";
        }
        return des;
    }

    public float getPrice(){
        float total = 0.0f;
        for (Component component : components){
            total += component.getPrice();
        }
        return total;
    }
}
