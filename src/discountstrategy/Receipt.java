package discountstrategy;

/**
 *
 * @author jmiller
 */
public class Receipt {
private ReceiptLineItem[] receiptLineItem = new ReceiptLineItem[0];
private Customer customer;

// this class needs to lookup the customer info by using the customer number.
// needs to work with the lineItem array to store items and retrieve totals.    
    public Receipt(String customerNumber) {
        
    }

    public final void startNewSale(String customerNumber, FakeDatabase fakeDatabase) {
        
//        System.out.println(receiptLineItem.length);
        System.out.println(fakeDatabase.customerSearch(customerNumber));
    }

    public final void addLineItem(ReceiptLineItem lineItem) {
        ReceiptLineItem[] tempItems = new ReceiptLineItem[receiptLineItem.length + 1];
        System.arraycopy(receiptLineItem, 0, tempItems, 0, receiptLineItem.length);
         tempItems[receiptLineItem.length] = lineItem;
        receiptLineItem = tempItems; 
        System.out.println(receiptLineItem.length);
    }

    public final void completeSale() {
        System.out.println("Sale is complete");
    }
}
