package discountstrategy;

import javax.swing.JOptionPane;

/**
 * This class is used to start the program. It passes hard coded values to a POS register object 
 * to simulate starting a sale with a new customer id, a scanned bar code and the quantity purchased.
 * 
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public class Startup {
    
    /**
     * Starts program by creating a new POS Register object.
     * @param args - not used
     */
    public static void main(String[] args) {
        try {
        PointOfSaleRegister sale = new PointOfSaleRegister(new FakeDatabase());
        
        sale.startNewSale("00002060");
        sale.addLineItem("878841132", 1);  
        sale.addLineItem("008498255", 2);
        sale.completeSale();

        sale.startNewSale("00000000");
        sale.addLineItem("133562060", 1);
        sale.addLineItem("009270653", 2);
        sale.addLineItem("001357375", 5);
        sale.completeSale();
        
        } catch (IllegalArgumentException e) {
        
        JOptionPane.showMessageDialog(null, e);
    }
    }
}
