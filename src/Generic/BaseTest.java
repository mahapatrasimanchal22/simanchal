package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest implements Autocon {

	public WebDriver drive;
	
	@BeforeSuite
	public void openbrowser() {
		System.setProperty(chrome_key, chrome_value);
		drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.get(url);
	}
	@AfterSuite
	public void closebrowser() {
		drive.close();
	}
}
