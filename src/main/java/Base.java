import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public WebDriver driver;
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
        driver = new ChromeDriver();
        driver.get("https://flipkart.com");
    }

    public void closeBrowser(){
        driver.quit();
    }
}
