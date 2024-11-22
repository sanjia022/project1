package SeleniumPackage1.SeleniumProject1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_product_detail extends Launch_Quit {
	
	@Test(retryAnalyzer=DataFiles.retry_logic.class)
	public void product_details() {
		amz_SearchArea a1 = new amz_SearchArea(driver);
	    a1.searchItemArea();
	    amz_addProduct a2 = new amz_addProduct(driver);
	    a2.clickOnProduct();
	    amz_product_detail_page a3 = new amz_product_detail_page(driver);
	    a3.IsPriceFielddisplayed();
	    a3.IsReviewFielddisplayed();
	    
	    
	 //Assert.assertTrue(a1.searchArea.isDisplayed());
	}     
}
