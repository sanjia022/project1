package SeleniumPackage1.SeleniumProject1;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Amazon_Edit extends Launch_Quit {

	@Test

	public void EditProfile() throws EncryptedDocumentException, IOException, InterruptedException {

	
		amz_LoginPage login = new amz_LoginPage(driver);
		login.hoverOverOnAccount(driver);
		login.clickOnSignin();
		login.Emailphnfield();
		login.clickContinue();
		login.PasswordField();
		login.clickSignin();

		amz_Homepage h1 = new amz_Homepage(driver);
		h1.clickonAccountAndList();

		amz_EditPage a1 = new amz_EditPage(driver);
		a1.clickOnLoginAndsecurity();
		a1.clickOnEditName();
		a1.enterNewName("Sanjia Amreen");
		a1.clickOnSubmitButton();

		// Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
	}

}
