package S06;
// Section 6, Video 35
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_10 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffLoginURL = "https://mail.rediff.com/";
        driver.manage().window().maximize();
        driver.get(facebookURL);

        // Customized CSS



        driver.findElement(By.cssSelector("")).sendKeys("Hello");
        driver.findElement(By.cssSelector("")).sendKeys("123456");
        driver.findElement(By.cssSelector("")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
