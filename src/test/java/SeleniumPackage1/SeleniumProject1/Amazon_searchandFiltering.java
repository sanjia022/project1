package SeleniumPackage1.SeleniumProject1;


import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_searchandFiltering extends Launch_Quit {
	
	
	@Test(retryAnalyzer = DataFiles.retry_logic.class)
	 public void searchingAndFiltering() {
		
	    
	    amz_searchWithFilters a2 = new amz_searchWithFilters(driver);
        a2.selectCategory();
        
        amz_SearchArea a1 = new amz_SearchArea(driver);
	    a1.searchItemArea();
        a2.selectFromSortBy();
       // WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
       // w1.until(ExpectedConditions.titleIs("Amazon.com: Shoe: Clothing, Shoes & Jewelry"));
	  //  Assert.assertEquals(driver.getTitle(), "Amazon.com: Shoe: Clothing, Shoes & Jewelry");
	    
	}
	
}
