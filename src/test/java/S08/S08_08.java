package S08;
// Section 8, Video 57 (2of2),

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class S08_08 {
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
        57. Importance of Assertions in Automation testing and how to use them

        Assert.assertEquals();

        The syntax is as below, put a coma (,) after the basic drive request then type the expected data
        ex: Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        Basically it is asking does driver.findElement(By.id("divpaxinfo")).getText() -> Equal <- "5 Adult".

        If the data is as expected then the test will run and complete as usual saying anything.
        If the test fails then the test will stop running and tell you what was expected and what actually is.

        the .assertEquals(); can compare all types of data such as int, long, String. Check before choosing.
        //------------------------------------------------------*/
        Thread.sleep(1000);
        // PASSENGERS
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

        // Number of passengers Before Loop
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        for (int i = 1; i <5; i++) {
            // add (+) adult button - It starts at a default of 1,
            // so If I want 5 I need to click 4 more times
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        // Done
        driver.findElement(By.id("btnclosepaxoption")).click();
        // Number of passengers After Loop
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        // To see the test pass of fail, change the info at the end of the Assert accordingly.
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        driver.quit();
    }
}