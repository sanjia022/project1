package SeleniumPackage1.SeleniumProject1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import DataFiles.listener_logic;

//@Listeners(listener_logic.class)
public class Launch_Quit extends listener_logic {

	@BeforeMethod
	public void launchAmazon() {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void quitWindow() throws IOException {

		driver.quit();
	}

}