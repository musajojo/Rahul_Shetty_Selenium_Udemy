package S07;
// Section 7, Video 42
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_03 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googlrURL = "http://google.com";
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        /* ------------------------------------------------------
       // How to identify siblings and traverse back to parent nodes with xpath?




         ------------------------------------------------------*/

        System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[1]/following-sibling::li[2]")).getText());
        driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[1]/following-sibling::li[2]")).click();
        driver.quit();

    }
}
