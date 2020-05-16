package OtherWork.tryCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US_06_Favorites {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://app.trycloud.net/index.php/login");
        /*--------------------------------------------------------
        As a user, I want to be able to view my favorite files,
        so that I can have quick and easy access to them.
        --------------------------------------------------------*/
        driver.findElement(By.id("user")).sendKeys("User34");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        // Favorites
        driver.findElement(By.xpath("//*[@id=\"app-navigation\"]/ul/li[3]/a")).click();
        driver.quit();
    }
}
