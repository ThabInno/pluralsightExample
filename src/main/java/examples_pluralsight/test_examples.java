package examples_pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_examples {

    WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome,driver", "resourcers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.pluralsight.com");
    }

    public static void  main (String args []) {
        test_examples test = new test_examples();
        test.setUp();

    }
}
