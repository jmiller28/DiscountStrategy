package discountstrategy;

/**
 * This class ...
 *
 * Note: JavaDoc is not complete yet!
 *
 * @author jmiller
 * @version 14.10.01 alpha
 */
public class FakeDatabase {

    private DiscountStrategy PercentOffDiscount = new PercentOffDiscount();
    private DiscountStrategy QuantityDiscount = new QuantityDiscount();

    private Product[] products = {
        new Product("886878841132", "LEVI DOCKERS", 45.99, PercentOffDiscount),
        new Product("017133562060", "FERGALICIOUS BOOTS", 69.99, PercentOffDiscount),
        new Product("009270653", "MARY JANE SOCKS", 1.99, PercentOffDiscount),
        new Product("008498255", "SUMMIT WATERPROOF BOOTS", 41.99, PercentOffDiscount),
        new Product("001357375", "3PK STRIPE SOCKS", 2.99, QuantityDiscount)
    };

    private Customer[] customers = {
        new Customer("0", "Cash Customer"),
        new Customer("00002060", "Julie Miller"),};

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
