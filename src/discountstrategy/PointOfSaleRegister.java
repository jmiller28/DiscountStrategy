package discountstrategy;

/**
 *
 * @author jmiller
 */
public class PointOfSaleRegister {

    public PointOfSaleRegister(int storeNumber, String customerNumber) {

    }
    
    
    
    public void DisplayMessage() {
        System.out.println("I made it to the POS Register");
        CustomerDatabase customerDatabase = new CustomerDatabase();
        //customerDatabase.getCustomerName("00002060");
        System.out.println(customerDatabase.getCustomerName("00002060")); 
        
        ProductDatabase pd = new ProductDatabase();
        pd.productCodeLookup("001357375");
        
        ReceiptStrategy receipt = new ConsoleReceipt();
        receipt.displayReceipt();
         
        ReceiptLineItem lineItem = new ReceiptLineItem();
        lineItem.getDiscount();
}
}
