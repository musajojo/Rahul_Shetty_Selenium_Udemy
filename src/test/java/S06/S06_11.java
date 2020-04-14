package S06;
// Section 6, Video 36
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_11 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffURL = "https://www.rediff.com/";
        driver.manage().window().maximize();
        driver.get(rediffURL);

        // Regular Expressions

        // Sometimes the values keep on changing, especially if its alphanumeric
        // <input name="username123"> // Example
        // You can use Regular Expression to use Xpath and CSS by finding
        //   the constant portion in this case it would be 'username'
        // Can also be used if it is too long.

        // Xpath --> Example
        // //tagName[contains(@attribute,'value')]
        // //input[contains(@name,'username')]

        // CSS --> Example
        // tagName[attribute*='value']
        // input[name*='username']


        // <a href="https://mail.rediff.com/cgi-bin/login.cgi" title="Already a user? Sign in" class="signin">Sign in</a>
        // <input type="text" id="login1" maxlength="30" name="login" value="" tabindex="1">
        // <input type="password" id="password" name="passwd" value="" tabindex="2">
        // <input type="submit" name="proceed" value="Sign in" title="Sign in" tabindex="4" class="signinbtn">

        driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
        driver.findElement(By.cssSelector("input[id*='login']")).sendKeys("Hello");
        driver.findElement(By.xpath("//*[contains(@id,'pass')]")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[class*='signin']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
