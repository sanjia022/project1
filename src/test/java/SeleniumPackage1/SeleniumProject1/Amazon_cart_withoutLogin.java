package SeleniumPackage1.SeleniumProject1;



import org.testng.Assert;
import org.testng.annotations.Test;






public class Amazon_cart_withoutLogin extends Launch_Quit {
	
	@Test(retryAnalyzer = DataFiles.retry_logic.class)
	public void cartpage_without_login() {
		amz_SearchArea a1 = new amz_SearchArea(driver);
		a1.searchItemArea();

		amz_addProduct a2 = new amz_addProduct(driver);
		a2.clickOnProduct();
		a2.clickAddProduct();

		//Assert.assertEquals(driver.getTitle(), "Amazon.com Shopping Cart");
	}
}
