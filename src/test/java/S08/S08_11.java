package S08;
// Section 8, Video 62,

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class S08_11 {
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
        62. End to End Automation using all UI Elements with selenium

        If anything is not understood please refer bach to previous examples.
        //------------------------------------------------------*/
        Thread.sleep(3000);
        // One Way radio button.
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        // FROM
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        // Delhi
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        // Arrival City
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        Thread.sleep(1000);
        // Arrival City  and  //a[@value='MAA']  - Xpath for Chennai --> Both in one combined Xpath search
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        // Calender automatically opens and is automatically set to the current date, which I just click on.
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        // Checking to see is the Return Date field is "disabled".
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("it's disabled");
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
        // SeniorCitizenDiscount Button
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        // Passengers Drop Down
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        // Adult Passanger
        driver.findElement(By.id("adultDropdown")).click();
        // Number of passengers - 5
        driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_Adult\']/option[5]")).click();
        // Passengers Drop Down
        driver.findElement(By.id("divpaxinfo")).click();
        // Search
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

        Thread.sleep(2000);
        driver.quit();
    }

}
