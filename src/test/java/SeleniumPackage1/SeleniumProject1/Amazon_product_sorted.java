package SeleniumPackage1.SeleniumProject1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_product_sorted  extends Launch_Quit{
	
	@Test(retryAnalyzer = DataFiles.retry_logic.class)
	public void product_sorted() {
		
	amz_searchWithFilters a2 = new amz_searchWithFilters(driver);
        a2.selectCategory();
        
        amz_SearchArea a1 = new amz_SearchArea(driver);
	    a1.searchItemArea();
        a2.selectFromSortBy();
       
        amz_product_sorted a3 = new amz_product_sorted(driver);
        a3.ClickOnFreeAmazonDeliveryOption();
        a3.clickonWomen();
       
        
       
       // Assert.assertTrue(a3.selectFreeAmazonDeliveryOption.isDisplayed());
        
	}
}
