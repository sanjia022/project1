package SeleniumPackage1.SeleniumProject1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DataFiles.DDTExcel;

public class amz_LoginPage {
	WebDriver driver;
	public DDTExcel ddt= new DDTExcel();
	@FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement hoverOverOnAccountAndList;
	
	
	@FindBy(xpath = "(//span[@class = 'nav-action-inner'])[1]")
   WebElement signin;
	
	@FindBy(xpath = "//input[@id ='ap_email']")
	WebElement emailPhnArea;
	
	@FindBy(xpath = "//input[@id ='continue']")
    WebElement continueButton;
	
	@FindBy(xpath = "//input[@id ='ap_password']")
	WebElement passwordArea;
	
	@FindBy (id = "signInSubmit")
	WebElement signInButton;

	public void hoverOverOnAccount(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverOverOnAccountAndList).perform();
	}
	
	
	
	public void clickOnSignin() throws InterruptedException  {
		signin.click();
		
	}
	public void emailphnField(String um) {
		emailPhnArea.sendKeys(um);
	}
	
	public void Emailphnfield() throws EncryptedDocumentException, IOException {
		String email= ddt.getDatafromexcel("Login", 1, 0);
		emailPhnArea.sendKeys(email);
	}
	
	public void clickContinue() {
		continueButton.click();
	}
	public void passwordField(String pwd) {
		passwordArea.sendKeys(pwd);
	}
	public void PasswordField() throws EncryptedDocumentException, IOException {
	String password =	ddt.getDatafromexcel("Login", 1, 1);
	passwordArea.sendKeys(password);
	}
	
	public void clickSignin() {
		signInButton.click();
	}
	public amz_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
