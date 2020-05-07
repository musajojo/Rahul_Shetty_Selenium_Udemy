package S07;
// Section 7, Video 42
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_03 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        /* ------------------------------------------------------
       // How to identify siblings and traverse back to parent nodes with xpath?

       Identifying sibling by using siblings. This is rare, for example
       if the the parent is dynamic and the child is static then find the static child
       and then you can go from there and find its sibling. Use->  following-sibling::
       example: "//*[@id=\'content\']/ul/li[1]/following-sibling::li[2]"

       We can also traverse from child to parent in Xpath by using the following->  parent::ul
       example: "//*[@id='content']/ul/li[5]/parent::ul"

         ------------------------------------------------------*/
        // A/B Testing
        System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[1]")).getText());
        // Add/Remove Elements
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[1]/following-sibling::li[1]")).getText());
        // Add/Remove Elements - Regular Xpath
        driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[2]/a")).click();

        Thread.sleep(2000);
        driver.navigate().back();

        //Broken Images
        System.out.println(driver.findElement(By.xpath("//*[@id='content']/ul/li[5]")).getText());
       // Parent - This is the whole list of ul's
        System.out.println(driver.findElement(By.xpath("//*[@id='content']/ul/li[5]/parent::ul")).getText());

        driver.quit();
    }
}
