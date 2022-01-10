import io.github.pramcharan.wd.binary.downloader.WebDriverBinaryDownloader;
import io.github.pramcharan.wd.binary.downloader.enums.BrowserType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RiverIslandSeleniumExercises {
    private final String url = "https://www.ripreprod.com/";
    private WebDriver driver;

    @Before
    public void setup() {
        WebDriverBinaryDownloader.create().downloadLatestBinaryAndConfigure(BrowserType.CHROME);
        driver = new ChromeDriver();
    }

    /**
     * Scenario 1 – Verify that a single product filter can be applied
     * ================================================================
     * 1. Navigate to Men -> Tops
     * 2. Apply Category filter: Size -> M
     * 3. Verify filter is applied.
     */
    @Test
    public void solution1() {


    }

    /**
     * Scenario 2 – Verify that multiple product filters can be applied
     * ================================================================
     * 1. Navigate to Women -> Dresses
     * 2. Apply Filters
     * 3. Size -> 8
     * 4. Colour -> Black
     * 5. Price -> £10 to £100
     * 6. Verify filters are applied.
     */
    @Test
    public void solution2() {


    }


    /**
     * Scenario 3 – Move wishlist item to bag
     * ================================================================
     * 1. Navigate to Boys -> Jeans
     * 2. Open any product
     * 3. Add the product to the wishlist
     * 4. View the wishlist
     * 5. Move wishlist item to bag
     * 6. Verify the wishlist is empty
     * 7. Verify the product is in the bag
     */
    @Test
    public void solution3() {


    }
}
