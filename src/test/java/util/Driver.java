package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class Driver {
    public static ChromeDriver driver;
    public static WebDriverWait wait;

    public static void initialize() {
        if(driver == null) {
            System.out.println("Initialising driver");
            WebDriverManager.chromedriver().setup(); //gets matching version of the chrome driver for the test system
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10000);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            System.out.println("finished initialising");
        }
    }

    public static void quit()
    {
        driver.quit();
        driver=null; // we destroy the driver object after quit operation
    }
    public static void close()
    {
        driver.close();
        driver=null;  // we destroy the driver object after quit operation
    }
}
