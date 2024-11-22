package SeleniumPackage1.SeleniumProject1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amz_SearchArea {
	
	WebDriver driver;
	@FindBy(id = "twotabsearchtextbox" )
	WebElement searchArea;
	
	
	
	public void searchItemArea()
	{if(searchArea.isDisplayed() && searchArea.isEnabled()) {
		searchArea.sendKeys("shoe" +Keys.ENTER);
	}
	

		
	}
	public amz_SearchArea(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
