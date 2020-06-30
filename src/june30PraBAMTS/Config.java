package june30PraBAMTS;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Config extends WebDriverFunction {
	
public String AccLoc ="//*[@id=\"sidebar\"]/aside[2]/ul/li[1]/a";
	
	@BeforeMethod
	public void oprnBrowser() throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahfuj Tuhin\\eclipse-workspace\\BatchMarch2020\\jars\\chromedriver_win32\\chromedriver.exe");
		
		
	    driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	}
		
		
		@AfterMethod
		public void closebrowser() {
			System.out.println("Browser is closed ++++++");
    		driver.close();
			
		}
}
