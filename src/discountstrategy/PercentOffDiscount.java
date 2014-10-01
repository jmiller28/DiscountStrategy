package discountstrategy;

/**
 *
 * @author jmiller
 */
public class PercentOffDiscount implements DiscountStrategy {

    private double discountPercent;
    private final double DISCOUNT_PERCENT = .2;

    public PercentOffDiscount() {
        discountPercent = DISCOUNT_PERCENT;
    }

    @Override
    public double getDiscount() {

        return discountPercent;
    }

}
