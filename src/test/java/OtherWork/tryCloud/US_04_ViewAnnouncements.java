package OtherWork.tryCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US_04_ViewAnnouncements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://app.trycloud.net/index.php/login");
        /*--------------------------------------------------------
        As a user, I want to be able to view the Announcement page,
        so that I can keep up to date with the latest announcements.
        --------------------------------------------------------*/
        driver.findElement(By.id("user")).sendKeys("User34");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        // Announcements button
        driver.findElement(By.xpath("//*[@id=\'appmenu\']/li[7]/a")).click();
        driver.quit();
    }
}
