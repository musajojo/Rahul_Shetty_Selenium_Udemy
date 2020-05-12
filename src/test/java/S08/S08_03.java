package S08;
// Section 8, Video 52,

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_03 {
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
        //52. Handle Dynamic dropdowns with Webdriver API

        In this situation the TO City drop downs only load after the FROM City dropdown in chosen.
        This is why it is Dynamic.

        There are two separate dropdowns. The Xpath is the same for both, so once the first city is chosen
        and the drop down is closed, the Xpath will no longer work. This is because the Xpath is still
        looking for the first cities Xpath in the first drop down, and it can no longer see it.
        Inorder to tell Selenium to search for the second dropdown list you must change it a bit
        with different syntax --> (//a[@value='MAA'])[2] - Put the whole Xpath in () and add [] at the
        end with the number of the desired Node. In this case it is 2. //a[@value='MAA'] --> Original Xpath

         //a[@value='MAA']      --> This will work for the first drop down since Selenium chooses the first one it finds
        (//a[@value='MAA'])[2]  --> This is needed for second drop down since Selenium needs to be told the second is required.

        //------------------------------------------------------*/
        Thread.sleep(10000); // I added a longer wait time since the webpage took so long to load.
        // Departure City
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);
        // Bangaluru - From / Departure
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        // Arrival City
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        Thread.sleep(1000);
        // Chennai airport - TO / Destination
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.quit();
    }
}
