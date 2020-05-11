package S08;
// Section 8, Video 55

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_05 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        String rsAcadamyDdPrcticeURL = "https://rahulshettyacademy.com/dropdownsPractise/";
        String spiceJetURL = "https://www.spicejet.com/";
        driver.get(spiceJetURL);
        driver.manage().window().maximize();
        /*//------------------------------------------------------
        55. Handling AutoSuggestive dropdowns using Selenium



        //------------------------------------------------------*/

        driver.findElement(By.xpath("")).click();

        driver.quit();
    }
}
