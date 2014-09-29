package discountstrategy;

/**
 *
 * @author jmiller
 */
public class Startup {

    private String description;
    ProductDatabase[] productDatabase = new ProductDatabase[5];
    private static ConsoleReceipt consoleReceipt;
    private static ReceiptStrategy receipt = new ConsoleReceipt();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("I'm in the Startup");

        startNewSale1();
        System.out.println("I'm back in the Startup");
    }

    public static void startNewSale1() {
        PointOfSaleRegister register = new PointOfSaleRegister(receipt, "00002060");
        register.AddLineItem("886878841132");
        register.AddLineItem("008498255");
        register.AddLineItem("886878841132");
        register.AddLineItem("008498255");

    }

    public static void addItem1() {

    }

    public static void addItem2() {

    }

    public static void addItem3() {

    }

    public static void completeSale1() {

    }

}
