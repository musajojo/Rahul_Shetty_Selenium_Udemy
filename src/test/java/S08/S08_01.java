package S08;
// Section 8, Video 49

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S08_01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String spiceJetURL = "https://www.spicejet.com/";
        driver.get(cybertekPracticeURL);
        driver.manage().window().maximize();
        /*//------------------------------------------------------
        //49. Handling Static dropdowns with Select webdriver API

        In order to select an item from a static dropdown list,
        I need to use the "Select" class that is offered by Selenium.

        Create a "Select" object first -->
        ex: Select object = new Select(arg);
        ex: Select object = new Select(driver.findElement(By.attribute("value")));
        ex: Select s = new Select(driver.findElement(By.id("state")));

        The webElement will need to be passed into the "Select" so that it knows the location of the dropdown.
        See above.

        There are then different methods that can be selected as needed. See below some examples.

        Inorder for this to work the HTML code needs to have a Select tag in it.
        Then below there needs to be a list of "option" tag
        //------------------------------------------------------*/

        // Dropdown Button
        driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[11]/a")).click();
        // State selection
        driver.findElement(By.cssSelector("#state")).click();
        Select s = new Select(driver.findElement(By.id("state")));

        s.selectByValue("DC");
        Thread.sleep(1000);

        s.selectByIndex(5); // California // Double Quote ("") not needed for selectByIndex.
        Thread.sleep(1000);

        s.selectByVisibleText("Virginia");
        Thread.sleep(1000);

        // Wyoming
        System.out.println(driver.findElement(By.xpath("//*[@id=\'state\']/option[52]")).getText());
        driver.quit();
    }
}
