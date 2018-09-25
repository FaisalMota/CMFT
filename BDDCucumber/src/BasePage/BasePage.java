package BasePage;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class BasePage {
		public static  WebDriver driver;
		public BasePage(WebDriver driver)
		{
			this.driver=driver;
		}
		public void click(By by){
			
			driver.findElement(by).click();
		
		}	
	public void dropdown(By by,int Arg1) {
		WebElement element = driver.findElement(by);
		Select select= new Select (element);
		select.selectByIndex(Arg1);
		}
		public void type(By by, String Arg1){
			
			driver.findElement(by).sendKeys(Arg1);
			
			
			
		}
	
		
		
		
		public void clickableWait(){
			WebDriverWait wait = new WebDriverWait(driver, 2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("formbean.paymentmethodLabel")));// instead of id u can use cssSelector or xpath of ur element.

		
			
		}
		public void wait(int Arg1){
			driver.manage().timeouts().implicitlyWait(Arg1, TimeUnit.SECONDS);
		}
		
		public void scrollDown(){
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,250)");
		}
		
		public void scrollUp(){
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			  js.executeScript("window.scrollBy(0,250)");
			}
		
		public void calenderDate(By by){
			
				
			      WebElement selectDate = driver.findElement(by);
			        
			      selectDate.click();
				}
		
		
		
		
		
		
		}

	


