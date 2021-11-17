package automation.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage extends BasePage {

	public CommonPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}

	public void openURL(String url) {
		driver.get().get(url);
	}
	
	public void openNewTab() {
		driver.get().switchTo().newWindow(WindowType.TAB);
	}
	
	public void openNewWindow() {
		driver.get().switchTo().newWindow(WindowType.WINDOW);
	}
	
	public void switchWindow(int index) {
		Set<String> handles = driver.get().getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(handles);
		driver.get().switchTo().window(tabs.get(index));
	}
	
	public void navigateBrowser(String actionName) {
		if(actionName.equalsIgnoreCase("forward")) {
			driver.get().navigate().forward();
		}
		if(actionName.equalsIgnoreCase("back")) {
			driver.get().navigate().back();
		}
		if(actionName.equalsIgnoreCase("refresh")) {
			driver.get().navigate().refresh();
		}
	}
	
	public void runJavaScriptCommand(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript(script);
	}
	
	public void acceptAlert() {
		driver.get().switchTo().alert().accept();
	}
	
	public void switchFrameByID(String name) {
		explicitWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.id(name)));
		driver.get().switchTo().frame(name);
	}
	
	public void switchFrameToDefault() {
		driver.get().switchTo().defaultContent();
	}
	
	public int isElementExists(By ELEMENT){
		List<WebElement> dynamicElement = driver.get().findElements(ELEMENT);
		return dynamicElement.size();
	}

}
