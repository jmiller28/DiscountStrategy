package discountstrategy;

/**
 * This class ...
 * 
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public class PercentOffDiscount implements DiscountStrategy {

    private double percentOff = .2;

    /**
     * 
     * @param quantityPurchased
     * @param unitPrice
     * @return 
     */
    @Override
    public double getDiscountAmount(int quantityPurchased, double unitPrice) {
        double amount = unitPrice * quantityPurchased * percentOff;
        return amount;
    }

    /**
     * 
     * @param quantityPurchased
     * @param unitPrice
     * @return 
     */
    @Override
    public double getPriceAfterDiscount(int quantityPurchased, double unitPrice) {
        double price = unitPrice - getDiscountAmount(quantityPurchased, unitPrice);

        return price;
    }

}
