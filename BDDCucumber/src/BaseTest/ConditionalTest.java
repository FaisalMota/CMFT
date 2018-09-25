package BaseTest;

import java.io.File;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalTest {
	public static WebDriver driver;
	public static void  chromesetup(){
		File ieExecutable =new File ("C:\\Users\\The King\\Desktop\\Selenium\\JavaProject\\SeleniumTraining\\chromedriver.exe");
		System.setProperty("weddriver.chrome.driver",ieExecutable.getAbsolutePath());
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser is open");
		driver.get("http://agilemaven.com/TestAutomation/");
		System.out.println("URL is open");
		//Thread.sleep(5000);
		driver.findElement(By.name("ws-continue")).click();
			
	   String Title =driver.getCurrentUrl();	
	   
	    System.out.println(Title);
	  //  driver.findElement(By.id("input_7_2_3")).sendKeys("ayesha");
	     driver = driver;
	    
	}
	
	
	public static void quit(){
		driver.quit();
		
	}



}
