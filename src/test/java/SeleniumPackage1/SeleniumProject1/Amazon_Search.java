package SeleniumPackage1.SeleniumProject1;


import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Search extends Launch_Quit {

	@Test(retryAnalyzer = DataFiles.retry_logic.class)
	public void searchItem() throws IOException {
		amz_SearchArea a1 = new amz_SearchArea(driver);
		a1.searchItemArea();

		//Assert.assertEquals(driver.getTitle(), "Amazon.com : shoe");
		
		

	}

}
