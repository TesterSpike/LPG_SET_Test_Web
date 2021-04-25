package steps;

import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.AllInclusivePage;
import util.Driver;

public class All_InclusiveSteps extends BaseStep {
    private final ChromeDriver driver;
    private final WebDriverWait wait;

    public All_InclusiveSteps() {
        Driver.initialize();
        driver = Driver.driver;
        wait = Driver.wait;
    }

    @Given("I am on the All-Inclusive page")
    public void iAmOnTheAll_InclusivePage() {
        driver.get("https://gocity.com/boston/en-us/products/all-inclusive");
        AllInclusivePage allInclusive = new AllInclusivePage(driver, wait);
        Assertions.assertTrue(allInclusive.isLoaded(), "All Inclusive page title visible");
    }

}
