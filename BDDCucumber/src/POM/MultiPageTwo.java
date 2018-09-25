package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePage.BasePage;
import cucumber.api.java.en.When;

public class MultiPageTwo extends BasePage {
	public static WebDriver driver;
	public MultiPageTwo(WebDriver driversetup){
		super(driversetup);
		this.driver =driversetup;
	}
	public void enterAddress(String arg1)
	{ type(By.id("formbean.streetaddress"),arg1);
		//driver.findElement(By.id("input_590_5_1")).sendKeys("First Address st");
	}
	
	public void enterCity(String arg1)
	{
		type(By.id("formbean.city"),arg1);
	//driver.findElement(By.id("input_590_5_3")).sendKeys("City one");
	}
	public void enterState(String arg1)
	{
		type(By.id("formbean.state"),arg1);
		
	//driver.findElement(By.id("input_590_5_4")).sendKeys("Maryland");
	}
	public void enterZip(String arg1)
	{
		type(By.id("formbean.zip"),arg1);
	//driver.findElement(By.id("input_590_5_5")).sendKeys("12345");
	}
    public void choiceOfGettingMail()
	{
		click(By.id("formbean.receivecatalogLabel"));
	//driver.findElement(By.id("choice_590_8_0")).click();
	}
	public void choiceOfnotgettingMail()
	{
		click(By.id("formbean.receivecatalog_2Label"));
	//driver.findElement(By.id("choice_590_8_1")).click();
	}
	public void clickNext()
	{
		click(By.id("//*[@id='formbean.submit' and @value ='Next']"));
	//driver.findElement(By.id("gform_next_button_590_10")).click();
	}
	public void clickPrevious()
	{
		click(By.id("//*[@id='formbean.submit' and @value ='Previous']"));
	//driver.findElement(By.id("gform_previous_button_590_10")).click();
	}
	
	@When("^User likes Anita$")
	public void user_likes_Anita() throws Throwable {
		System.out.println("I like Anita");
	}

}
