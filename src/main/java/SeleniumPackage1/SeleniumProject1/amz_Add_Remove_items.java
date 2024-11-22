package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

public class amz_Add_Remove_items {

	WebDriver driver;

	@FindBy(xpath = "//select[@name = 'quantity']")
	WebElement selectQuantity;

	@FindBy(xpath = "//a[@class = 'a-dropdown-link a-active']")
	WebElement dropdown;

	@FindBy(name = "quantity")
	WebElement addQuantity;
	
	public void selectQuantity() {

		Select s2 = new Select(selectQuantity);
		s2.selectByValue("3");

	}
	
	public amz_Add_Remove_items(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
