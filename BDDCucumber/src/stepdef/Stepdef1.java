package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import BaseTest.BaseTest;
import BaseTest.ConditionalTest;
import POM.Condone;
import POM.NGCHomePage;

public class Stepdef1 {
	public static WebDriver driver;
	
	
	
	
	
	
			
	@Given("^User enter the NGC URL$")
	public void user_enter_the_NGC_URL() throws Throwable {
		
		
			 
			
		File ieExecutable =new File ("C:\\Users\\The King\\Desktop\\Selenium\\JavaProject\\SeleniumTraining\\chromedriver.exe");
			System.setProperty("weddriver.chrome.driver",ieExecutable.getAbsolutePath());
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("browser is open");
			driver.get("http://agilemaven.com/TestAutomation/");
			driver.findElement(By.name("ws-continue")).click();
			System.out.println("URL is open");
		
				
		   String Title =driver.getCurrentUrl();	
		   
		    System.out.println(Title);
		
		 
	}

	@When("^User selects the conditional form on NGC home page$")
	public void user_selects_the_conditional_form_on_NGC_home_page() throws Throwable {
	
		driver.findElement(By.xpath("//*[@id='uefTable_0_tableEl']/tbody/tr[1]/td[1]/a")).click();
		   String Title =driver.getCurrentUrl();	
		   
		    System.out.println("Current URL is :"+Title);
		
	  
	}

	@And("^User enter first name \"([^\"]*)\"$")
	public void user_enter_first_name(String arg1) throws Throwable {
		   String Title =driver.getCurrentUrl();	
		   
		    System.out.println(Title);
		
	
		
		driver.findElement(By.id("formbean.firstname")).sendKeys(arg1);

	   
	    
	}

	@And("^User enter last name \"([^\"]*)\"$")
	public void user_enter_last_name(String arg1) throws Throwable {
		driver.findElement(By.id("formbean.lastname")).sendKeys(arg1);
	
	}

	@And("^User enter street Address \"([^\"]*)\"$")
	public void user_enter_street_Address(String arg1) throws Throwable {
		driver.findElement(By.id("formbean.streetaddress")).sendKeys(arg1);
	   
	}

	@And("^User enter city \"([^\"]*)\"$")
	public void user_enter_city(String arg1) throws Throwable {
		driver.findElement(By.id("formbean.city")).sendKeys(arg1);
	    
	}

	@And("^User select state \"([^\"]*)\"$")
	public void user_select_state(int arg1) throws Throwable {
		WebElement element = driver.findElement(By.id("formbean.state"));
		Select select = new Select (element);
		select.selectByIndex(arg1);
	   
	}

	@And("^User enter Zip \"([^\"]*)\"$")
	public void user_enter_Zip(String arg1) throws Throwable {
		driver.findElement(By.id("formbean.zip")).sendKeys(arg1);
	    
	}

	@And("^User enter email \"([^\"]*)\"$")
	public void user_enter_email(String arg1) throws Throwable {
		driver.findElement(By.id("formbean.email")).sendKeys(arg1);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,300)");
	 
	}
	@When("^User selects department to contact$")
	public void user_selects_department_to_contact() throws Throwable {
		driver.findElement(By.id("formbean.sendtoLabel")).click();
	    
	}
	@When("^User selects department to contact billing$")
	public void user_selects_department_to_contact_billing() throws Throwable {
		
		driver.findElement(By.id("formbean.sendto_2Label")).click();
	}
	@When("^User enter Account number \"([^\"]*)\"$")
	public void user_enter_Account_number(String arg1) throws Throwable {
		driver.findElement(By.id("formbean.accountnumber")).sendKeys(arg1);
	}
	
	@When("^User selects department to contact customer service$")
	public void user_selects_department_to_contact_customer_service() throws Throwable {
		
		driver.findElement(By.id("formbean.sendto_3Label")).click();
	}

	@When("^User has open a ticket$")
	public void user_has_open_a_ticket() throws Throwable {
		driver.findElement(By.id("formbean.ticketLabel")).click();
	}

	@When("^User enter Ticket number \"([^\"]*)\"$")
	public void user_enter_Ticket_number(String arg1) throws Throwable {
		driver.findElement(By.id("formbean.ticketnumber")).sendKeys(arg1);
	}
	
	@When("^User has not open a trouble ticket$")
	public void user_has_not_open_a_trouble_ticket() throws Throwable {
		driver.findElement(By.id("formbean.ticket_2Label")).click();	
	}


	@And("^User enter subject \"([^\"]*)\"$")
	public void user_enter_subject(String arg1) throws Throwable {
		driver.findElement(By.id("formbean.subject")).sendKeys(arg1);
	    
	}

	@And("^User enter message \"([^\"]*)\"$")
	public void user_enter_message_message(String arg1) throws Throwable {
		
		driver.findElement(By.id("formbean.message")).sendKeys(arg1);
	    
	}

	@And("^User click Next$")
	public void user_click_Next() throws Throwable {
		driver.findElement(By.id("formbean.submit")).click();
	
	}
	
	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}
	
	@Then("^User validate the error message$")
	public void user_validate_the_error_message() throws Throwable {
		String Element1 = "Error: Please enter your First Name";
		Assert.assertTrue("Verification failed: Error message does not match." ,Element1.equals(driver.findElement(By.id("uef-error-0")).getText()));
		System.out.println("Correct Error message is dispalyed when User dont enter First Name 'Error: Please enter your First Name' ");

			      

				
	}
	    
	    

}

