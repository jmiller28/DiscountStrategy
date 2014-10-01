package discountstrategy;

/**
 *
 * @author jmiller
 */
public class Customer {
private String customerNumber;
    private String customerName;

    public Customer(String customerNumber, String customerName) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
  
}
    
    
    
    
    
//    private Customer customer1 = new Customer("0", "Cash Customer");
//    private Customer customer2 = new Customer("00002060", "Julie Miller");
//    private Customer[] customers = {customer1, customer2};
//
//    
//    private Customer[] customerDatabase = new Customer[2];
//
//    public Customer() {
//        customerDatabase[0] = new Customer();
//        customerDatabase[1] = new Customer();
//
//        customerDatabase[0].customerNumber = "0";
//        customerDatabase[0].customerName = "Cash Customer";
//        customerDatabase[1].customerNumber = "00002060";
//        customerDatabase[1].customerName = "Julie Miller";
//    }
//
//    public String getCustomerNumber() {
//        return customerNumber;
//    }
//
//    public String getCustomerName(String customerNumber) {
//
//        return customerName;
//    }
//
//    public void setCustomerNumber(String customerNumber) {
//        this.customerNumber = customerNumber;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//}
