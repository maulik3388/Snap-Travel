package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

   
    public BasePage (WebDriver driver){
    	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        this.driver = driver;
        wait = new WebDriverWait(driver,5);
    }

    
    public WebElement waitVisibility(By elementBy) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    
    public void click (By elementBy) {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(elementBy);
		waitVisibility(elementBy);
		jse.executeScript("arguments[0].click();", element);
        
    }

    
    public void writeText (By elementBy, String text) {
    	WebElement element=waitVisibility(elementBy);
    	element.sendKeys(Keys.CONTROL + "a");
    	element.sendKeys(Keys.DELETE);
        element.sendKeys(text);
    }
    
    public void select(By elementBy, String text) {
    	WebElement element = driver.findElement(elementBy);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    
    public void clicked(By elementBy) {
    	
    	waitVisibility(elementBy).click();
    	
    }
    
    public void getNewWindowDriver() {
    	for(String winHandle : driver.getWindowHandles()){
    	    driver.switchTo().window(winHandle);
    	}
    }
    
    public void switchToFrame(By elementBy){
    	driver.switchTo().frame(waitVisibility(elementBy));
    }
    
    public void switchToDefaultContent(){
    	driver.switchTo().defaultContent();
    }
}
