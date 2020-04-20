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
        --------------------------------------------------------


        //*[@id="viewport"]
        //*[@id="hptl"]/a[2]
        /html/body/div/div[3]/div[1]/a[2]


         --------------------------------------------------------
         */

        System.out.println(driver.findElement(By.xpath("//div[@id='viewport']/div[3]/div/a[2]")).getText());
        Thread.sleep(1000);
        driver.quit();

    }
}
