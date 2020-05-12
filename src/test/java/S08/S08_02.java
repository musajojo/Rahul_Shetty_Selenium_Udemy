package S08;
// Section 8, Video 50,

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
        String rsAcadamyDdPrcticeURL = "https://rahulshettyacademy.com/dropdownsPractise/";
        String spiceJetURL = "https://www.spicejet.com/";
        driver.get(rsAcadamyDdPrcticeURL);
        driver.manage().window().maximize();
        /*//------------------------------------------------------
        //50. Updated lecture on latest Dropdown looping UI

        In the case that you have the same button that needs to be clicked
        multiple times then you will need to use a Loop. It is
        not good practice to write the same code multiple time such as

                driver.findElement(By.xpath("")).click();

        over and over again to get your result. A Loop is the most professional way.
        //------------------------------------------------------*/
        // PASSENGERS
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

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
        driver.quit();
    }
}
