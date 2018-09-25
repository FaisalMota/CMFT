import java.io.File;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReports {
	ExtentHtmlReporter htmlReporter;
	ExtentReports reports;
	ExtentTest logger;
	
	@BeforeTest 
	public void startReport()
	{ 
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/AutomationReports.html");
		htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
		reports =new ExtentReports();
		reports.setSystemInfo("Enviroment", "Selenium Testing");
		reports.attachReporter(htmlReporter);
		
	}
		
		@Test 
		public void methodOne()
		{		
			Assert.assertTrue(true);
			logger.log(Status.INFO,"This is Sample Test One");
			
			
		}
		
		@Test 
		public void methodTwo()
		{		
			Assert.assertTrue(false);
			logger.log(Status.INFO,"This is Sample Test Two");
			
			
		}
		
		
		@BeforeMethod
		public void register(Method method)
		{
			String testName =method.getName();
			logger =reports.createTest(testName);
			
		}
		
		
		@AfterMethod 
		public void captureStatus(ITestResult result)
		{
			if (result.getStatus()==ITestResult.SUCCESS){
				logger.log(Status.PASS,"This test method name as :" +result.getName() + " is passed");
				}
				else if (result.getStatus()==ITestResult.FAILURE){
					logger.log(Status.FAIL,"This test method name as :" +result.getName() + " is failed");
					logger.log(Status.FAIL,"Test failure :" +result.getThrowable());
					}
				else if (result.getStatus()==ITestResult.SKIP){
					logger.log(Status.SKIP,"This test method name as :" +result.getName() + " is skipped");
					
					}
				
				
				
				
				
			}
		@AfterTest
		public void cleanup(){
			reports.flush();
			
		}
			
			
			
			
			
			
			
		} 
		
		
		
	
	


