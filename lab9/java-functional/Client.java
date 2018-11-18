import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {

        Discounter thanksGivingDiscounter = amount -> amount.multiply(BigDecimal.valueOf(0.5));
        Discounter christmasDiscounter = amount -> amount.multiply(BigDecimal.valueOf(0.5));

        BigDecimal discountedValue = thanksGivingDiscounter.applyDiscount(BigDecimal.valueOf(100));
        System.out.println("ThanksGiving Discount on 100 is "+discountedValue);

        discountedValue = christmasDiscounter.applyDiscount(BigDecimal.valueOf(100));
        System.out.println("ThanksGiving Discount on 100 is "+discountedValue);
    }
}