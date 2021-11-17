package tugas4.MakeMyTrip;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import automation.pages.FlightsPage;
import automation.pages.MyTripHomePage;
import utils.TestUtility;

public class TestCaseTugas4 extends BaseWebTestTugas4 {
	
	FlightsPage flightsPage = new FlightsPage(driver,explicitWait);
	MyTripHomePage homePage = new MyTripHomePage(driver,explicitWait);
	
    @Test
    public void validationPriceOnTopSection() {
      String destination = "Yogyakarta";
      String arrival = "Basel/Mulhouse";
      String ExpectedPrice = "₹ 58,585";
      String DepartureDate = "Mon Nov 29 2021";
      homePage.isLoginSuggestionExists();
      TestUtility.hardWait(2);
      homePage.selectDestination(destination);
      homePage.selectArrival(arrival);
      homePage.ClickDepartureDate(DepartureDate);
      homePage.clickSearchButton();
      System.out.println(flightsPage.getPriceBySectionNumber());
    }
}
