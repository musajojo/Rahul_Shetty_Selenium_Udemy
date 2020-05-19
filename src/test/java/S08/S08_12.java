package S08;
// Section 8, Video 64,

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class S08_12 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        String rsAcadamyDdPrcticeURL = "https://rahulshettyacademy.com/dropdownsPractise/";
        String spiceJetURL = "https://www.spicejet.com/";
        String makeMyTripURL = "https://www.makemytrip.com/?ccde=us";
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        /*//------------------------------------------------------
        64. Handling Java Alerts using Selenium Webdriver

        The popup alert boxes are not part of the HTML so Selenium will not find it.
        It is JavaScript, so you need to tell Selenium to switch to the Alert Box inorder to
        ingteract with it. -->  driver.switchTo().alert()
        //------------------------------------------------------*/
        String name = "Smith";
        // Switch To Alert Example box - Enter Name
        WebElement submitName = driver.findElement(By.id("name"));
        submitName.sendKeys(name);
        // Alert
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(1000);
        // This switches to Alert. There are many options to choose from after the .alert() method.
        // In this case we have .getText(), so that we can read what the Alert Box says
        System.out.println(driver.switchTo().alert().getText());
        // This switches to Alert. The accept() method determines what you want to do with it.
        // In this case we are just accepting it.
        driver.switchTo().alert().accept();
        submitName.sendKeys(name);
        Thread.sleep(1000);
        // Confirm button
        driver.findElement(By.id("confirmbtn")).click();
        // See text of Alert
        System.out.println(driver.switchTo().alert().getText());
        // If you want to confirm of make a positive choice .accept()
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        submitName.sendKeys(name);
        Thread.sleep(1000);
        // Confirm button
        driver.findElement(By.id("confirmbtn")).click();
        // See text of Alert
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);
        // If you want to negate the popup or reject it use .dismiss()
        driver.switchTo().alert().dismiss();
        driver.quit();
    }

}
