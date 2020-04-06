package S05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class S05_01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        String googleURL = "http://google.com";

        driver.get(googleURL);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
