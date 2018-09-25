package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePage.BasePage;

public class MultiPageThree extends BasePage{
	public static WebDriver driver;
	public MultiPageThree(WebDriver driversetup){

		super(driversetup);
		this.driver =driversetup;
	}
	public void dropdownDepartment(int arg1)
	{
		
		dropdown(By.id("input_590_11"),arg1);
		/*WebElement element = driver.findElement(By.id("input_590_11"));
		Select select = new Select (element);
		select.selectByIndex(1);*/
	
	}
	public void enterMessage(String arg1)
	{ type(By.id("input_590_12"),arg1);
		//driver.findElement(By.id("input_590_12")).sendKeys("First Address st");
	}
	public void clickNext()
	{
		click(By.id("gform_next_button_590_14"));
	//driver.findElement(By.id("gform_next_button_590_14")).click();
	}
	public void clickPrevious()
	{
		click(By.id("gform_previous_button_590_14"));
	//driver.findElement(By.id("gform_previous_button_590_14")).click();
	}

}
