package S08;
// Section 8, Video 53

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_04 {
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
        //53. Parent-Child relationship locator to Identify the objects Uniquely

        (//a[@value='MAA'])[2] --> Although this is a valid method some people may not prefer using Index method.
        Another method is as follows.

        We can decrease the search area for the Xpath by using the parent child relationship. If we have the
        child Xpath only search in the field of its parent then we will only get the desired child in that specific
        search area. We may have that same Xpath in other parts of the page, but we will not get those since it will
        not even search for them.
        The syntax is that we add the Child Xpath directly after the Parent Xpath and both will be searched for.

        Arrival City Xpath - Parent
        //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']

        Chennai Xpath - Child
        //a[@value='MAA']

        Arrival City and Chenni --> Parent and Child together
        //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']

        //------------------------------------------------------*/
        Thread.sleep(20000); // I added a longer wait time since the webpage took so long to load.
        // Departure City
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);
        // Bangaluru - From / Departure
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(1000);
        // Arrival City  and  //a[@value='MAA']  - Xpath for Chennai --> Both in one combined Xpath search
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        driver.quit();
    }
}
