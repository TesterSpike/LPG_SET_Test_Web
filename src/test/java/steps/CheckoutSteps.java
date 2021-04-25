package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Driver;

public class CheckoutSteps extends BaseStep {
    private final ChromeDriver driver;
    private final WebDriverWait wait;

    public CheckoutSteps() {
        Driver.initialize();
        driver = Driver.driver;
        wait = Driver.wait;
    }

    @Then("I will see my inclusive pass details")
    public void iWillSeeMyInclusivePassDetails() {
        throw new io.cucumber.java.PendingException();
    }
}
