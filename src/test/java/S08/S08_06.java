package S08;
// Section 8, Video 56,

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_06 {
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
        56. Handling Checkbox and getting the size of them with Selenium

        Finding out whether something is or isn't selected using .isSelected())

        Counting the number of Checkboxes

        //------------------------------------------------------*/

        //  <input id="ctl00_mainContent_chk_SeniorCitizenDiscount" type="checkbox" name="ctl00$mainContent$chk_SeniorCitizenDiscount">
        // By using Regular Expression we can take just the unique section from the ID attribute and use it.
        // The star (*) allows it gto identyfy and ID that includes SeniorCitizenDiscount.

        // .isSelected tells you whether the checkbox is selected or not True = Selected; False = Not Selected
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        // SeniorCitizenDiscount
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        // .isSelected tells you whether the checkbox is selected or not True = Selected; False = Not Selected
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // Counting the number of Checkboxes
        // Find the Css that is applicable to all the checkboxes or the common attribute.
        // In this case 'type' 'checkbox'.
        //  CSS -> input[type='checkbox']
        // .findElements is necessary then .size and print it out
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.quit();
    }
}
