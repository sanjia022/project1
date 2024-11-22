package SeleniumPackage1.SeleniumProject1;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import DataFiles.listener_logic;
@Listeners(listener_logic.class)
public class amz_Login_Correct_cred extends Launch_Quit {

	@Test(retryAnalyzer = DataFiles.retry_logic.class)

	public void loginToAmazon_correct_cred() throws InterruptedException, EncryptedDocumentException, IOException {

		amz_LoginPage login = new amz_LoginPage(driver);
		login.hoverOverOnAccount(driver);
		login.clickOnSignin();
		login.Emailphnfield();
		login.clickContinue();
		login.PasswordField();
		login.clickSignin();   
       
	//	Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");

	}
}