package tests;


import org.testng.annotations.Test;

import extentReport.ExtentTestManager;
import pages.CustomerDetailPage;
import pages.HomePage;
import pages.HotelDetailPage;
import pages.SelectHotelPage;


public class hotelBookingTest extends BaseTest {
    @Test (description="End to End Test")
    public void e2ETest () {
    	ExtentTestManager.getTest().setDescription("End To End Test");

    	HomePage homePage = new HomePage(driver);
        SelectHotelPage selectHotelPage;
    
        HotelDetailPage hotelDetailPage;
        CustomerDetailPage customerDetailPage; 

        homePage=homePage.goToSearchPage();
        
        selectHotelPage = homePage.goToLocation("Las Vegas");
        hotelDetailPage = selectHotelPage.goToHotel();
        hotelDetailPage=hotelDetailPage.selectRoomType();
        customerDetailPage = hotelDetailPage.goToCustDetail();
        customerDetailPage.enterPersonalDetail();
        customerDetailPage.enterPaymentDetail();
     
        
    }


}