package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amz_CartPage_withoutLogin {
	
	WebDriver driver;
	@FindBy(xpath = "//span[@id='nav-cart-count']")
	WebElement cartfield;
	
	@FindBy(xpath ="(//span[@class='a-size-base-plus'])[1]")
	WebElement signinToYourAccountfield;
	
	public void clickOnCart() {
		cartfield.click();
	}
	
	public void signinToYourAccount() {
		signinToYourAccountfield.isDisplayed();
	}
	
public amz_CartPage_withoutLogin(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
