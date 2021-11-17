package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopMailHomePage extends BasePage {
	
	By emailInput = By.xpath("//input[@id='login']");
	By emailInputArrowButton = By.xpath("//button[@title='Check Inbox @yopmail.com']");

	public YopMailHomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		System.out.println("Masuk Super");
		
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(),this);
	}
	
	public void inputEmail(String email) {
		clickAndWaitByXpath(emailInput);
		setText(emailInput,email);
        clickAndWaitByXpath(emailInputArrowButton);
	}
}
