package SeleniumPackage1.SeleniumProject1;


import org.testng.Assert;
import org.testng.annotations.Test;



public class Amazon_Registration extends Launch_Quit {
	@Test(retryAnalyzer = DataFiles.retry_logic.class)
	
	public void createNewAmazon() throws InterruptedException {
		/*amz_Homepage a1 = new amz_Homepage(driver);
		a1.hoverOverOnAccount(driver);
		a1.clickOnSignin();*/
		
		amz_RegistrationPage r1 = new amz_RegistrationPage(driver);
		r1.hoveroverAccountandlink(driver);
		r1.clickOnStartHereLink();
		r1.enterName();
		r1.enterPnhNumber();
		r1.enterPassword();
		r1.RecheckPassword();
		r1.clickVerifyButton();
		
		Assert.assertEquals(driver.getTitle(), "Authentication required");;
		
		
	
		
		
	}

}
