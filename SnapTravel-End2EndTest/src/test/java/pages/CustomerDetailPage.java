package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

import extentReport.ExtentTestManager;

public class CustomerDetailPage extends BasePage{
	
	public CustomerDetailPage(WebDriver driver) {
		super(driver);
	}
	
	By firstNameBy = By.id("first-name");
	By lastNameBy = By.id("last-name");
	By emailBy = By.id("email");
	By phoneNumBy = By.id("phone-number");
	By paymentDetailby = By.id("btn-next-to-payment");
	By paymentCardBy = By.xpath("//input[@id='pan']"); 
	By ExpDateBy = By.name("cc-exp");
	By cVVBy = By.id("cvv");
	By nameOnCardBy = By.id("billing-name");
	By addressBy = By.id("billing-address");
	By cityBy = By.xpath("//input[@id='city']");
	By zipCodeBy = By.xpath("//input[@id='zip']");
	By provinceBy = By.xpath("//select[@name='state']");
	By countryBy = By.xpath("//select[@name='country-name']");
	By iFrameForCardDetails = By.id("iframe");
	By cardNumberBy = By.xpath("//form[@id='tokenex']/input[1]");
	By completeBookingBy = By.xpath("//div[@class='src-booking_form-components-accordion-___accordion__accordion-body___2tkzV']//div[2]//button[1]");
	
	String firstName = "Mark";
	String lastName = "Wheeler";
	String emailId = "test@snaptravel.com";
	String phoneNum = "1234567890";
	String cardNum = "4111111111111111";
	String expDate = "1020";
	String cvv = "123";
	String nameOnCard = "Mark Wheeler";
	String address = "xyz";
	String city = "Seattle";
	String province = "Washington";
	String country = "United States";
	String zipCode = "12345"; 
	
	public void enterPersonalDetail() {
		ExtentTestManager.getTest().log(LogStatus.INFO, "Enter Personal Detail");
		
		writeText(firstNameBy,firstName);
		writeText(lastNameBy,lastName);
		writeText(emailBy,emailId);
		writeText(phoneNumBy,phoneNum);
		click(paymentDetailby);
	}
	
	public void enterPaymentDetail() {
		ExtentTestManager.getTest().log(LogStatus.INFO, "Enter Payment Detail");
		
		switchToFrame(iFrameForCardDetails);
		writeText(cardNumberBy,cardNum);
		switchToDefaultContent();
		writeText(ExpDateBy,expDate);		
		writeText(cVVBy,cvv);
		writeText(nameOnCardBy,nameOnCard);
		writeText(addressBy,address);
		driver.findElement(addressBy).sendKeys(Keys.TAB);
		writeText(cityBy,city);
		select(provinceBy,province);
		select(countryBy,country);
		writeText(zipCodeBy,zipCode);
		
		click(completeBookingBy);
	}
}
