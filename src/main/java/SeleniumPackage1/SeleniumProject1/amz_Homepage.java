package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amz_Homepage  {
	WebDriver driver;
	@FindBy(xpath = "//span[@class ='nav-line-2 ']")
     WebElement hoverOverOnAccountAndList;
	
	
	@FindBy(xpath = "//span[. ='Sign in']")
    WebElement signin;
	@FindBy(xpath = "//span[@id = 'nav-cart-count']")
	WebElement cartIcon;

	
	public void hoverOverOnAccount(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverOverOnAccountAndList).perform();
	}
	
	public void clickonAccountAndList() {
		hoverOverOnAccountAndList.click();
	}
	
	public void clickOnSignin() throws InterruptedException  {
		signin.click();
		Thread.sleep(2000);
	}
	
	public void clickOncart() {
		cartIcon.click();
	}
	public amz_Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
