package SeleniumPackage1.SeleniumProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amz_checkoutPage {
	WebDriver driver;
	WebDriverWait w2;
	@FindBy(xpath = "//h2[@class ='a-size-medium a-color-base a-text-bold']")
	WebElement addresschangelink;
	@FindBy(xpath = "(//i [@class = 'a-icon a-icon-radio'])[2]")
	WebElement selectingAddress;
	
	@FindBy(xpath = "(//input[@class= 'a-button-input'])[1]")
	WebElement deliveryAddress;
	@FindBy(xpath = "(//h2[@class ='a-size-medium a-spacing-none a-text-bold'])[3]")
	WebElement changepayment;
	@FindBy(name = "ppw-instrumentRowSelection")
	WebElement selectPayment;
	@FindBy(xpath = "(//input[@class = 'a-button-input'])[1]")
	WebElement usethisPaymentButton;
	@FindBy(xpath = "//input[@id = 'pp-S0weG7-156']")
	WebElement selectPayment1;
	
	@FindBy(linkText = "Use a gift card, voucher, or promo code")
	WebElement addVouchar;
	@FindBy(name = "ppw-claimCode")
	WebElement enterCouponField;
	
	@FindBy(name = "ppw-claimCodeApplyPressed")
	WebElement applylink;
	
	@FindBy(xpath = "(//input[@type = 'checkbox'])[1]")
	WebElement checkbox;
	
	public void clickOnChangeAddressLink() {
		addresschangelink.click();
	}
	public void selectingAddress() {
		selectingAddress.click();
	}
	public void clickOndeliveryAddress() {
		deliveryAddress.click();
	}
	public void clickOnChangePayment(WebDriver driver) {
		this.driver =driver; 
		w2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[@class ='a-size-medium a-spacing-none a-text-bold'])[3]"))).click();
		changepayment.click();
	}
	
	/*public void clickOnChangePayment(WebDriver driver) {
		this.driver =driver; 
		w2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2[@class ='a-size-medium a-spacing-none a-text-bold'])[3]"))).click();
		changepayment.click();
	}*/
	public void clickToSelectingPayment(WebDriver driver) {
	    this.driver=driver;
	    w2=new WebDriverWait(driver,Duration.ofSeconds(20));
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class= 'a-link-normal expand-panel-button celwidget'])[2]"))).click();
		selectPayment.click();
	}
	 
	
	
	public void clickToSelectingPayment2(WebDriver driver) {
		this.driver = driver;
		w2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("pp-S0weG7-156"))).click();
		//selectPayment1.click();
	}
	
	
	public void clickTouseThisPaymentMethod() {
		usethisPaymentButton.click();
	}
	
	public void clickCheckbox() {
		checkbox.click();
	}
	public void ClickOnAddVouchar() {
		addVouchar.click();
	}
	public void enterCoupon() {
		enterCouponField.sendKeys("dhfjgj");
	}
	public void ClickOnApply() {
		applylink.click();
	}
	public amz_checkoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
