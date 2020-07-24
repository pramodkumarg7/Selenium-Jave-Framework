/**
 * 
 */
package pageObjects.initializePageObjects;

import org.openqa.selenium.support.PageFactory;

import controllers.BaseMethod;
import pageObjects.modules.AweMeContactsPageObjects;
import pageObjects.modules.AweMeHomePageObjects;
import pageObjects.modules.AweMeLoginPageObjects;
import pageObjects.modules.AweMeNotesPageObjects;



/**
 * @author ${Gladson Antony}
 * @date Sep 17, 2016
 * 
 */

public class PageFactoryInitializer extends BaseMethod 
{
	
	
	
	
	
	public AweMeLoginPageObjects AweMeLoginPage() 
	{
		return PageFactory.initElements(getWebDriver(), AweMeLoginPageObjects.class);
	}
	
	public AweMeHomePageObjects AweMeHomePage() 
	{
		return PageFactory.initElements(getWebDriver(), AweMeHomePageObjects.class);
	}
	
	public AweMeNotesPageObjects AweMeNotesPage() 
	{
		return PageFactory.initElements(getWebDriver(), AweMeNotesPageObjects.class);
	}
	
	public AweMeContactsPageObjects AweMeContactsPage() 
	{
		return PageFactory.initElements(getWebDriver(), AweMeContactsPageObjects.class);
	}
}
