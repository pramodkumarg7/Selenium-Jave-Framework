package tests;

import java.sql.Driver;

import org.testng.annotations.Test;

import controllers.ExcelDataProvider;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.ExplicitWaiting;


public class AweMe_TestCase1 extends PageFactoryInitializer {

	@Test
	//@Test(dataProvider="excelSheetNameAsMethodName",dataProviderClass=ExcelDataProvider.class)
	public void AweMe() throws Exception
	{
		AweMeLoginPage().verifyPageTitle();
		
		
		
		 ///loginPage().Login("pramod","pass");
		
		
		//wait for otp verification hard code to get completed
		Thread.sleep(ThreadWait);

		//AweMeHomePage().functional_test();
		
		/*
		AweMeHomePage().clickonNotesLink();
		
		AweMeNotesPage().typeTitleTextbox();
		
		AweMeNotesPage().typeDescriptionTextbox();
		
		AweMeNotesPage().clicksaveButton();*/
		
		/*AweMeHomePage().clickonFilesLink();
		
		AweMeHomePage().clickonContactsLink();
		
		AweMeHomePage().clickonTasksLink();
		
		AweMeHomePage().clickonSettingsLink();
		*/
		//AweMeHomePage().clickonGetAppLink();
		
		//AweMeHomePage().clickonLogoutLink();
		AweMeHomePage().clickonContactsLink();
		
	
		//Thread.sleep(ThreadWait);
		//AweMeContactsPage().TypeonContactsTextbox();
		
	
		
		//AweMeContactsPage().SearchonContactsTextbox();
		//Thread.sleep(ThreadWait);
		AweMeContactsPage().test();
		Thread.sleep(ThreadWait);
		Thread.sleep(ThreadWait);
	}
	
}
