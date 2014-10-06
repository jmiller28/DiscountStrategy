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
//    private String productCode;
    private int minimumQuantity = 1;

    /**
     * 
     * @param product
     * @param quantityPurchased 
     */
    public ReceiptLineItem(Product product, int quantityPurchased) {
        if (product == null || quantityPurchased < minimumQuantity) {
            throw new IllegalArgumentException();
        }
        this.product = product;
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
