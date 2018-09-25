package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
    
    public class NGCHomePage {
    	  public static WebDriver driver;
	public NGCHomePage(WebDriver driver){
		this.driver=driver;
		
	}
	public void NGCConditionalForm(){
		driver.findElement(By.xpath("//*[@id='uefTable_0_tableEl']/tbody/tr[1]/td[1]/a")).click();
	}
	
	public void NGCMultiPageForm(){
		driver.findElement(By.xpath("//*[@id='uefTable_0_tableEl']/tbody/tr[2]/td[1]/a")).click();
	}
	public void NGCPizzaForm(){
		driver.findElement(By.xpath("//*[@id='uefTable_0_tableEl']/tbody/tr[3]/td[1]/a")).click();
	}
	public void NGCProductOrderForm(){
		driver.findElement(By.xpath("//*[@id='uefTable_0_tableEl']/tbody/tr[4]/td[1]/a")).click();
	}
	public void NGCSample1Form(){
		driver.findElement(By.xpath("//*[@id='uefTable_0_tableEl']/tbody/tr[5]/td[1]/a")).click();
	}
	
		
		
		
	}
	
	
	


