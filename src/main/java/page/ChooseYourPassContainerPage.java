package page;

import constant.PassType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChooseYourPassContainerPage {

    private final WebDriver driver;
    private final By containerSelector = By.id("react_product_selector");
    private final By passTypeSelector = By.cssSelector("div[class='cart-product-stack--dropdown__select']>select");

    public ChooseYourPassContainerPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(containerSelector)));
    }

    public ChooseYourPassContainerPage selectPassType(String passType) {
        WebElement container = driver.findElement(containerSelector);
        Select passTypeSelect = new Select(container.findElement(passTypeSelector));
        passTypeSelect.selectByValue(PassType.findByPass(passType).getSelectValue());
        return this;
    }
}