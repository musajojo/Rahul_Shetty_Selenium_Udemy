package S06;
// Section 6, Video 30
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_05 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffURL = "http://rediff.com";
        driver.manage().window().maximize();
        driver.get(facebookURL);




        Thread.sleep(2000);
        driver.quit();
    }
}
