package S07;
// Section 7, Video 41
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_02 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        driver.get(googlrURL);
        driver.manage().window().maximize();

        /*
       // Difference between Relative and Absolute Xpath

        Absolute Xpath:
        Is finding the Xpath by using all the steps starting from the Root node
        and going through the whole HTML DOM structure before reaching
        your desired point. The disadvantage to this is if any of the elements along the path change
        then your code will not work.
        Absolute Xpath starts with /html/body/......

        Relative Xpath:
        This is when you start in the middle of your HTML DOM structure and traverse from there until
        you reach your desired point.
        Relative Xpath starts with //tagName/.......

         */

        System.out.println(driver.findElement(By.xpath("//div[@id='gb']/div[2]/div/div/div/div[1]/a")).
                getText()); // Relative
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input")).
                sendKeys("Hello"); // Absolute
        driver.quit();

    }
}
