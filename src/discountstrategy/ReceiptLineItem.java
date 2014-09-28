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
    
    public void getDiscount() {
        System.out.println("I made it to the Receipt Line Item");
        DiscountStrategy discountStrategy = new PercentOffDiscount();
        discountStrategy.getDiscount();
}
    
}
