package OtherWork.tryCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US_02_Create_NewFolder {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://app.trycloud.net/index.php/login");
        /*--------------------------------------------------------
        As a user, I want to be able to create new folders so that I can organize my files.
        --------------------------------------------------------*/
        driver.findElement(By.id("user")).sendKeys("User34");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        // Click on + icon
        driver.findElement(By.xpath("//*[@id=\'controls\']/div[2]/a/span[1]")).click();
        // Click on New Folder
        driver.findElement(By.xpath("//*[@id=\'controls\']/div[2]/div[2]/ul/li[2]/a/span[2]")).click();
        // Clear New Folder Name Box
        driver.findElement(By.xpath("//*[@id=\'view29-input-folder\']")).clear();
        Thread.sleep(1000);
        // Add name of New Folder
        driver.findElement(By.id("view29-input-folder")).sendKeys("Test01");
        // Click on Arrow that accepts new name
        driver.findElement(By.xpath("//*[@id=\'controls\']/div[2]/div[2]/ul/li[2]/a/form/input[2]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
