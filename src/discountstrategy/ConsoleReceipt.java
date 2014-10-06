package discountstrategy;

import java.text.NumberFormat;

/**
 * This class is not used yet. It is intended to be one of several ways to output a receipt.
 * 
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public class ConsoleReceipt implements ReceiptStrategy {

    private ReceiptLineItem[] receiptLineItem = new ReceiptLineItem[0];
    private Customer customer;
    private DataAccessStrategy db;
    private double salesTaxRate = .056;
    private String receiptMessage = "Thank you for shopping at Kohls!";
    private NumberFormat nf = NumberFormat.getCurrencyInstance();

    /**
     * 
     * @param customerNumber - identifies customer
     * @param db - the database that will be used for this receipt
     */
    public ConsoleReceipt(String customerNumber, DataAccessStrategy db) {
        this.customer = db.customerSearch(customerNumber);
        this.db = db;
    }

    /**
     * 
     * @return 
     */
    public final ReceiptLineItem[] getReceiptLineItems() {
        return receiptLineItem;
    }

    /**
     * 
     * @return 
     */
    public final Customer getCustomer() {
        return customer;
    }

    /**
     * 
     * @return 
     */
    public final String getReceiptMessage() {
        return receiptMessage;
    }

    /**
     * 
     * @param customer 
     */
    public final void setCustomer(Customer customer) {
        //validation
        this.customer = customer;
    }
    
    /**
     * 
     * @param receiptMessage 
     */
    public final void setReceiptMessage(String receiptMessage) {
        //validation
        this.receiptMessage = receiptMessage;
    }

    /**
     * 
     * @param productCode
     * @param quantityPurchased 
     */
    public final void addLineItem(String productCode, int quantityPurchased) {
        ReceiptLineItem lineItem = new ReceiptLineItem(db.productSearch(productCode), quantityPurchased);
        addToArray(lineItem);
    }

    /**
     * 
     * @param lineItem 
     */
    public final void addToArray(ReceiptLineItem lineItem) {
        ReceiptLineItem[] tempItems = new ReceiptLineItem[receiptLineItem.length + 1];
        System.arraycopy(receiptLineItem, 0, tempItems, 0, receiptLineItem.length);
        tempItems[receiptLineItem.length] = lineItem;
        receiptLineItem = tempItems;
    }

    /**
     * 
     */
    public final void outputReceipt() {
        double subtotal = 0;
        double discountTotal = 0;
        double taxTotal = 0;
        double grandTtotal = 0;

        System.out.println("|*******************************************************************************************************|");
        System.out.println("|  " + customer.getCustomerName() + "\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|  " + customer.getCustomerNumber() + "\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|-------------------------------------------------------------------------------------------------------|");
        System.out.println("|  UPC \t\tDESCRIPTION \t\t  QUANTITY\tPRICE \t\tDISCOUNT \tEXTENDED\t|");
        System.out.println("|-------------------------------------------------------------------------------------------------------|");

        for (ReceiptLineItem lineItems : receiptLineItem) {
            subtotal = subtotal + lineItems.getLineItemTotal();
            discountTotal = discountTotal + lineItems.getDiscountAmount();
            System.out.println("|  " + lineItems.getProductCode() + "\t" + lineItems.getProductDescription() + "\t\t" + lineItems.getQuantityPurchased() + "\t" + nf.format(lineItems.getUnitPrice()) + "\t\t" + nf.format(lineItems.getDiscountAmount()) + "\t\t" + nf.format(lineItems.getLineItemTotal()) + "\t\t|");
        }
        taxTotal = subtotal * salesTaxRate;
        grandTtotal = subtotal + taxTotal;
        System.out.println("|-------------------------------------------------------------------------------------------------------|");

        System.out.println("|  Sub Totals\t\t\t\t\t\t\t\t" + nf.format(discountTotal) + "\t\t" + nf.format(subtotal) + "\t\t|");
        System.out.println("|  Sales Tax \t\t\t\t\t\t\t\t\t\t" + nf.format(taxTotal) + "\t\t|");
        System.out.println("|  Sale Total \t\t\t\t\t\t\t\t\t\t" + nf.format(grandTtotal) + "\t\t|");
        System.out.println("|  " + getReceiptMessage() + "\t\t\t\t\t\t\t\t\t|");
        System.out.println("|*******************************************************************************************************|\n\n");
    }

}
