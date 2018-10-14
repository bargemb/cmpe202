public class Client {
    public static void main(String[] args) {
        Composite order = new Order("Five Guys");
        Composite burger = new Burger("LBB");
        burger.addChild(new Beef("{{{{BACON}}}}"));
        burger.addChild(new Toppings("LETTUCE"));
        burger.addChild(new Toppings("TOMATO"));
        burger.addChild(new Toppings("->|G ONION"));
        burger.addChild(new Toppings("->|JALA Grilled"));
        Composite fries = new Fries("LTL CAJ");
        order.addChild(burger);
        order.addChild(fries);

        System.out.println("Customer Slip\n\n");
        SlipStrategy customer = new CustomerSlip();
        customer.printDescription(order);

        System.out.println("\n\n\nPacking Slip\n\n");
        SlipStrategy packing = new PackingSlip();
        packing.printDescription(order);
    }
}
