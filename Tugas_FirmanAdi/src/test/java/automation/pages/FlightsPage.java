package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPage extends BasePage {
	
	By priceLocator = By.xpath("//p[@class='blackText fontSize18 blackFont white-space-no-wrap']");
	
	public FlightsPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}
	
	public String getPriceBySectionNumber() {
		return getText(priceLocator);
	}

}
