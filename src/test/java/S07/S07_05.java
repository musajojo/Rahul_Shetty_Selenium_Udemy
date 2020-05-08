package S07;
// Section 7, Video 46 and 47
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_05 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";
        String saleforceLoginURL = "https://login.salesforce.com/";
        driver.get(saleforceLoginURL);
        driver.manage().window().maximize();
        /*
        ------------------------------------------------------
       //46. Css Selectors locators

       xpath = //tagname[@attribute='value'] --> //input[@id='username'] -->
       //*[@id='username'] -> Only put star if you are sure it is unique, in this case tagname is not necessary

       Customizable Css:
       Css = tagname[attribute='value'] --> input[id='username'] -->
       [id='username'] -> also a short way ti write Css

       #id --> #Login

       If there is a class name and you want to shorten it add a dot (.) at the beginning,
       also if there are any spaces in the classname replace the space with a dot (.).
       .classname --> .fl.pr.db.tn3
         ------------------------------------------------------
         */

        //UserName
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Hello");
        //Password
        driver.findElement(By.cssSelector("[id='password']")).sendKeys("123456");
        //Login Button
        driver.findElement(By.cssSelector("#Login")).click();
        Thread.sleep(1000);
        //Remember me button
        System.out.println(driver.findElement(By.cssSelector(".fl.pr.db.tn3")).getText());

        driver.quit();
    }
}
