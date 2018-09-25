package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePage.BasePage;

public class Condone  {
		public static WebDriver driver;
		
		
		
		public Condone(WebDriver driversetup){
			this.driver =driversetup ;
		}
	public  void enterName(String arg1)

	{  
		//type(By.id ("input_7_2_3"),"FirstName");
		System.out.println("firstname");
		driver.findElement(By.id("formbean.firstname")).sendKeys(arg1);
	}
	public  void enterLastName(String arg1)
	{ //type(By.id("input_7_2_6"),"LastName");
		driver.findElement(By.id("formbean.lastname")).sendKeys(arg1);
	}
	public void enterStreetAddress(String arg1)
	{
		driver.findElement(By.id("formbean.streetaddress")).sendKeys(arg1);
	//type(By.id("input_7_3"),"Aya@yahoo.com ");
	}
	public void enterCity(String arg1)
	{
		driver.findElement(By.id("formbean.city")).sendKeys(arg1);
	//type(By.id("input_7_3_2"),"Aya@yahoo.com ");
		
		
		
	}
	public void dropdownState(int arg1)
	{
	
		WebElement element = driver.findElement(By.id("formbean.state"));
		Select select = new Select (element);
		select.selectByIndex(arg1);
	
	}
	
	public void enterZip(String arg1)
	{ 
		driver.findElement(By.id("formbean.zip")).sendKeys(arg1);
	}
	public void enterEmail(String arg1)
	{ 
		driver.findElement(By.id("formbean.email")).sendKeys(arg1);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,300)");
	}
	public void choiceDepartment()
	{
	
	driver.findElement(By.id("formbean.sendtoLabel")).click();
	}
	public void enterSubject(String arg1)
	{
		driver.findElement(By.id("formbean.subject")).sendKeys(arg1);
	
	}
	
	public void enterMessage(String arg1)
	{
		driver.findElement(By.id("formbean.message")).sendKeys(arg1);
	
	}
	
	public void clickNext()
	{
	
	driver.findElement(By.id("formbean.submit")).click();
	}
	
		

}
