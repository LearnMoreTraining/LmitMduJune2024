package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserBase {

    public WebDriver getDriver(){
        WebDriver driver = new ChromeDriver(); //local variable
        driver.get("https://learnmoreplayground.blogspot.com/p/alerts.html");
        return driver;
    }
}
