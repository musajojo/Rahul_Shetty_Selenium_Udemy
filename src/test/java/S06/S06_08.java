package S06;
// Section 6, Video 33
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_08 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffLoginURL = "https://mail.rediff.com/";
        driver.manage().window().maximize();
        driver.get(saleforceLoginURL);

        // Get Text
        // This helps you to print out text onto your screen. It will collect the text and you can then print.
        driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("Hello");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#Login")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());

        Thread.sleep(2000);
        driver.quit();
    }
}
