public class CustomerSlip implements SlipStrategy {

    @Override
    public void printDescription(Composite obj) {
        System.out.println(obj.printDescription());
        System.out.println("Total\t\t\t" + ((Order)obj).getPrice());
    }
}
