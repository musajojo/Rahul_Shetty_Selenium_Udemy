package S09;
// Section 9, Video 66,
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S09_01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String googlrURL = "http://google.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        String rsAcadamyDdPrcticeURL = "https://rahulshettyacademy.com/dropdownsPractise/";
        String spiceJetURL = "https://www.spicejet.com/";
        String makeMyTripURL = "https://www.makemytrip.com/?ccde=us";
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        /*//------------------------------------------------------
        66. Code formatting and Debugging


        //------------------------------------------------------*/
        Thread.sleep(1000);

        driver.findElement(By.xpath("")).click();

        driver.quit();
    }

}
