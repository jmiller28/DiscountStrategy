package discountstrategy;

/**
 *
 * @author jmiller
 */
public class PercentOffDiscount implements DiscountStrategy {

    @Override
    public double getDiscount() {
        System.out.println("I made it to the Percent Off Discount");
        return 4.44;
    }
    
}
