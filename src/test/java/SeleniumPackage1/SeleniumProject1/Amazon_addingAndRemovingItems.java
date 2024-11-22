package SeleniumPackage1.SeleniumProject1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_addingAndRemovingItems extends Launch_Quit {

	@Test(retryAnalyzer = DataFiles.retry_logic.class)
	public void addingAndRemovingItems() throws InterruptedException, EncryptedDocumentException, IOException {
		amz_LoginPage login = new amz_LoginPage(driver);
		login.hoverOverOnAccount(driver);
		login.clickOnSignin();
		login.Emailphnfield();
		login.clickContinue();
		login.PasswordField();
		login.clickSignin();

		amz_SearchArea s1 = new amz_SearchArea(driver);
		s1.searchItemArea();

		amz_addProduct a2 = new amz_addProduct(driver);
		a2.clickOnProduct();
		a2.clickOnAddButton();

		amz_Homepage hp = new amz_Homepage(driver);
		hp.clickOncart();

		amz_ShoppingCartPage sp = new amz_ShoppingCartPage(driver);
		/*WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleContains("Amazon.com Shopping "));*/
		sp.clickonIncrementingItems();
		//sp.clickonDeleteItem();
	

		//Assert.assertTrue(sp.proceedToRetailCheckoutButton.isDisplayed());

	}

}
