package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class AweMeLoginPageObjects extends PageFactoryInitializer {

	
	
	

	public AweMeLoginPageObjects verifyPageTitle() throws Exception 
	{
		Assert.assertEquals(getWebDriver().getTitle(), "Awe Me - Web");
		return this;
	}
	
	
	
	
}
