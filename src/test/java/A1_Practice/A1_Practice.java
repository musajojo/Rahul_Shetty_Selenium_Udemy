package A1_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String googleURL = "http://google.com";
        String facebookURL = "http://facebook.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffURL = "https://www.rediff.com/";
        driver.manage().window().maximize();
        driver.get(googleURL);

        /*
        $x("//div[@id='gb']")
        //div[@id='gb']/div[2]/div/div/div/div/a/class --- Wrong
        //div[@id='gb']/div[2]/div/div/div[1]/div[1]/a --- Correct

        /html/body/div/div[3]/div[2]/div/div/div[1]/div[1]/a
              //div[@id='gb']/div[2]/div/div/div[1]/div[1]/a/class

              //div[@id='gb']/div[2]/div/div/div/div/a
              and
              //div[@id='gb']/div[2]/div[1]/div[1]/div[1]/div[1]/a

         */

        System.out.println(driver.findElement(By.xpath("//div[@id='gb']/div[2]/div/div/div/div/a")).getText());
        Thread.sleep(1000);
        driver.quit();

    }
}
