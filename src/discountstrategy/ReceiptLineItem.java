package discountstrategy;

/**
 * This class ...
 * 
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public class ReceiptLineItem {

    private Product product;
    private int quantityPurchased;
//    private int minimumQuantity = 1;
    public static final int ZERO = 0;

    /**
     * 
     * @param product
     * @param quantityPurchased 
     */
    public ReceiptLineItem(Product product, int quantityPurchased) {
        if (product == null) {
            throw new IllegalArgumentException("A valid Product Database is requried.");
        }
        this.product = product;
        if (quantityPurchased < ZERO) {
            throw new IllegalArgumentException("Purchased quantity must be greater than 0.");
        }
        this.quantityPurchased = quantityPurchased;
    }

    /**
     * 
     * @return 
     */
    public final Product getProduct() {
        return product;
    }

    /**
     * 
     * @return 
     */
    public final String getProductCode() {
        return product.getProductCode();
    }

    /**
     * 
     * @return 
     */
    public final String getProductDescription() {
        return product.getProductDescription();
    }

    /**
     * 
     * @return 
     */
    public final int getQuantityPurchased() {
        return quantityPurchased;
    }

    /**
     * 
     * @return 
     */
    public final double getUnitPrice() {
        return product.getUnitPrice();
    }

    /**
     * 
     * @return 
     */
    public final double getDiscountAmount() {
        return product.getDiscountAmount(quantityPurchased, getUnitPrice());
    }
    
    /**
     * 
     * @return 
     */
    public final double getLineItemTotal() {
        return (product.getUnitPrice() * getQuantityPurchased()) - getDiscountAmount();
    }
}
