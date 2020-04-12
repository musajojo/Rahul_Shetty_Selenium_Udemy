package S06;
// Section 6, Video 29
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_03 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffURL = "http://rediff.com";
        driver.manage().window().maximize();
        driver.get(facebookURL);

        // If you have a class name with spaces, Selenium will not accept it. No Compound Classes
        // This example is from "https://login.salesforce.com/"
        // driver.findElement(By.className("button r4 wide primary")).click(); // Error
        driver.findElement(By.className("inputtext")).sendKeys("Hello"); // Facebook // Valid ClassName
        driver.findElement(By.name("pass")).sendKeys("123456");



        Thread.sleep(2000);
        driver.quit();
    }
}
