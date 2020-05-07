package S07;
// Section 7, Video 46
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_05 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        /*
        ------------------------------------------------------
       //46. Css Selectors locators


         ------------------------------------------------------
         */

        System.out.println(driver.findElement(By.cssSelector("")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
