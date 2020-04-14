package S06;
// Section 6, Video 35
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_10 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffLoginURL = "https://mail.rediff.com/";
        driver.manage().window().maximize();
        driver.get(facebookURL);

        // Customized CSS

        // tagName[attribute='value'] --> CSS Syntax
        // input[name='email'] --> actual CSS

        // If you want to to skip the tag name you can as well
        // [name='value']

        // Another Syntax is:
        // tagName#id
        // input#u_0_b

        // Additionl Syntax
        // tagName.className
        // h2._8est

        // Additional Syntax
        // #id
        // #u_0_b

        // to check CSS in Console put it in $("") --> $("input[name='email']")

        // Email Box
        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">

        // Password Box
        // <input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">

        // Login Button
        //<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_b">

        System.out.println(driver.findElement(By.cssSelector("h2._8est")).getText()); // tagName.className --> 'Sign Up' Text
        System.out.println(driver.findElement(By.cssSelector("#u_0_13")).getText()); // #id --> 'Sign Up' Button

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Hello"); // tagName[attribute='value']
        driver.findElement(By.cssSelector("[name='pass']")).sendKeys("123456"); // [name='value']
        driver.findElement(By.cssSelector("input#u_0_b")).click(); // input#u_0_b

        Thread.sleep(2000);
        driver.quit();
    }
}
