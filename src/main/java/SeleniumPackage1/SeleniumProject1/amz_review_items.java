package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amz_review_items {
	WebDriver driver;

	@FindBy(xpath = "(//span[@class = 'nav-line-2'])[2]")
	WebElement returnsAndOrders;

	@FindBy(linkText = " Write a product review")
	WebElement writeReviewLink;

	@FindBy(xpath = "(//button[@class ='ryp__star__button'])[2]")
	WebElement starReview;

	@FindBy(linkText = "Write a product review")
	WebElement writeReview;
	@FindBy(xpath = "(//button [@class = 'ryp__star__button'])[2]")
	WebElement fiveStarButton;

	

	

	public void clickOnReturnAndOrders() {
		returnsAndOrders.click();
	}

	public void clickONWriteProductReview() {
		writeReviewLink.click();
	}

	public void clickOnStarReview() {
		starReview.click();
	}

	public void selectingfiveStars() {
		fiveStarButton.click();
	}

	

	

	public amz_review_items(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
