package S07;
// Section 7, Video 39
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_01 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        driver.get(googlrURL);

        // Xpath
        // Parent Child Relationship: this is used when there is no unique attributes to identify the object.
        // Go from Parent to Child using tags. Use the unique tag of the Parent then traverse to the Child

        // Inorder to validate the XPath put the below in the Chrome Console and search it:
        //      $x("//div[@class='a4bIc']/div/div[2]/input")
        // div and div[1] work the same, no difference as far as I can tell --> Personal note.

        // Store link
        System.out.println(driver.findElement(By.xpath("//div[@id='viewport']/div[3]/div/a[2]")).getText());
        // Gmail link
        System.out.println(driver.findElement(By.xpath("//div[@id='gb']/div[2]/div/div/div/div[1]/a")).getText());
        // Search box
        driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Hello");
        driver.quit();

        // This type of XPath is to be built by taking note of the different elements in the HTML,
        // until a path is created to the desired destination.
    }
}
