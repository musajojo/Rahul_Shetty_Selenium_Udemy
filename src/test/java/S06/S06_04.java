package S06;
// Section 6, Video 29
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_04 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffURL = "http://rediff.com";
        driver.manage().window().maximize();
        driver.get(facebookURL);


        // If two elements happen to have the same value, Selenium will only identify the first one.
        // The page gets scanned from top left to bottom.
        driver.findElement(By.className("inputtext")).sendKeys("Hello"); // This is first so will be used
        // driver.findElement(By.className("inputtext")).sendKeys("123456"); // Password, nothing will happen.
        // -->  It will still enter in the email box
        driver.findElement(By.name("pass")).sendKeys("123456"); // Password, Needs to be different



        Thread.sleep(2000);
        driver.quit();
    }
}
