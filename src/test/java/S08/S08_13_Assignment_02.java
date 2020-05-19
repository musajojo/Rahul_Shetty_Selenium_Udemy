package S08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_13_Assignment_02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cleartrip.com/");
        /*//------------------------------------------------------
        Assignment 2: UI(Dropdowns,EditBoxes,Error Validation…
        1. Select any number of adults from the drop down.
        2. Select any number of children from the drop down.
        3. Click on Depart on and select the current.
        4. Click on  More options: Class of travel, Airline preference
        5. Enter Preferred Airline name
        6. Click on Search Button.
        7. There will be an error message Print Out the error message in your console.
        //------------------------------------------------------*/
        Thread.sleep(2000);
        // Cookies bar
        driver.findElement(By.xpath("/html/body/dummygdpr[2]/div/div/div")).click();
        Thread.sleep(1000);

        // Adults
        driver.findElement(By.id("Adults")).click();
        driver.findElement(By.xpath("//*[@id=\'Adults\']/option[2]")).click();
        // Children
        driver.findElement(By.id("Childrens")).click();
        driver.findElement(By.xpath("//*[@id=\'Childrens\']/option[4]")).click();

        // Depart on
        driver.findElement(By.id("DepartDate")).click();
        // Current Date
        //driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[1]/table/tbody/tr[3]/td[6]")).click();
        driver.findElement(By.xpath("//*[contains(@class,'ui-state-highlight')]")).click();

        // More Options link
        driver.findElement(By.id("MoreOptionsLink")).click();
        // Preferred Airline box
        driver.findElement(By.id("AirlineAutocomplete")).click();
        // Search button
        driver.findElement(By.id("SearchBtn")).click();

        // Error message text
        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

        driver.quit();
    }
}


