package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.ChooseYourPassContainerPage;
import util.Driver;

public class InclusivePassContainerSteps extends BaseStep {
    private final ChromeDriver driver;
    private final WebDriverWait wait;

    public InclusivePassContainerSteps() {
        Driver.initialize();
        driver = Driver.driver;
        wait = Driver.wait;
    }

    @Given("I select the {string} pass from the Choose Your Pass container")
    public void iSelectThePassTypeFromTheChooseYourPassContainer(String passType) {
        ChooseYourPassContainerPage container = new ChooseYourPassContainerPage(driver, wait);
        container.selectPassType(passType);
    }

    @And("I select {int} adult and {int} child passes")
    public void iSelectAdultAndChildPasses(int adultCount, int childCount) {
        throw new io.cucumber.java.PendingException();
    }

    @When("I go to the checkout")
    public void iGoToTheCheckout() {
        throw new io.cucumber.java.PendingException();
    }
}
