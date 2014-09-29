package discountstrategy;

/**
 *
 * @author jmiller
 */
public class CustomerDatabase {

    private String customerNumber;
    private String customerName;
    private CustomerDatabase[] customerDatabase = new CustomerDatabase[2];

    public CustomerDatabase() {
        CustomerDatabase[] customerDatabase = new CustomerDatabase[2];

        customerDatabase[0] = new CustomerDatabase();
        customerDatabase[0].setCustomerNumber("0");
        customerDatabase[0].setCustomerName("Cash Customer");

        customerDatabase[1] = new CustomerDatabase();
        customerDatabase[1].setCustomerNumber("00002060");
        customerDatabase[1].setCustomerName("Julie Miller");

    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName(String customerNumber) {
        this.customerNumber = customerNumber;
        for (CustomerDatabase cd : customerDatabase) {
            if (cd.customerNumber.equals(customerNumber)) {
                customerName = cd.customerName;
                return customerName;
            }
        }

        return customerName;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
