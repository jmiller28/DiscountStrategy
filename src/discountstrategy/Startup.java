package discountstrategy;

/**
 *
 * @author jmiller
 */
public class Startup {

    private String description;
    ProductDatabase[] productDatabase = new ProductDatabase[5];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("I'm in the Startup");
        PointOfSaleRegister pos = new PointOfSaleRegister(12, "00002060");
        pos.DisplayMessage();
        System.out.println("I'm in the Startup");
    }

//    public ProductDatabase[] getProductDatabase() {
//        return productDatabase;
//    }
//
//    public void ProductCodeLookup() {
//        for (int i = 0; i < productDatabase.length; i++) {
//            if (productDatabase[i].getProductCode().equals("886878841132")) {
//                System.out.println(productDatabase[i].getPrice());
//            }
//        }
//
//    }
}
