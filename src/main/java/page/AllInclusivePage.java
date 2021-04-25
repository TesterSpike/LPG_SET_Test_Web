package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllInclusivePage {
    private final String pageTitle = "All-Inclusive Pass";
    private final WebDriverWait wait;
    private final WebDriver driver;

    public AllInclusivePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isLoaded() {
        wait.until(ExpectedConditions.titleContains(pageTitle));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("react_product_selector"))));
        return driver.getTitle().contains(pageTitle);
    }
}
