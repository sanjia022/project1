package SeleniumPackage1.SeleniumProject1;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_CheckoutProcess  extends Launch_Quit {

	@Test(retryAnalyzer = DataFiles.retry_logic.class)
	public void checkoutProcessMethod() throws InterruptedException, EncryptedDocumentException, IOException {
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
	
		n1.clickOnChangeAddressLink();
        n1.selectingAddress();
		n1.clickOndeliveryAddress();
		//n1.clickOnChangePayment(driver);
		
	
		//n1.clickToSelectingPayment(driver);
		//n1.clickTouseThisPaymentMethod();
		
		//Assert.assertEquals(driver.getTitle(), "Place Your Order - Amazon Checkout");
	}
}
