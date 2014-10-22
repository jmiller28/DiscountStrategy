package discountstrategy;

/**
 * This class ...
 *
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public class QuantityDiscount implements DiscountStrategy {

    private int minimumQuantity = 5;
    private double percentOff = .1;
    public static final int ZERO = 0;

    /**
     *
     * @param quantityPurchased
     * @param unitPrice
     * @return
     */
    @Override
    public double getDiscountAmount(int quantityPurchased, double unitPrice) throws IllegalArgumentException {
        if (quantityPurchased <= ZERO) {
            throw new IllegalArgumentException("Purchased quantity must be greater than 0.");
        }
        if (unitPrice < ZERO) {
            throw new IllegalArgumentException("Unit price cannot be lass than 0.");
        }
        double amount = 0;
        if (quantityPurchased >= minimumQuantity) {
            amount = unitPrice * quantityPurchased * percentOff;
        }
        return amount;
    }

    /**
     *
     * @param quantityPurchased
     * @param unitPrice
     * @return
     */
    @Override
    public double getPriceAfterDiscount(int quantityPurchased, double unitPrice) throws IllegalArgumentException {
        if (quantityPurchased <= ZERO) {
            throw new IllegalArgumentException("Purchased quantity must be greater than 0.");
        }
        if (unitPrice < ZERO) {
            throw new IllegalArgumentException("Unit price cannot be lass than 0.");
        }

        double price = 0;

        if (quantityPurchased >= minimumQuantity) {
            price -= getDiscountAmount(quantityPurchased, unitPrice);
        }

        return price;
    }

}
