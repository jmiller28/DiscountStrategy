package discountstrategy;

/**
 *
 * @author jmiller
 */
public class PointOfSaleRegister {

    private String productCode;
    private String description;
    private int quantityPurchased;
    private double price;
    private double discount;
    private ConsoleReceipt consoleReceipt;
    public ReceiptLineItem receiptLineItem = new ReceiptLineItem(productCode, description, quantityPurchased, price, discount);

    public PointOfSaleRegister(ReceiptStrategy receipt, String customerNumber) {
        
    }

    
    public void AddLineItem(String productCode) {
        
        receiptLineItem.addToArray(receiptLineItem);
        //receiptLineItem.addToArray(receiptLineItem);
        
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductDescription(String productDescription) {
        this.description = description;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
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

        //ReceiptLineItem lineItem = new ReceiptLineItem();
        //lineItem.getDiscount();
    }
}
