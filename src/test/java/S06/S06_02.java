package S06;
// Section 6, Video 28
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffURL = "http://rediff.com";
        driver.manage().window().maximize();
        driver.get(facebookURL);

        // ID - Locator
        driver.findElement(By.id("email")).sendKeys("Hello");
        // Name - Locator
        driver.findElement(By.name("pass")).sendKeys("123456");
        // LinkText - If you see the anchor 'a' then this is a Link. You can use LinkText
        // This is the Forgot account? link on FB Login Page.
        // Use the whole text exactly as is in the 'a'
        driver.findElement(By.linkText("Forgot account?")).click();
        // The click order, clicks on the desired element


        Thread.sleep(2000);
        driver.quit();
    }
}
