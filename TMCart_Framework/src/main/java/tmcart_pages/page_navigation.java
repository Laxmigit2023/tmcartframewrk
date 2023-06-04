package tmcart_pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.driver_factory;
import java.io.IOException;
import utilities.utilityFetchProperty;

public class page_navigation {
    static WebDriver driver ;
    public static void site_navigation() throws IOException {
        driver_factory.initializeddriver();
        driver.get(utilityFetchProperty.fetchPropertyValue("url"));
        driver.manage().window().maximize();
    }

}
