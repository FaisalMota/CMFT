package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePage.BasePage;

public class NamePhoneEmail extends BasePage {
public static WebDriver driver;
public NamePhoneEmail(WebDriver driversetup){
	super(driversetup);
	this.driver =driversetup;
}
public void enterName(String arg1)
{  type(By.id("formbean.firstname"),arg1);
	//driver.findElement(By.id("input_590_2_3")).sendKeys("FirstName");
}
public void enterLastName(String arg1)
{ type(By.id("formbean.lastname"),arg1);
	//driver.findElement(By.id("input_590_2_6")).sendKeys("LastName");
}
public void enterEmail(String arg1)
{
type(By.id("formbean.email"),arg1);
}
public void enterEmailConfirm(String arg1)
{
	//driver.findElement(By.id("input_590_3_2")).sendKeys("Aya@yahoo.com ");
type(By.id("formbean.confirmemail"),arg1);
}
public void enterPhone()
{ type(By.id("formbean.phonenumber"),"4565467654");
	//driver.findElement(By.id("input_590_2_6")).sendKeys("LastName");
}
public void phoneChoice()
{ click(By.id("formbean.contactmethod_2Label"));
	//driver.findElement(By.id("input_590_2_6")).sendKeys("LastName");
}
public void choiceOfPhone_Email()
{
	click(By.id("formbean.contactmethod_2Label"));
//driver.findElement(By.id("choice_590_9_0")).click();
}
public void clickSubmit()
{
	//driver.findElement(By.id("gform_next_button_590_1")).click();
click(By.id("formbean.submit"));
}
}