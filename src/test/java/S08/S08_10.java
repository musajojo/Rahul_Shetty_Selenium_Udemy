package S08;
// Section 8, Video 60,

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_10 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        String rsAcadamyDdPrcticeURL = "https://rahulshettyacademy.com/dropdownsPractise/";
        String spiceJetURL = "https://www.spicejet.com/";
        String makeMyTripURL = "https://www.makemytrip.com/?ccde=us";
        driver.get(spiceJetURL);
        driver.manage().window().maximize();
        /*//------------------------------------------------------
        60. Validating if UI Elements are disabled or enabled with Attributes

        //------------------------------------------------------*/
        Thread.sleep(2000);

        driver.findElement(By.className("")).click();

        driver.quit();
    }
}