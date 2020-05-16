package OtherWork.tryCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US_07_StorageMemory {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://app.trycloud.net/index.php/login");
        /*--------------------------------------------------------
        As a user, I want to be able to read how much memory space I have used,
        so that I do not reach full capacity.
        --------------------------------------------------------*/
        driver.findElement(By.id("user")).sendKeys("User34");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        // Storage Memory
        System.out.println(driver.findElement(By.id("quotatext")).getText());
        driver.quit();
    }
}
