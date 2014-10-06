package discountstrategy;

/**
 * This interface ...
 * 
 * Note: JavaDoc is not complete yet!
 *
 * @author John Miller
 * @version 1.0.0
 */
public interface DataAccessStrategy {

    public abstract Customer customerSearch(String customerNumber);

    public abstract Product productSearch(String productCode);
    
}
