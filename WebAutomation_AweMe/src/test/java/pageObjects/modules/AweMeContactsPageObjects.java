package pageObjects.modules;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.ExplicitWaiting;

public class AweMeContactsPageObjects extends PageFactoryInitializer{

	
	
	
	@FindBy(xpath="//ul[@class='op-contact-list']//li//a")
	WebElement ContactsList;
	
	@FindBy(id="contactName")
	WebElement ContactsTextbox;
	
	@FindBy(xpath="//ul//li//a//span[contains(.,'pramod')]")
	List <WebElement> SearchResult;
	
	@FindBy(xpath="//ul//li//a//i[@class='fal fa-phone']")
	WebElement PhoneLink;
	
	@FindBy(xpath="//ul//li//a//i[@class='fal fa-star']")
	WebElement FavouriteLink;
	
	@FindBy(xpath="//ul//li//a//i[@class='fal fa-user-edit']")
	WebElement ContactEditLink;
	
	public  AweMeContactsPageObjects VerifyContactsisLoaded() throws Exception
	{		
		
		//ExplicitWaiting.check(ContactsTextbox, 60);
		
		WebDriverWait clickableWait = new WebDriverWait(getWebDriver(), 5);
		clickableWait.until(ExpectedConditions.elementToBeClickable(ContactsList));
		
		//ExplicitWaiting.explicitWaitVisibilityOfElement(ContactsList, 60);
		
			return this;
	}
	
	
	
	public AweMeContactsPageObjects TypeonContactsTextbox() throws Exception
	{		
		
		WebDriverWait clickableWait = new WebDriverWait(getWebDriver(), 40);
		clickableWait.until(ExpectedConditions.elementToBeClickable(ContactsTextbox));
		ContactsTextbox.sendKeys("pramod");
		
		return this;		
	}
	
	
	
	
	public AweMeContactsPageObjects SearchonContactsTextbox() throws Exception
	{		
		
		
		VerifyContactsisLoaded();
		
		for (WebElement webElement : SearchResult) {
		   // System.out.println(webElement.getText());
		    //System.out.println(webElement.getAttribute("href"));
		    
		    if(webElement.getText().equals("pramod kumar g")){
		    	click(webElement);
		    	
		    //	System.out.println("i am here success fully");
		    }
		}
		
		return this;	
		
	}
	
	
	public AweMeContactsPageObjects ClickonCall() throws Exception
	{
		WebDriverWait clickableWait = new WebDriverWait(getWebDriver(), 40);
		clickableWait.until(ExpectedConditions.elementToBeClickable(PhoneLink));
		
		click(PhoneLink);
		return this;
	}
	
	
	
	public AweMeContactsPageObjects ClickonFavourite() throws Exception
	{
		WebDriverWait clickableWait = new WebDriverWait(getWebDriver(), 40);
		clickableWait.until(ExpectedConditions.elementToBeClickable(FavouriteLink));
		
		click(FavouriteLink);
		return this;
	}
	
	public AweMeContactsPageObjects ClickonEditContact() throws Exception
	{
		WebDriverWait clickableWait = new WebDriverWait(getWebDriver(), 40);
		clickableWait.until(ExpectedConditions.elementToBeClickable(ContactEditLink));
		
		click(ContactEditLink);
		return this;
	}
	
	
	public AweMeContactsPageObjects test() throws Exception
	{		
		
		VerifyContactsisLoaded();
		TypeonContactsTextbox();
		SearchonContactsTextbox();
		
		//ClickonCall();
		
		ClickonEditContact();
		
		//ClickonFavourite();
		
		
		return this;		
	}
	
	
	

	
	
	}
	
	

