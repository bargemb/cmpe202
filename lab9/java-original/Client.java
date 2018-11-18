import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {

        Discounter thanksGivingDiscounter = new ThanksGivingDiscounter();
        BigDecimal discountedValue = thanksGivingDiscounter.applyDiscount(BigDecimal.valueOf(100));
        System.out.println("ThanksGiving Discount on 100 is "+discountedValue);

        Discounter chrismasDiscounter = new ChristmasDiscounter();
        discountedValue = chrismasDiscounter.applyDiscount(BigDecimal.valueOf(100));
        System.out.println("Christmas Discount on 100 is "+discountedValue);

    }
}