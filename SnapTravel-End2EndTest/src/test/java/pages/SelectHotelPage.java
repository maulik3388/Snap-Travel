package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;

import extentReport.ExtentTestManager;

public class SelectHotelPage extends BasePage{

    public SelectHotelPage(WebDriver driver) {
        super(driver);
    }

    By hotelBy = By.xpath("//body/div[@id='root']/div[@class='src-components-hotels_components-styles-___hotels_screen_desktop_styles__hotels-screen-container___tuG3z']/div[@class='st-row src-components-hotels_components-styles-___hotels_screen_desktop_styles__container___2Z89o']/div[@class='st-col-11']/div/div[1]/div[1]/div[1]");
      

    public HotelDetailPage goToHotel (){
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Navigate to Hotel detail Page");
    	
    	clicked(hotelBy);
        getNewWindowDriver();
        return new HotelDetailPage(driver);
    }

}