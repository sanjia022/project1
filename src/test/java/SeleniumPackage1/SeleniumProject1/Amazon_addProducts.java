package SeleniumPackage1.SeleniumProject1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_addProducts extends Launch_Quit {

	@Test(retryAnalyzer = DataFiles.retry_logic.class)
	public void addProductsToTheCart() throws InterruptedException, EncryptedDocumentException, IOException {
		
		amz_LoginPage login = new amz_LoginPage(driver);
		login.hoverOverOnAccount(driver);
		login.clickOnSignin();
		login.Emailphnfield();
		login.clickContinue();
		login.PasswordField();
		login.clickSignin();  
		amz_SearchArea a1 = new amz_SearchArea(driver);
		a1.searchItemArea();

		amz_addProduct a2 = new amz_addProduct(driver);
		a2.clickOnProduct();
		a2.clickAddProduct();

		//Assert.assertEquals(driver.getTitle(), "Amazon.com Shopping Cart");
	}
}
