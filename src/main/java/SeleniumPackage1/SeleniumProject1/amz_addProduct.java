package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class amz_addProduct {
 
	WebDriver driver;
	@FindBy(xpath = "//div[@class ='a-section aok-relative s-image-tall-aspect']")
	WebElement selectItemsFromProductList;
	
	@FindBy(xpath = "//input[@id ='add-to-cart-button']")
	WebElement addProductToTheCart;
	
	@FindBy(xpath = "//input[@id ='add-to-cart-button']")
	WebElement addButton;
	
	@FindBy(xpath = "(//span [@id = 'a-autoid-32-announce'])")
	WebElement quantitydropdown;
	
	public void clickOnProduct() {
		selectItemsFromProductList.click();
		
	}
	public void clickAddProduct() {
		addProductToTheCart.click();
	}
	public void clickOnAddButton() {
		addButton.click();
	}
	 
	
	public void selectingQuantity() {
		Select s1 = new Select(quantitydropdown);
		s1.selectByIndex(3);
		
	}
	public amz_addProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
