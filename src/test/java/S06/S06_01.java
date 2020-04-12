package S06;
// Section 6, Video 27
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String facebookURL = "http://facebook.com";
        String googleURL = "http://google.com";
        String saleforceLoginURL = "https://login.salesforce.com/";
        String rediffURL = "http://rediff.com";
        driver.manage().window().maximize();
        driver.get(facebookURL);

        // Selenium Locators:
        // ID
        // Name
        // ClassName
        // LinkText
        // Partial Linktext
        // TagName
        // Xpath
        // CSS

        // In this example we are finding by ID.
        // sendKeys send what ever String you entered into the field that you picked.
        // In this case the Login box on the Facebook login page
        // Alphanumeric ID's may vary depending on the website, so make sure it doe not change.
        driver.findElement(By.id("email")).sendKeys("This is my first code");

        Thread.sleep(2000);
        driver.quit();
    }
}
//        id - Select element with the specified @id attribute.
//        Name - Select first element with the specified @name attribute.
//        Linktext - Select link (anchor tag) element which contains text matching the specified link text
//        Partial Linktext - Select link (anchor tag) element which contains text matching the specified partial link text
//        Tag Name - Locate Element using a Tag Name.
//        Class name - Locate Element using a class Name.
//        Css Select - the element using css selectors.
//        Xpath - Locate an element using an XPath expression.
