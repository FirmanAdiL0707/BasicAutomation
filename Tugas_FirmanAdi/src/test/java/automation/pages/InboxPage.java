package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InboxPage extends BasePage {
	
	String containText = "//span[contains(text(),'%s')]";

	public InboxPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}
	
	public String getMessageOnInbox() {
		By resultXpath = By.xpath("//tbody/tr/td/div[3]/div[1]/div[1]");
		return getText(resultXpath);
	}

}
