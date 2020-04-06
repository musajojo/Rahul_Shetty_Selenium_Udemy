package S06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_03  {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("http://facebook.com");

        ////tagName[@attribute='value']  - xpath
/*		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();*/

        //tagName[v='value']  -CSS
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
        driver.findElement(By.cssSelector("[value='Log In']")).click();
    }
}
