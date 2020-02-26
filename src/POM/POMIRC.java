package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Autocon;
import Generic.BasePage;
import Generic.ExcelLib;

public class POMIRC extends BasePage implements Autocon  {

	@FindBy(id="userName")
	public WebElement enterusername;
	
	@FindBy(id="usrPwd")
	public WebElement enterpassword;
	
	@FindBy(id="cnfUsrPwd")
	public WebElement enterconfirmpassword;
	
	@FindBy(xpath="//label[.='Select Security Question']")
	public WebElement qus;
	
	@FindBy(xpath="//span[.='Who was your Childhood hero?']")
	public WebElement qusclk;

	@FindBy(xpath="//input[@placeholder='Security Answer']")
	public WebElement ans;
	
	@FindBy(xpath="//label[.='Select Preferred Language']")
	public WebElement lan;
	
	@FindBy(xpath="//span[.='English']")
	public WebElement lanclk;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	public WebElement firstname;
	
	@FindBy(id="lastname")
	public WebElement lastname;
	
	@FindBy(id="M")
	public WebElement gen;
	
	@FindBy(xpath="//input[@class='ng-tns-c11-6 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")
	public WebElement calclk;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year ng-tns-c11-6 ng-star-inserted']")
	public WebElement year;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month ng-tns-c11-6 ng-star-inserted']")
	public WebElement month;
	
	@FindBy(xpath="//a[.='22']")
	public WebElement date;
	
	@FindBy(xpath="//label[.='Select Occupation']")
	public WebElement occ;
	
	@FindBy(xpath="(//li[@class='ng-tns-c10-7 ui-dropdown-item ui-corner-all ng-star-inserted'])[6]")
	public WebElement occclk;
	
	@FindBy(xpath="(//input[@type='radio'])[5]")
	public WebElement status;
	
	@FindBy(xpath="//select[@formcontrolname='resCountry']")
	public WebElement country;
	
	@FindBy(id="email")
	public WebElement addemail;
	
	@FindBy(id="mobile")
	public WebElement number;
	
	@FindBy(xpath="//select[@formcontrolname='nationality']")
	public WebElement nat;
	
	@FindBy(id="resAddress1")
	public WebElement add;
	
	@FindBy(id="resAddress2")
	public WebElement add2;
	
	@FindBy(xpath="//input[@placeholder='Pin code']")
	public WebElement pin;
	
	@FindBy(id="resState")
	public WebElement state;
	
	@FindBy(xpath="//select[@formcontrolname='resCity']")
	public WebElement city;
	
	@FindBy(xpath="//select[@formcontrolname='resPostOff']")
	public WebElement post;
	
	@FindBy(id="resPhone")
	public WebElement num;
	
	@FindBy(xpath="//input[@value='Y'])[2]")
	public WebElement copyadd;
	
	public POMIRC(WebDriver drive) {
		PageFactory.initElements(drive, this);
	}

	public void submit() throws IOException, InterruptedException {
		enterusername.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 0));
		enterpassword.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 1));
		enterconfirmpassword.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1,2 ));
		Thread.sleep(3000);
		qus.click();
		qusclk.click();
		ans.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 3));
		Thread.sleep(3000);
		lan.click();
		lanclk.click();
		firstname.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 4));
		lastname.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 5));
		Thread.sleep(4000);
		gen.click();
		Thread.sleep(2000);
		calclk.click();
		Thread.sleep(3000);
		selectbyvalue(year, "1995");
		Thread.sleep(3000);
		selectbyvalue(month, "1");
		Thread.sleep(3000);
		date.click();
		Thread.sleep(3000);
		occ.click();
		Thread.sleep(3000);
		occclk.click();
		status.click();
		Thread.sleep(3000);
		selectbyvalue(country, "94");
		addemail.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 11));
		number.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 12));
		Thread.sleep(3000);
		selectbyvalue(nat, "94");	
		add.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 14));
		add2.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 15));
		Thread.sleep(3000);
		pin.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 16));
		state.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 17));
		Thread.sleep(3000);
		selectbyvalue(city, "Ganjam");
		Thread.sleep(3000);
		selectbyvalue(post, "Hillpatna S.O");
		Thread.sleep(3000);
		num.sendKeys(ExcelLib.getcellvalue(excel_path, sheet, 1, 20));
	
		}



}
