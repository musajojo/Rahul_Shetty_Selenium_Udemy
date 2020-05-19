package S08;
// Section 8, Video 57 (1of2),

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class S08_07 {
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
        57. Importance of Assertions in Automation testing and how to use them

        Assert.assertTrue(); and Assert.assertFalse();

        TestNG is a testing framework. It brings assertions. It will be further discussed later.
        the TestNG Jar files are available on Maven repository,
        they can either be downloaded or added with dependencies via POM file.

        The Assert will tell you that the test has failed if received info is not as expected.

        If you have Assert.assertTrue(); and the outcome is expected to the true then nothing will happen
        and test will run as normal and be completed. Other wise if the expected outcome was false then
        test will Fail and test will stop running.

        If you have Assert.assertFalse(); and the outcome is expected to the false then nothing will happen
        and test will run as normal and be completed. Other wise if the expected outcome was true then
        test will Fail and test will stop running.

        When the test fails ity is not printed out, but just shows up and tells you in the run terminal.
        No print statement is necessary.
        //------------------------------------------------------*/
        Thread.sleep(1000);
        // Senior Citizen Button
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        // This will print out true or false depending on is button is clicked or not.
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // Instead of putting the .isSelected in a print statement we can put it inside an Assert.

        // In this situation it expects true. So true means that the test has failed, since we expected False
        //Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // In this situation it expects True. So true means that the test has passed, since we expected True
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.quit();

    }
}
