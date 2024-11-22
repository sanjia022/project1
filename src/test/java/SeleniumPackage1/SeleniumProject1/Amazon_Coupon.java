package SeleniumPackage1.SeleniumProject1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Amazon_Coupon extends Launch_Quit{
	@Test(retryAnalyzer = DataFiles.retry_logic.class)
	
	public void couponUse() throws InterruptedException, EncryptedDocumentException, IOException {
		amz_LoginPage login = new amz_LoginPage(driver);
		login.hoverOverOnAccount(driver);
		login.clickOnSignin();
		login.Emailphnfield();
		login.clickContinue();
		login.PasswordField();
		login.clickSignin();
		amz_Homepage hp = new amz_Homepage(driver);
		hp.clickOncart();
		
		amz_ShoppingCartPage sp = new amz_ShoppingCartPage(driver);
		
		sp.ClickOnproceedToRetailCheckoutButton();
		
		amz_checkoutPage n1 = new amz_checkoutPage(driver);
		n1.ClickOnAddVouchar();
		n1.enterCoupon();
		n1.ClickOnApply();
		
	}

}
