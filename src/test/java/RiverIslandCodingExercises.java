import enums.PromotionType;
import org.junit.Before;
import org.junit.Test;
import pojos.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by River Island
 */
public class RiverIslandCodingExercises {
    private List<Product> products = new ArrayList<>();

    @Before
    public void setup() {
        products.add(new Product(1, "White Jeans", new BigDecimal(12.99), PromotionType.WEB_ONLY));
        products.add(new Product(2, "Formal Shirt", new BigDecimal(99.99), PromotionType.MOBILE_ONLY));
        products.add(new Product(3, "Denim Shorts", new BigDecimal(23.99), PromotionType.NONE));
        products.add(new Product(4, null, new BigDecimal(10.00), PromotionType.WEB_ONLY));
        products.add(new Product(5, "Blue Dress", new BigDecimal(42.99), PromotionType.WEB_ONLY));
        products.add(new Product(2, "Formal Shirt", new BigDecimal(99.99), PromotionType.MOBILE_ONLY));
        products.add(new Product(6, "Blue Dress", new BigDecimal(0.99), PromotionType.WEB_ONLY));
    }

    /**
     * Exercise 1: Find duplicate products within the product list and print the 'product name'
     *
     * Requirement
     *      * Products must be an 'exact match' to be classified as a duplicate.
     */
    @Test
    public void solution1() {
        

    }

    // --------------------------------------------------------------------------------------------

    /**
     * Exercise 2: Calculate and print the sum of the highest 3 'product prices' from the product list
     */
    @Test
    public void solution2() {

        

    }

    // --------------------------------------------------------------------------------------------

    /**
     * Exercise 3: Sort the product list
     *
     * Requirement
     *      * Sort product list by 'product name' in reverse alphabetical order
     *      * Exclude all 'null' product names
     *      * Print out the sorted list (you can call product.toString())
     */
    @Test
    public void solution3() {

        

    }


    // --------------------------------------------------------------------------------------------
    /**
     *  Exercise 4: Create a new shopping bag interface. The interface should calculate the total discounted amount based on the shopping bag, PromotionType and discountPercentage.
     *              Implement 2 shopping bag classes (WebShoppingBag and MobileShoppingBag)
     *
     *  Requirement
     *      * Interface must include method:
     *              BigDecimal calculateTotalDiscount(List<Product> products, int discountPercentage);
     *
     *
     *      * The discount calculation must be applied to the relevant shopping bag.
     *
     *          * Example:
     *                  WebShoppingBag must only calculate product discounts with 'PromotionType.WEB_ONLY'
     *
     *                  MobileShoppingBag must only calculate product discounts with 'PromotionType.MOBILE_ONLY'
     *
     *
     *      * The discountPercentage must be applied to all applicable products.
     *
     *      * Print the discounted amount for each bag.
     */
    @Test
    public void solution4() {



    }
}