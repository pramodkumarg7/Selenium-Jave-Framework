package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class AweMeNotesPageObjects extends PageFactoryInitializer {

	@FindBy(xpath="//input[@id='titleText']")
	private WebElement TitleTextbox;
	

 
	@FindBy(xpath="//div[@class='ql-editor']")
	private WebElement DescriptionTextbox;
	
	

	 
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButton;
	
	
	
	public AweMeNotesPageObjects typeTitleTextbox() throws Exception
	{		
	TitleTextbox.sendKeys("Sample title");
		return this;		
	}
	
	
	public AweMeNotesPageObjects typeDescriptionTextbox() throws Exception
	{		
		DescriptionTextbox.sendKeys("this is the description");
		return this;		
	}
	
	public AweMeNotesPageObjects clicksaveButton() throws Exception
	{		
	click(saveButton);
		return this;		
	}
	
	
	
	
	
}
