import org.testng.annotations.*;

public class BaseTest extends Base {

    @BeforeTest
    public void initDriver() {
        launchBrowser();
    }

    @AfterTest
    public void tearDown(){
        closeBrowser();
    }
}
