package BaseTest;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static  WebDriver driver;
	public static WebDriver chromesetup(){
		File ieExecutable =new File ("chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",ieExecutable.getAbsolutePath());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser is open");
		driver.get("http://agilemaven.com/TestAutomation/");
		System.out.println("browser is open");
	   // driver.get(appUrl);	
	    //driver.manage().window().maximize();
	    return driver;
	}
	
}
