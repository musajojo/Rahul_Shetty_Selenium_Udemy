package S07;
// Section 7, Video 44
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_04 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        /*
        ------------------------------------------------------
       //44. Identifying objects with Text using xpath locators

       In the rare occasion the inspect code is blocked or unavailable,
       the tag or text element can be used to find the Xpath.
       //*[text()='elementName'] --> Example
       //*[text()='Checkboxes'] --> Actual from "http://practice.cybertekschool.com/"

       Note: If there is a space in the word such as in the beginning or end, it needs to be added as well.
         ------------------------------------------------------
         */

        // Checkboxes
        System.out.println(driver.findElement(By.xpath("//*[text()='Checkboxes']")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Checkboxes']")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
