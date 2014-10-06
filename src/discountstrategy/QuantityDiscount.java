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

    /**
     * 
     * @param quantityPurchased
     * @param unitPrice
     * @return 
     */
    @Override
    public double getDiscountAmount(int quantityPurchased, double unitPrice) {
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
    public double getPriceAfterDiscount(int quantityPurchased, double unitPrice) {
        double price = 0;

        if (quantityPurchased >= minimumQuantity) {
            price -= getDiscountAmount(quantityPurchased,unitPrice);
        }

        return price;
    }

}
