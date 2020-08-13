package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class AweMeHomePageObjects extends PageFactoryInitializer {

	@FindBy(xpath="//ul//li[contains(.,'Notes')]")
	private WebElement NotesLink;
	
	
	
	@FindBy(xpath="//ul//li[contains(.,'Files')]")
	private WebElement FilesLink;
	
	
	
	@FindBy(xpath="//ul//li[contains(.,'Contacts')]")
	private WebElement ContactsLink;
	

	@FindBy(xpath="//ul//li[contains(.,'Tasks')]")
	private WebElement TasksLink;
	
	
	
	@FindBy(xpath="//ul//li[contains(.,'Settings')]")
	private WebElement SettingsLink;
	

	
	@FindBy(xpath="//ul//li[contains(.,'Get App')]")
	private WebElement GetAppLink;
	
	
	@FindBy(xpath="//ul//li[contains(.,'Logout')]")
	private WebElement LogoutLink;
	
	public AweMeHomePageObjects clickonNotesLink() throws Exception
	{		
		click(NotesLink);
		return this;		
	}
	
	
	
	
	public AweMeHomePageObjects clickonFilesLink() throws Exception
	{		
		click(FilesLink);
		return this;		
	}
	
	
	public AweMeHomePageObjects clickonContactsLink() throws Exception
	{		
		click(ContactsLink);
		return this;		
	}
	
	
	public AweMeHomePageObjects clickonTasksLink() throws Exception
	{		
		click(TasksLink);
		return this;		
	}
	
	
	
	
	public AweMeHomePageObjects clickonSettingsLink() throws Exception
	{		
		click(SettingsLink);
		return this;		
	}
	
	public AweMeHomePageObjects clickonGetAppLink() throws Exception
	{		
		click(GetAppLink);
		return this;		
	}
	
	
	public AweMeHomePageObjects clickonLogoutLink() throws Exception
	{		
		click(LogoutLink);
		return this;		
	}
	
}
