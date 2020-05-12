package S08;
// Section 8, Video 55

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_05 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        String rsAcadamyDdPrcticeURL = "https://rahulshettyacademy.com/dropdownsPractise/";
        String spiceJetURL = "https://www.spicejet.com/";
        String makeMyTripURL = "https://www.makemytrip.com/?ccde=us";
        driver.get(makeMyTripURL);
        driver.manage().window().maximize();
        /*//------------------------------------------------------
        55. Handling AutoSuggestive dropdowns using Selenium

        AutoSuggestive dropdowns in when you start typing in an empty box
        and the words that are the same as what you are spelling begin to appear
        thus suggesting different possibilities before you are even done typing.

        .clear();
        Due to a change in the webpage's HTML code, I was unable to replicate the exact same steps.
        the  .clear();  method was used to clear the From and To boxes due to them being already
        populated by default. The method was used to clear them for the new names.

        WebElement
        WebElement can be used to create a variable that can be reused for different methods without having
        to reuse the same locators each time.

        .sendKeys(Keys.???) --> ex: .sendKeys(Keys.ENTER);
        This is a way to use the keyboard functions such as ENTER, ARROW_DOWN, and many other functions...
        //------------------------------------------------------*/

        Thread.sleep(3000);
        // Click on From header
        driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span")).click();

        //WebElements can be used to create variables inorder for them to be used over gain such as in the case of fromBox
        WebElement fromBox = driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));

        // Types mum for Mumbai in From text box
        fromBox.sendKeys("MUM");
        Thread.sleep(3000);
        // After mum is typed in Mumbai appears AutoSuggestive. Keys.ARROW_DOWN just like the key board is clicked
        fromBox.sendKeys(Keys.ARROW_DOWN);
        // Mumbai is selected and clicked on. Keys.ENTER in the same as Enter in the Keyboard.
        fromBox.sendKeys(Keys.ENTER);

        //WebElements can be used to create variables inorder for them to be used over gain such as in the case of toBox
        WebElement toBox = driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));

        // Types DEL for Delhi in From text box
        toBox.sendKeys("DEL");
        Thread.sleep(3000);
        // After DEL is typed in Delhi appears AutoSuggestive. Keys.ARROW_DOWN just like the key board is clicked
        toBox.sendKeys(Keys.ARROW_DOWN);
        // Delhi is selected and clicked on. Keys.ENTER in the same as Enter in the Keyboard.
        toBox.sendKeys(Keys.ENTER);

        // If I wanted to go farther down the list of names a loop can be used to click ARROW Down multiple times.

        Thread.sleep(2000);

        driver.quit();

    }
}
