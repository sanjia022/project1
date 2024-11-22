package SeleniumPackage1.SeleniumProject1;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Amazon_Review_items extends Launch_Quit {
	
	@Test (retryAnalyzer = DataFiles.retry_logic.class)
	public void review_itmes() throws InterruptedException, EncryptedDocumentException, IOException {
	

		amz_LoginPage login = new amz_LoginPage(driver);
		login.hoverOverOnAccount(driver);
		login.clickOnSignin();
		login.Emailphnfield();
		login.clickContinue();
		login.PasswordField();
		login.clickSignin();
		
		
		amz_review_items a1 =new amz_review_items(driver);
		a1.clickOnReturnAndOrders();
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Write a product review"))).click();
	
		a1.selectingfiveStars();
	
		
	}

}
