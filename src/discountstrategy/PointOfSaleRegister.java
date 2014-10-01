package discountstrategy;

/**
 * This class ...
 *
 * Note: JavaDoc is not complete yet!
 *
 * @author jmiller
 * @version 14.10.01 alpha
 */
public class PointOfSaleRegister {

    private ReceiptLineItem receiptLineItem;
    private Receipt receipt;
    private FakeDatabase fakeDatabase = new FakeDatabase();
    
    public PointOfSaleRegister() {

    }

    public void startNewSale(String customerNumber) {
        receipt = new Receipt(customerNumber);
        
//        fakeDatabase.customerSearch(customerNumber);
//
//        System.out.println(fakeDatabase.customerSearch(customerNumber).getCustomerName());
    }

    public void addLineItem(String productCode, int quantity) {
        receiptLineItem = new ReceiptLineItem(fakeDatabase.productSearch(productCode), quantity);
        System.out.println(fakeDatabase.productSearch(productCode).getProductDescription());
        receipt.addLineItem(receiptLineItem);
    }

    public void completeSale() {
        System.out.println("Sale is complete");
    }

}
