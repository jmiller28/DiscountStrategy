package discountstrategy;

/**
 *
 * @author jmiller
 */
public class ReceiptLineItem {

    private String productCode;
    private String productDescription;
    private int quantityPurchased;
    private double price;
    private double discount;

    private ReceiptLineItem[] receiptLineItem = new ReceiptLineItem[0];

    public ReceiptLineItem(String productCode, String productDescription, int quantityPurchased, double price, double discount) {
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.quantityPurchased = quantityPurchased;
        this.price = price;
        this.discount = discount;
    }

    
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
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
