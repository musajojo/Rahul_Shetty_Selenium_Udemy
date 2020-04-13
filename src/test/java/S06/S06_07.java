package S06;
// Section 6, Video 32
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_07 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffLoginURL = "https://mail.rediff.com/";
        driver.manage().window().maximize();
        driver.get(saleforceLoginURL);

        // Validation
        // If changes in the HTML code occur this may break your Xpath or Css, so you need to validate before using it.
        // In the inspect section click on Console
        // For Xpath - $x("") --> $x("//*[@id='forgot_password_link']")
        // For CSS   - $("") -->  $("#mydomainLink")
        // This works in both FireFox and Chrome

        System.out.println(driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).getText());
        System.out.println(driver.findElement(By.cssSelector("#mydomainLink")).getText());
        driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("Hello");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#Login")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
