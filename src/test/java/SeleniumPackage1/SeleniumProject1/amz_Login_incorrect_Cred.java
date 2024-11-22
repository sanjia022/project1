package SeleniumPackage1.SeleniumProject1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amz_Login_incorrect_Cred extends Launch_Quit {

	@Test(retryAnalyzer = DataFiles.retry_logic.class, groups= {"smoke"})

	public void loginToAmazon_incorrect_cred() throws InterruptedException, EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\RC-PC\\eclipse-workspace\\SeleniumProject1\\DataFetching.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String un = w1.getSheet("Login").getRow(2).getCell(0).getStringCellValue();

		String pwd = w1.getSheet("Login").getRow(2).getCell(1).getStringCellValue();

		amz_LoginPage login = new amz_LoginPage(driver);
		login.hoverOverOnAccount(driver);
		login.clickOnSignin();
		login.emailphnField(un);
		login.clickContinue();
		login.passwordField(pwd);
		login.clickSignin();

		//Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");

	}

}
