package POM;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePage.BasePage;


public class MultiPagefour extends BasePage {
	public static WebDriver driver;
	public MultiPagefour(WebDriver driversetup){
		super(driversetup);
		this.driver =driversetup;
	
	}
	public void acceptTerms()
	{
		click(By.id("choice_590_16_1"));
	//driver.findElement(By.id("choice_590_16_1")).click();
	}
	public void clickSubmit()
	{
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
	WebDriverWait wait = new WebDriverWait(driver, 2000);
	WebElement elemeng = wait.until(ExpectedConditions.elementToBeClickable(By.id("gform_submit_button_590")));
	elemeng.click();
	//thread.sleep(5000);
	//click(By.id("gform_next_button_590"));	
	//driver.findElement(By.id("gform_next_button_590")).click();
	}
	
	public void clickPrevious()
	{
	click(By.id("gform_previous_button_590"));	
	driver.findElement(By.id("gform_previous_button_590")).click();
	driver.findElement(By.xpath(""));
	}
	

}
