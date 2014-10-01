package discountstrategy;

/**
 *
 * @author jmiller
 */
public class QuantityDiscount implements DiscountStrategy {

    private double discountPercent;
    private int quantityPurchased;
    private final int MINIMUM_QUANTITY = 5;
    private final double DISCOUNT_PERCENT = .1;

    public QuantityDiscount() {
        
    }
    
    public QuantityDiscount(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;

        discountPercent = .0;
        if (quantityPurchased >= MINIMUM_QUANTITY) {
            discountPercent = DISCOUNT_PERCENT;
        }
    }

    @Override
    public double getDiscount() {

        return discountPercent;
    }

}
