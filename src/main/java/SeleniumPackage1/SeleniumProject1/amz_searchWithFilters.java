package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class amz_searchWithFilters {
	
	
	
	WebDriver driver;
	
	
	@FindBy(xpath= "//select[@name ='url']" )
	WebElement category;
	
	@FindBy(xpath = "//select[@name ='s']")
	WebElement sortByOption;
	
	
	
	
	
	public void selectCategory(){
		Select s1 = new Select(category);
		s1.selectByVisibleText("Clothing, Shoes & Jewelry");
		 
		
	}
	
	public void selectFromSortBy(){
		Select s1 = new Select(sortByOption);
		s1.selectByVisibleText("Price: Low to High");
		 
		
	}
	
	
	public amz_searchWithFilters(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
