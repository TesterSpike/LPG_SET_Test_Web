package steps;

import org.junit.After;
import util.Driver;

public class BaseStep {

    @After
    public void after() {
        Driver.driver.quit();
    }
}
