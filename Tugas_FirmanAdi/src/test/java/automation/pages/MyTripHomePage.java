package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.TestUtility;

public class MyTripHomePage extends BasePage {
	
	CommonPage commonPage = new CommonPage(driver,explicitWait);
	//Destination
	By departureSelector = By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']");
	By searchDeparture = By.xpath("//input[@placeholder='From']");
	//input[@placeholder='To']
	//input[@placeholder='To']
	//Arrival
	By searchArrival = By.xpath("//input[@placeholder='To']");
	By arrivalSelector = By.xpath("//div[@class='fsw_inputBox searchToCity inactiveWidget ']");
	
	By itemNo1 = By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']");
	By searchButton = By.xpath("//p[@class='makeFlex vrtlCenter ']");
	By loginSuggestionMessage = By.xpath("//div[@class='autopop__wrap makeFlex column defaultCursor']");
	By login = By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']");
	String selectDepartureDate = "//div[@aria-label='%s']";
	

	public MyTripHomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}
	
	public void isLoginSuggestionExists() {
		if(commonPage.isElementExists(loginSuggestionMessage) == 1){
			clickAndWaitByXpath(login);
		}
	}

	public void selectDestination(String destination) {
		clickAndWaitByXpath(departureSelector);
		setText(searchDeparture, destination);
		TestUtility.hardWait(1);
		clickAndWaitByXpath(itemNo1);
	}
	
	public void selectArrival(String arrival) {
		setText(searchArrival, arrival);
		TestUtility.hardWait(1);
		clickAndWaitByXpath(itemNo1);
	}
	
	public void ClickDepartureDate(String date) {
		By departureDate = By.xpath(String.format(selectDepartureDate, date));
		clickAndWaitByXpath(departureDate);
	}
	
	public void clickSearchButton() {
		clickAndWaitByXpath(searchButton);
	}
	
}
