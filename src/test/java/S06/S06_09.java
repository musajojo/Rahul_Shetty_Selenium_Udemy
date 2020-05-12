package S06;
// Section 6, Video 34
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_09 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffLoginURL = "https://mail.rediff.com/";
        driver.manage().window().maximize();
        driver.get(facebookURL);

        // Customized Xpath

        // Facebook Login Button example:
        // <input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_4">
        // tagName - input
        // Attributes - class
        // Value - inputtext
        //
        // name = attribute
        // email = value

        //  //tagName[@attribute='value'] --> This is the Syntax for Xpath
        //   //input[@value='Log In']  --> You can select any attribute that is unique
        //   $x("//input[@value='Log In']")

        // Email box
        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
        // //*[@type='email'] --> The tagName can be replaced by a Star (*). Can be useful if it changes regularly

        // Password Box
        // <input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
        // //*[@id='pass'] --> This Xpath was from the Browser

        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Hello");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@value='Log In']")).click(); // Facebook Login Button Xpath Example

        Thread.sleep(2000);
        driver.quit();
    }
}
