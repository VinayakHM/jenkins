import org.testng.annotations.*;

public class BaseTest extends Base {

    @BeforeMethod
    public void initDriver() {
        launchBrowser();
    }
}
