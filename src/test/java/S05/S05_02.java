package S05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05_02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        String chromeURL = "http://google.com";
        String msnURL = "http://msn.com";
        String amazonURL = "http://amazon.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        String vTrekQA1URL = "https://qa1.vytrack.com/user/login";
        // vTrekQA1URL_userName = storemanager85
        // vTrekQA1URL_password = UserUser123

        driver.get(chromeURL);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get(msnURL);
        Thread.sleep(3000);
        driver.navigate().to(amazonURL);
        Thread.sleep(3000);
        driver.navigate().back(); // msn
        Thread.sleep(3000);
        driver.navigate().back(); // google
        Thread.sleep(3000);
        driver.navigate().forward(); // msn
        Thread.sleep(3000);
        driver.navigate().refresh(); // msn
        Thread.sleep(3000);
        System.out.println(driver.getTitle()); // msn
        driver.quit();
    }
}
