package A1_Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A1_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String googleURL = "http://google.com";
        String facebookURL = "http://facebook.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffURL = "https://www.rediff.com/";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        String rsAcadamyDdPrcticeURL = "https://rahulshettyacademy.com/dropdownsPractise/";
        String spiceJetURL = "https://www.spicejet.com/";
        String makeMyTripURL = "https://www.makemytrip.com/?ccde=us";
        driver.get(spiceJetURL);
        driver.manage().window().maximize();

        /*--------------------------------------------------------

         --------------------------------------------------------*/

        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());




        driver.quit();





    }
}
