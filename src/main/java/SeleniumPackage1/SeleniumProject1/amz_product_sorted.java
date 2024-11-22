package SeleniumPackage1.SeleniumProject1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amz_product_sorted {
WebDriver driver;
	

    @FindBy(xpath= "//span[. ='Free Shipping by Amazon']")
	WebElement selectFreeAmazonDeliveryOption;
    @FindBy(xpath = "(//i[@class ='a-icon a-icon-checkbox'])[5]")
    WebElement selectgender;
    
  @FindBy(xpath = "(//input[@class='a-button-input'])[1]")
  WebElement proceedToCartElement;
  
  
    public void ClickOnFreeAmazonDeliveryOption () {
    	selectFreeAmazonDeliveryOption.click();
    }
   
    public void clickonWomen() {
    	selectgender.click();
    }
    
   
    public amz_product_sorted(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
