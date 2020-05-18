package S08;
// Section 8, Video 59,

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class S08_09 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        String rsAcadamyDdPrcticeURL = "https://rahulshettyacademy.com/dropdownsPractise/";
        String spiceJetURL = "https://www.spicejet.com/";
        String makeMyTripURL = "https://www.makemytrip.com/?ccde=us";
        driver.get(rsAcadamyDdPrcticeURL);
        driver.manage().window().maximize();
        /*//------------------------------------------------------
        59. Handling Calendar UI in travel websites using Selenium

        //------------------------------------------------------*/
        Thread.sleep(1000);

        driver.findElement(By.id("")).click();

        driver.quit();
    }
}