package S07;

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








    }
}
