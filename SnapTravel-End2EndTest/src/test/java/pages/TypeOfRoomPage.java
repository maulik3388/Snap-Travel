package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TypeOfRoomPage extends BasePage{
	
	public TypeOfRoomPage(WebDriver driver) {
        super(driver);
    }

    By selectRoomBy = By.xpath("//div[@class='src-hotel_cards-ComparisonHeader-___ComparisonHeader__button___2gwDL']");
    By reserveBy = By.xpath("//div[@class='test-button src-components-hotels_components-styles-___hotel_card_button_desktop__color_green___BiBud src-components-hotels_components-styles-___hotel_card_button_desktop__button___tNkRU']");
  
   // public 
    		
}
