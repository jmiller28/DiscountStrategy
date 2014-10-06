package discountstrategy;

/**
 * This class ...
 * 
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public class Customer {

    private String customerNumber;
    private String customerName;

    /**
     * 
     * @param customerNumber
     * @param customerName 
     */
    public Customer(String customerNumber, String customerName) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
    }

    /**
     * 
     * @return 
     */
    public final String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * 
     * @return 
     */
    public final String getCustomerName() {
        return customerName;
    }

    /**
     * 
     * @param customerNumber 
     */
    public final void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * 
     * @param customerName 
     */
    public final void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
