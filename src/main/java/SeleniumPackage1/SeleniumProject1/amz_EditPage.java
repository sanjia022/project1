package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class amz_EditPage {
	WebDriver driver;
	
	@FindBy(xpath = "(//span[@class = 'a-color-secondary'])[2]")
	WebElement LoginAndSecurity;
	
	@FindBy(linkText = "Edit")
	WebElement editNameFeild;
	
	@FindBy(id = "ap_customer_name")
	WebElement newNameField;
	
	@FindBy(xpath = "//input[@class = 'a-button-input']")
	WebElement saveChangeButton;
	

	public void clickOnLoginAndsecurity() {
		LoginAndSecurity.click();
	}
	public void clickOnEditName() {
		editNameFeild.click();
	}
	public void enterNewName(String name) {
		newNameField.clear();
		newNameField.sendKeys(name);	
	
		}
	
	public void clickOnSubmitButton() {
		saveChangeButton.click();;	
		}
	public amz_EditPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
