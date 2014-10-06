package discountstrategy;

/**
 * This class represents a database that stores information about customers and products in two arrays.
 * It provides a way to search the arrays for matching items.
 * 
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public class FakeDatabase implements DataAccessStrategy {

    private DiscountStrategy percentOffDiscount = new PercentOffDiscount();
    private DiscountStrategy quantityDiscount = new QuantityDiscount();

    private Product[] products = {
        new Product("878841132", "LEVI DOCKERS      ", 45.99, percentOffDiscount),
        new Product("133562060", "FERGALICIOUS BOOTS", 69.99, percentOffDiscount),
        new Product("009270653", "MARY JANE SOCKS   ", 1.99, percentOffDiscount),
        new Product("008498255", "SUMMIT WATERPROOF BOOTS", 41.99, percentOffDiscount),
        new Product("001357375", "3PK STRIPE SOCKS  ", 2.99, quantityDiscount)
    };

    private Customer[] customers = {
        new Customer("00000000", "Cash Customer         "),
        new Customer("00002060", "Julie Miller          "),};

    /**
     * 
     * @param productCode - the unique id that represents a bar-code.
     * @return 
     */
    @Override
    public final Product productSearch(String productCode) {
        if (productCode == null || productCode.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Product searchResult = null;
        for (Product product : products) {
            if (productCode.equals(product.getProductCode())) {
                searchResult = product;
                break;
            }
        }
        if (searchResult == null) {
            throw new IllegalArgumentException();
        }
        return searchResult;
    }

    /**
     * 
     * @param customerNumber- the unique id that represents a specific customer.
     * @return 
     */
    @Override
    public final Customer customerSearch(String customerNumber) {
        if (customerNumber == null || customerNumber.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Customer searchResult = null;
        for (Customer customer : customers) {
            if (customerNumber.equals(customer.getCustomerNumber())) {
                searchResult = customer;
                break;
            }
        }
        if (searchResult == null) {
            throw new IllegalArgumentException();
        }
        return searchResult;
    }
}
