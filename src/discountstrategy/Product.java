package discountstrategy;

/**
 * This class is used to add or retrieve product data from the 
 *
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public class Product {

    private String productCode;
    private String productDescription;
    private double unitPrice;
    private DiscountStrategy discountStrategy;

    /**
     *
     * @param productCode
     * @param productDescription
     * @param unitPrice
     * @param discountStrategy
     */
    public Product(String productCode, String productDescription, double unitPrice, DiscountStrategy discountStrategy) {
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.unitPrice = unitPrice;
        this.discountStrategy = discountStrategy;
    }

    /**
     *
     * @return
     */
    public final String getProductCode() {
        return productCode;
    }

    /**
     *
     * @return
     */
    public final String getProductDescription() {
        return productDescription;
    }

    /**
     *
     * @return
     */
    public final double getUnitPrice() {
        return unitPrice;
    }

    /**
     *
     * @param quantityPurchased
     * @param unitPrice
     * @return
     */
    public final double getDiscountAmount(int quantityPurchased, double unitPrice) {
        return discountStrategy.getDiscountAmount(quantityPurchased, unitPrice);
    }

    /**
     *
     * @return
     */
    public final DiscountStrategy getDiscountStategy() {
        return discountStrategy;
    }

//    /**
//     *
//     * @param productCode
//     */
//    public final void setProductCode(String productCode) {
//        this.productCode = productCode;
//    }
//
//    /**
//     *
//     * @param productDescription
//     */
//    public final void setProductDescription(String productDescription) {
//        this.productDescription = productDescription;
//    }
//
//    /**
//     *
//     * @param unitPrice
//     */
//    public final void setUnitPrice(double unitPrice) {
//        this.unitPrice = unitPrice;
//    }
//
//    /**
//     *
//     * @param discountStrategy
//     */
//    public final void setDiscountType(DiscountStrategy discountStrategy) {
//        this.discountStrategy = discountStrategy;
//    }

}
