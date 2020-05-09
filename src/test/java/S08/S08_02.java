package S08;
// Section 8, Video 50

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S08_02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String spiceJetURL = "https://www.spicejet.com/";
        driver.get(cybertekPracticeURL);
        driver.manage().window().maximize();
        /*//------------------------------------------------------
        //50. Updated lecture on latest Dropdown looping UI



        //------------------------------------------------------*/

        driver.findElement(By.xpath("")).click();

        System.out.println(driver.findElement(By.xpath("")).getText());
        driver.quit();
    }
}
