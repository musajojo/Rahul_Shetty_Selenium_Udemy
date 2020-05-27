package OtherWork.tryCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US_05_TalkMsgs {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://app.trycloud.net/index.php/login");
        /*--------------------------------------------------------
        As a user, I want to be able to create New Public Conversations and send out a message on the Talk feature,
        so that I can communicate with my colleagues.
        --------------------------------------------------------*/
        driver.findElement(By.id("user")).sendKeys("User34");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        // Talk button
        driver.findElement(By.xpath("//*[@id=\'appmenu\']/li[4]/a")).click();
        Thread.sleep(1000);
        // Click on New Conversations box
        driver.findElement(By.id("select2-chosen-3")).click();
        Thread.sleep(2000);
        // New Public Conversation 
        driver.findElement(By.xpath("//*[@id=\'select2-results-3\']/li[2]")).click();
        Thread.sleep(1000);
        // New Message
        driver.findElement(By.xpath("//*[@id=\'chatView\']/div[2]/form/div[1]")).sendKeys("Hi All!");
        // Send Message arrow
        driver.findElement(By.xpath("//*[@id=\'chatView\']/div[2]/form/input")).click();

        driver.quit();
    }
}
