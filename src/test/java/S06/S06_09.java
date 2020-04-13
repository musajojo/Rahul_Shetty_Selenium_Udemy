package S06;
// Section 6, Video 34
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_09 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffLoginURL = "https://mail.rediff.com/";
        driver.manage().window().maximize();
        driver.get(facebookURL);

        // Customized Xpath

//        driver.findElement(By.xpath("")).sendKeys("Hello");
//        driver.findElement(By.xpath("")).sendKeys("123456");
//        driver.findElement(By.xpath("")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
