package A1_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String googleURL = "http://google.com";
        String facebookURL = "http://facebook.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffURL = "https://www.rediff.com/";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        driver.manage().window().maximize();
        driver.get(googleURL);

        /*--------------------------------------------------------



         --------------------------------------------------------*/

        WebElement googleStore = driver.findElement(By.xpath("//div[@id='viewport']/div[3]/div/a[2]"));
        Thread.sleep(1000);
        System.out.println(googleStore.getText());
        Thread.sleep(1000);
        googleStore.click();

        driver.quit();


    }
}
