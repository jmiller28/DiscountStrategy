package discountstrategy;

/**
 *
 * @author jmiller
 */
public class ProductDatabase {

    private String productCode;
    private String description;
    private double price;
    private int discountLevel;
    private ProductDatabase[] productDatabase = new ProductDatabase[5];

    public ProductDatabase() {
        ProductDatabase[] productDatabase = new ProductDatabase[5];

        productDatabase[0] = new ProductDatabase();
        productDatabase[0].setProductCode("886878841132");
        productDatabase[0].setDescription("LEVI DOCKERS");
        productDatabase[0].setPrice(45.99);
        productDatabase[0].setDiscountLevel(6);

        productDatabase[1] = new ProductDatabase();
        productDatabase[1].setProductCode("017133562060");
        productDatabase[1].setDescription("FERGALICIOUS BOOTS");
        productDatabase[1].setPrice(69.99);
        productDatabase[1].setDiscountLevel(3);

        productDatabase[2] = new ProductDatabase();
        productDatabase[2].setProductCode("009270653");
        productDatabase[2].setDescription("MARY JANE SOCKS");
        productDatabase[2].setPrice(1.99);
        productDatabase[2].setDiscountLevel(0);

        productDatabase[3] = new ProductDatabase();
        productDatabase[3].setProductCode("008498255");
        productDatabase[3].setDescription("SUMMIT WATERPROOF BOOTS");
        productDatabase[3].setPrice(41.99);
        productDatabase[3].setDiscountLevel(2);

        productDatabase[4] = new ProductDatabase();
        productDatabase[4].setProductCode("001357375");
        productDatabase[4].setDescription("3PK STRIPE SOCKS");
        productDatabase[4].setPrice(2.99);
        productDatabase[4].setDiscountLevel(21);

    }

    public String getProductCode() {
        return productCode;
    }

    public String getDescription(String productCode) {
        String registerProductCode = productCode;
        for (ProductDatabase pd : productDatabase) {
            if (pd.productCode.equals(registerProductCode)) {
                description = pd.description;
            }
        }
        return description;
    }

    public double getPrice(String productCode) {
        String registerProductCode = productCode;
        for (ProductDatabase pd : productDatabase) {
            if (pd.productCode.equals(registerProductCode)) {
                price = pd.price;
            }
        }
        return price;
    }

    public int getDiscountLevel(String productCode) {
        String registerProductCode = productCode;
        for (ProductDatabase pd : productDatabase) {
            if (pd.productCode.equals(registerProductCode)) {
                discountLevel = pd.discountLevel;
            }
        }
        return discountLevel;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscountLevel(int discountLevel) {
        this.discountLevel = discountLevel;
    }

//    public void setProductDatabase(ProductDatabase[] productDatabase) {
//        this.productDatabase = productDatabase;
//    }
//    public ProductDatabase(String productCode, String description, double price, int discountLevel) {
//        this.productDatabase = new ProductDatabase[5];
//
//    }
    public void productCodeLookup(String productCode) {
        System.out.println("I made it to the Product Database");
        String registerProductCode = productCode;
        for (ProductDatabase pd : productDatabase) {
            if (pd.productCode.equals(registerProductCode)) {
                description = pd.description;
                price = pd.price;
                discountLevel = pd.discountLevel;
                System.out.println(discountLevel);
            }
        }
    }

}
