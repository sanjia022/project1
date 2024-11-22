package SeleniumPackage1.SeleniumProject1;



import org.testng.annotations.Test;

public class Amazon_home extends Launch_Quit {
	
	@Test(retryAnalyzer = DataFiles.retry_logic.class)
	public void login() throws InterruptedException   {
		
		//WebDriver driver = null;
		//WebDriver driver = null;
		amz_Homepage homepage = new amz_Homepage(driver);
		homepage.hoverOverOnAccount(driver);
		homepage.clickOnSignin();
	
		
	}

}
