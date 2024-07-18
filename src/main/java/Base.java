import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

    public WebDriver driver;
    public ChromeOptions chromeOptions;
    public static String browser;
    public static String AutomationName;

    static {
        System.out.println("Executing Static block");
        browser = System.getProperty("browser");
        AutomationName=System.getProperty("AutomationName");
        System.out.println("Executed Static block");
    }

    public void launchBrowser() {
        System.out.println("Browser running is : "+browser);
        System.out.println("Launch the browser.");
    }

    public void closeBrowser(){
        System.out.println("Close the browser.");
    }
}
