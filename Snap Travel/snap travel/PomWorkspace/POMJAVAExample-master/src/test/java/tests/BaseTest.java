package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setup () {
  
    	System.setProperty("webdriver.chrome.driver", "chromedriverOld.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    }

}
