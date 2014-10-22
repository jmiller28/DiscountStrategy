package discountstrategy;

/**
 * This class ...
 * 
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public class PointOfSaleRegister {

    private ReceiptStrategy receiptStrategy;
    private Receipt receipt;
    private DataAccessStrategy db;

    /**
     * 
     * @param db 
     */
    public PointOfSaleRegister(DataAccessStrategy db) {
        this.db = db;
//        this.receiptStrategy = receiptStrategy;
    }

    /**
     * 
     * @param customerNumber 
     */
    public final void startNewSale(String customerNumber) {
        receipt = new Receipt(customerNumber, db);
    }

    /**
     * 
     * @param productCode
     * @param quantity 
     */
    public final void addLineItem(String productCode, int quantity) {
        receipt.addLineItem(productCode, quantity);
    }

    /**
     * 
     */
    public final void completeSale() {
        receipt.outputReceipt();
    }

}
