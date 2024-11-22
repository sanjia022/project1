package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amz_RegistrationPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[@class ='nav-line-2 ']")
	WebElement AmazonAccountLink;
	
	@FindBy(linkText = "Start here.")
	WebElement StartHereLink;
	
	@FindBy(xpath ="//input[@id = 'ap_customer_name']")
	WebElement nameField;
	
	@FindBy(xpath="//input[@id= 'ap_email']")
	WebElement phnField;
	
	@FindBy(xpath = "//input[@id ='ap_password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@id= 'ap_password_check']")
	WebElement RecheckpasswordField;
	
	
	@FindBy(className = "a-button-input")
	WebElement VerifyButton;
	
	
	
	public void hoveroverAccountandlink(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(AmazonAccountLink).perform();
		
	}
	
	public void clickOnStartHereLink() {
		StartHereLink.click();
	}
	public void enterName() {
		nameField.sendKeys("MDW");
	}
	
	public void enterPnhNumber() {
		phnField.sendKeys("7036248653");
	}
	public void enterPassword() {
		passwordField.sendKeys("alhamdulliah");
	}
	
	public void RecheckPassword() {
		RecheckpasswordField.sendKeys("alhamdulliah");
	}
	public void clickVerifyButton() {
		VerifyButton.click();
	}
	 
	public amz_RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
