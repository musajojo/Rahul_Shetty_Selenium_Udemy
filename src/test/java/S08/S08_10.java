package S08;
// Section 8, Video 60,

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class S08_10 {
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
        60. Validating if UI Elements are disabled or enabled with Attributes

        .isEnabled())
        Selenium offers a method that can tell you whether and element is enabled or disabled.
        Unfortunately this is not always consistent, so may not work as planned
        This method is .isEnabled(), it works similarly to the .isSelected()) method at the end
        of the driver.findElement() method.
        //------------------------------------------------------*/
        Thread.sleep(3000);

        // In this scenario it does not work because the element is in fact enabled and
        // only appears disabled. It is only less opaque until the Round Trip or
        // Multicity radio buttons are chosen. For this reason you will get an incorrect
        // expected response when putting .isEnabled())
        // Return Date - It is enabled even though it does not look like it. outcome True.
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

        // Return Date Calender
        // This is the style output before Round Trip button is clicked
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        // Round Trip button
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        // Return Date Calender
        // This is the style output after Round Trip button is clicked
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        // In this if statement we will print out whether the Return Date is enabled or disabled.
        // This is in the sense that it is showing up in its regular bolder font than its less opeque font.
        // Pre Round trip opacity is set at 0.5
        // Post Round trip opacity is set at 1
        // if statement will reflect that and print out result according to what it finds.
        // The line showing opacity -->                           .....opacity: 0.5;" xpath="1">
        // <div id="Div1" class="picker-second" style="display: block; opacity: 1;" xpath="1">
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
        System.out.println("it's enabled");
        Assert.assertTrue(true); // will work if opacity is 1. Thus "enabled"
        }else{
        Assert.assertTrue(false); // will work if opacity is 0.5 Thus "disabled"
        }

        driver.quit();
    }
}

