package tugas3.YopMail;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import automation.pages.CommonPage;
import automation.pages.InboxPage;
import automation.pages.YopMailHomePage;

public class TestCaseTugas3 extends BaseWebTestTugas3{
	YopMailHomePage homePage = new YopMailHomePage(driver,explicitWait);
	CommonPage commonPage = new CommonPage(driver,explicitWait);
	InboxPage inboxPage = new InboxPage(driver,explicitWait);
	
    @Test
    public void getMessageOnFirstInbox()
    {
    	String email = "automationtest";
    	String line1 = "Hello,";
    	String line2 = "Your OTP is 123456. Please use this OTP within the next 5 minutes.";
    	String line3 = "Note: This is a system generated mail alert";
    	homePage.inputEmail(email);
    	commonPage.switchFrameByID("ifmail");
    	System.out.println(inboxPage.getMessageOnInbox());
    }
}
