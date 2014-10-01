package discountstrategy;

/**
 * This class ...
 * 
 * Note: JavaDoc is not complete yet!
 *
 * @author jmiller
 * @version 14.10.01 alpha
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PointOfSaleRegister sale1 = new PointOfSaleRegister();
        sale1.startNewSale("00002060");
        sale1.addLineItem("886878841132", 1);
        sale1.addLineItem("008498255", 2);
        sale1.completeSale();
        
        PointOfSaleRegister sale2 = new PointOfSaleRegister();
        sale2.startNewSale("0");
        sale2.addLineItem("017133562060", 1);
        sale2.addLineItem("009270653", 2);
        sale2.addLineItem("001357375", 5);
        sale2.completeSale();
    }
}
