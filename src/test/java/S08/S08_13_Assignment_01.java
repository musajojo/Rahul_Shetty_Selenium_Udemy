package S08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class S08_13_Assignment_01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        /*//------------------------------------------------------
        Assignment 1: Checkboxes exercise.

        Navigate to Below URL:
        https://rahulshettyacademy.com/AutomationPractice/
        There are 3 Checkboxes displayed in the Page.

        Questions for this assignment

        1. Check the first Checkbox and verify if it is successfully checked
        and Uncheck it again to verify if it is successfully Unchecked

        2. How to get the Count of number of check boxes present in the page
        //------------------------------------------------------*/
        Thread.sleep(2000);

        // Checkbox Example

        // Checkbox 1 - Selecting
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        // Checkbox 1 - Deselecting
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

        // How many Checkboxes
        System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());


        driver.quit();
    }
}
