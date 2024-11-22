package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amz_product_detail_page {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//span[@class ='a-price-whole'])[3]")
	WebElement priceDisplayed;
	@FindBy(xpath = "//span[.='Reviews']")
	WebElement reviewDisplayed;
	
    public void IsPriceFielddisplayed () {
    	priceDisplayed.isDisplayed();
    }
    public boolean IsReviewFielddisplayed () {
    	return reviewDisplayed.isDisplayed();
    }
    
    public amz_product_detail_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
