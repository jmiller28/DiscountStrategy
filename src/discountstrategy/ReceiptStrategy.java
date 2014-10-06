package discountstrategy;

/**
 * This interface is not used yet.
 * 
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public interface ReceiptStrategy {

    public abstract void addLineItem(String productCode, int quantityPurchased);
    public abstract void addToArray(ReceiptLineItem lineItem);
    public abstract void outputReceipt();

}
