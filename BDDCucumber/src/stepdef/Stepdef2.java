package stepdef;

import java.io.File;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import Com.ng.framework.Test.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import POM.MultiPageThree;
import POM.MultiPageTwo;
import POM.MultiPagefour;
import POM.NamePhoneEmail;
import BasePage.BasePage;
import BaseTest.BaseTest;

public class Stepdef2 extends BaseTest{
	public static  WebDriver driversetup;
	
	
	NamePhoneEmail NamePhoneEmail =new NamePhoneEmail(driversetup);
	MultiPageTwo MultiPageTwo =new MultiPageTwo(driversetup);
	
	
	@Given("^user open webbrowser and navigate to URL(\\d+)$")
	public void user_open_webbrowser_and_navigate_to_URL(int arg1) throws Throwable {
		
		//chromesetup();
		
		
		File ieExecutable = new File("chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", 
		ieExecutable.getAbsolutePath());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://agilemaven.com/TestAutomation/");
		driver.findElement(By.xpath("//*[@id='uefTable_0_tableEl']/tbody/tr[2]/td[1]/a")).click();
		
		driversetup= driver;
		} 

	@When("^user enter values in first \"([^\"]*)\" name$")
	public void user_enter_values_in_first_name(String arg1) throws Throwable {
	  	
		NamePhoneEmail.enterName(arg1);
		//WebDriver driver = driversetup;
		//driver.findElement(By.id("input_590_2_3")).sendKeys("FirstName");
		

		}
		
		
	


	

	@When("^user enter values in last \"([^\"]*)\"name$")
	public void user_enter_values_in_last_name(String arg1) throws Throwable {
	  
	
		
		
		
		NamePhoneEmail.enterLastName(arg1);
		//driver.findElement(By.id("input_590_2_6")).sendKeys("LastName");

	}

	@When("^user enter email \"([^\"]*)\"address$")
	public void user_enter_email_address(String arg1) throws Throwable {

	
		NamePhoneEmail.enterEmail(arg1);

	
	}
	
	@When("^user enter Phone$")
	public void user_enter_Phone() throws Throwable {
	  
		
		NamePhoneEmail.enterPhone();
	}

	@When("^click the choice of phone$")
	public void click_the_choice_of_phone() throws Throwable {
	    
	
		NamePhoneEmail.phoneChoice();
	}


	

	@When("^user enter \"([^\"]*)\" email$")
	public void user_enter_email(String arg1) throws Throwable {
	  
		WebDriver driver = driversetup;
		NamePhoneEmail NamePhoneEmail =new NamePhoneEmail(driversetup);
		NamePhoneEmail.enterEmailConfirm(arg1);
		
	}

	@When("^click the choice of phone or email$")
	public void click_the_choice_of_phone_or_email() throws Throwable {
	
		NamePhoneEmail.choiceOfPhone_Email();
		//driver.findElement(By.id("choice_590_9_0")).click();
	}

	@When("^click Next to navigate to next page$")
	public void click_Next_to_navigate_to_next_page() throws Throwable {

		NamePhoneEmail.clickSubmit();
		//driver.findElement(By.id("gform_next_button_590_1")).click();
	}

	@When("^enter street \"([^\"]*)\"$")
	public void enter_street(String arg1) throws Throwable {
		
		
		
		MultiPageTwo.enterAddress(arg1);
	}



	@When("^enter city \"([^\"]*)\"$")
	public void enter_city(String arg1) throws Throwable {
		WebDriver driver = driversetup;
		
		MultiPageTwo MultiPageTwo =new MultiPageTwo(driversetup);
		MultiPageTwo.enterCity(arg1);
	}

	@When("^enter state \"([^\"]*)\"$")
	public void enter_state(String arg1) throws Throwable {
		WebDriver driver = driversetup;
		
		MultiPageTwo MultiPageTwo =new MultiPageTwo(driversetup);
		MultiPageTwo.enterState(arg1);
	}

	@When("^enter zip \"([^\"]*)\"$")
	public void enter_zip(String arg1) throws Throwable {
		WebDriver driver = driversetup;
		
		MultiPageTwo MultiPageTwo =new MultiPageTwo(driversetup);
		MultiPageTwo.enterZip(arg1);
	}

	
	

	@When("^Choice of mail$")
	public void choice_of_mail() throws Throwable {
		WebDriver driver = driversetup;
		
		MultiPageTwo MultiPageTwo =new MultiPageTwo(driversetup);
		MultiPageTwo.choiceOfGettingMail();
	}

	@When("^click Next$")
	public void click_Next() throws Throwable {
		WebDriver driver = driversetup;
		
		MultiPageTwo MultiPageTwo =new MultiPageTwo(driversetup);
		MultiPageTwo.clickNext();
	}
	@When("^Choose the (\\d+) from the DropDown$")
	public void choose_the_from_the_DropDown(int arg1) throws Throwable {
		WebDriver driver = driversetup;
		
		MultiPageThree MultiPageThree =new MultiPageThree(driversetup);
		MultiPageThree.dropdownDepartment(arg1);
	}

	@When("^Enter Message \"([^\"]*)\"$")
	public void enter_Message(String arg1) throws Throwable {
	WebDriver driver = driversetup;
		
		MultiPageThree MultiPageThree =new MultiPageThree(driversetup);
		MultiPageThree.enterMessage(arg1);
	}
	@When("^click Next to Navigate to last Page$")
	
	
	
	public void click_Next_to_Navigate_to_last_Page() throws Throwable {
	WebDriver driver = driversetup;
		
		MultiPageThree MultiPageThree =new MultiPageThree(driversetup);
		MultiPageThree.clickNext();
	}
	@When("^user accept terms of service$")
	public void user_accept_terms_of_service() throws Throwable {
     WebDriver driver = driversetup;
		
		MultiPagefour MultiPagefour =new MultiPagefour(driversetup);
		MultiPagefour.acceptTerms();
	}
//
	@Then("^user click submit$")
	public void user_click_submit() throws Throwable {
	     WebDriver driver = driversetup;
			
			MultiPagefour MultiPagefour =new MultiPagefour(driversetup);
			MultiPagefour.
			//clickPrevious();
			clickSubmit();
	}
	@After
	public  void browser_quit()  {
		WebDriver driver = driversetup;
		
		//driver.findElement(By.name("btnK")).click();
		driver.quit();
		
	}
	public void type(By by, String value){
		WebDriver driver = driversetup;
		driver.findElement(by).sendKeys(value);
		
	}

	public void click(By by){
		WebDriver driver = driversetup;
		driver.findElement(by).click();
	}
	public void dropdown(By by,int IndexValue) {
	WebDriver driver = driversetup;



	WebElement element = driver.findElement(by);
	Select select= new Select (element);
	select.selectByIndex(IndexValue);
	}
	public void wait1(){
		
	}
	
}

