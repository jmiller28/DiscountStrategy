package discountstrategy;

/**
 *
 * @author jmiller
 */
public class ReceiptLineItem {

    private String productCode;
    private String productDescription;
    private int quantityPurchased;
    private double unitPrice;
    private double discount;
    private Product product;
    private final int MINIMUM_QUANTITY = 1;

    private ReceiptLineItem[] receiptLineItem = new ReceiptLineItem[0];

    public ReceiptLineItem(Product product, int quantityPurchased) {
        if (product == null || quantityPurchased < MINIMUM_QUANTITY) {
            throw new IllegalArgumentException();
        }
        this.product = product;
        this.quantityPurchased = quantityPurchased;
    }

    public final double getUnitPrice() {
        return product.getUnitPrice();
    }

    public final String getDescription() {
        return product.getProductDescription();
    }

    public final int getQuantityPurchased() {
        return quantityPurchased;
    }

    public final String getProductCode() {
        return productCode;
    }

    public final double getDiscount() {
        return discount;
    }

    public final void setDiscount(double discount) {
        this.discount = discount;
    }

    public ReceiptLineItem[] getReceiptLineItem() {
        return receiptLineItem;
    }

    public void setReceiptLineItem(ReceiptLineItem[] receiptLineItem) {
        this.receiptLineItem = receiptLineItem;
    }

    public void addToArray(ReceiptLineItem item) {
        // needs validation
        System.out.println(receiptLineItem.length);
        ReceiptLineItem[] tempItems = new ReceiptLineItem[receiptLineItem.length + 1];
        System.arraycopy(receiptLineItem, 0, tempItems, 0, receiptLineItem.length);
        tempItems[receiptLineItem.length] = item;
        receiptLineItem = tempItems;
        System.out.println("I made it to the Receipt Line Item");
        System.out.println(receiptLineItem.length);
    }

    public void gotoDiscount() {
        System.out.println("I made it to the Receipt Line Item");
        DiscountStrategy discountStrategy = new PercentOffDiscount();
        discountStrategy.getDiscount();
    }

}
