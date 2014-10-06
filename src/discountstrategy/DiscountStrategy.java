package discountstrategy;

/**
 * This interface ...
 * 
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public interface DiscountStrategy {

    public abstract double getDiscountAmount(int quantityPurchased, double unitPrice);
    public abstract double getPriceAfterDiscount(int quantityPurchased, double unitPrice);

}
