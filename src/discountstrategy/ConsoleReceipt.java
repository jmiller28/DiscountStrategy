package discountstrategy;

/**
 *
 * @author jmiller
 */
public class ConsoleReceipt implements ReceiptStrategy {
    private ReceiptLineItem receiptLineItem;
    
    
    @Override
    public void displayReceipt() {
        System.out.println("I made it to the Console Receipt");
    }
    
}
