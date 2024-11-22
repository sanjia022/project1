package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class amz_ShoppingCartPage {
	WebDriver driver;
	@FindBy(xpath = "(//span[@class ='a-dropdown-label'])[1]")
	WebElement quantitySelection;
	
	@FindBy(xpath = "(//input[@value = 'Delete'])[1]")
	WebElement deleteItem;
	@FindBy(xpath = "//span[@class= 'a-icon a-icon-small-add']")
	WebElement incrementingItems;
	@FindBy(xpath = "(//input[@data-feature-id= 'item-delete-button'])[1]")
	WebElement deleteitem;
	
	@FindBy(xpath = "//input[@name ='proceedToRetailCheckout']")
	WebElement proceedToRetailCheckoutButton;
	
	
    

	public void selectQuantity() {
		Select s1 = new Select (quantitySelection);
		s1.selectByIndex(9);
	}
	
	public void ClickonDelete() {
		deleteItem.click();
	}	
	public void clickonIncrementingItems() {
		incrementingItems.click();
	}
	
	public void clickonDeleteItem() {
		deleteitem.click();
		

	}
	
	public void ClickOnproceedToRetailCheckoutButton() {
		proceedToRetailCheckoutButton.click();
	}
	
	public amz_ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
