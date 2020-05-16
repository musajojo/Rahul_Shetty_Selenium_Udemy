package OtherWork.tryCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US_01_UploadPix {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://app.trycloud.net/index.php/login");
        /*--------------------------------------------------------
       As a user, I want to be able to upload pictures to Galley from my computer
       so that I have cloud access to them.
        --------------------------------------------------------*/
        driver.findElement(By.id("user")).sendKeys("User34");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(1000);
        // Gallery
        driver.findElement(By.xpath("//*[@id='appmenu']/li[3]/a")).click();
        Thread.sleep(1000);
        // Upload Button
        driver.findElement(By.xpath("//*[@id=\'controls\']/div[2]/a")).click();
        Thread.sleep(2000);
        // 2nd upload button
        // Getting the Xpath from the input of the HTML is the key to uploading. Then
        // put in send keys right away.
        //Image from PC --> Path to image location on the pc goes in the sendKeys
        driver.findElement(By.id("file_upload_start"))
                .sendKeys("C:\\Users\\wina\\Documents\\Musa_Stuff\\Programming" +
                        "\\Cybertek\\15-Online-QATesting\\Projects\\TryCloud\\You-Got-It-Dude-meme.jpg");
        Thread.sleep(1000);
        driver.quit();
    }
}

