package discountstrategy;

import java.text.NumberFormat;

/**
 * This class needs to lookup the customer info by using the customer number.
 * needs to work with the lineItem array to store items and retrieve totals.
 *
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public class Receipt {

    private ReceiptLineItem[] receiptLineItem = new ReceiptLineItem[0];
    private Customer customer;
    private DataAccessStrategy db;
    private double salesTaxRate = .056;
    private String receiptMessage = "Thank you for shopping at Kohls!";
    private NumberFormat nf = NumberFormat.getCurrencyInstance();

    /**
     *
     * @param customerNumber
     * @param db
     */
    public Receipt(String customerNumber, DataAccessStrategy db) throws IllegalArgumentException {

        if (customerNumber == null || customerNumber.length() == ApplicationConstants.ZERO) {
            throw new IllegalArgumentException("A valid customer number is requried.");
        }
        this.customer = db.customerSearch(customerNumber);
        if (db == null) {
            throw new IllegalArgumentException("A valid Data Access Strategy is requried.");
        }
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
     * @param productCode
     * @param quantityPurchased
     */
    public final void addLineItem(String productCode, int quantityPurchased) {
        if (productCode == null || productCode.length() == ApplicationConstants.ZERO) {
            throw new IllegalArgumentException("A valid product code is requried.");
        }
        if (quantityPurchased <= ApplicationConstants.ZERO) {
            throw new IllegalArgumentException("Purchased quantity must be greater than 0.");
        }
        ReceiptLineItem lineItem = new ReceiptLineItem(db.productSearch(productCode), quantityPurchased);
        addToArray(lineItem);
    }

    /**
     *
     * @param lineItem
     */
    public final void addToArray(ReceiptLineItem lineItem) {
        if (lineItem == null) {
            throw new IllegalArgumentException("A valid line item is requried.");
        }
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

        System.out.println("|*****************************CONCRETE*******************************************************************|");
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
        System.out.println("|  " + receiptMessage + "\t\t\t\t\t\t\t\t\t|");
        System.out.println("|*******************************************************************************************************|\n\n");

    }
}
