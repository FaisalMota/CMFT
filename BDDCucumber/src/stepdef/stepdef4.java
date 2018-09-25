package stepdef;

import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import BasePage.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import multiScreenShot.MultiScreenShot;

import org.openqa.selenium.JavascriptExecutor;

public class stepdef4  {
	
	public WebDriver driver;
	
	
	MultiScreenShot mShot=new MultiScreenShot("C:\\Users\\The King\\Desktop\\Selenium\\JavaProject\\SeleniumTraining\\",System.currentTimeMillis()+"Multiscreenshot.png");
			//("C:\\xxxx\\Desktop\\New\\","TestMultiScreenShot");	
	
	BasePage Bp =new BasePage(driver);

	@Given("^user open webbrowser and navigate to CMS URL$")
	public void user_open_webbrowser_and_navigate_to_CMS_URL() throws Throwable {
		
		File ieExecutable =new File ("C:\\Users\\The King\\Desktop\\Selenium\\JavaProject\\SeleniumTraining\\chromedriver.exe");
		System.setProperty("weddriver.chrome.driver",ieExecutable.getAbsolutePath());
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser is open");
		driver.get("https://portalval.cms.gov/");
		System.out.println("URL is open");
		
			
	   String Title =driver.getCurrentUrl();	
	   
	    System.out.println(Title);
	    
	}

	@When("^user enter values in userid \"([^\"]*)\"$")
	public void user_enter_values_in_userid(String arg1) throws Throwable {
		driver.findElement(By.id("cms-login-userid")).sendKeys("Amadmin");
		//Bp.type(By.id("cms-login-userid"),"Amadmin");
	}
		
    @When("^user enter values in Password \"([^\"]*)\"$")
		public void user_enter_values_in_Password(String arg1) throws Throwable {
		driver.findElement(By.id("cms-login-password")).sendKeys(arg1);
	//	Bp.type(By.id("cms-login-password"), "Cms_1001");
	}

	@And("^user agrees to terms and condition$")
	public void user_agrees_to_terms_and_condition() throws Throwable {
		driver.findElement(By.id("cms-label-tc")).click();
		//Bp.click(By.id("cms-label-tc"));
		Thread.sleep(1000);
		
		mShot.multiScreenShot(driver);
		//TakesScreenshot scrShot = ((TakesScreenshot)driver);
		//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(SrcFile, new File("C:\\Users\\The King\\Desktop\\Selenium\\JavaProject\\SeleniumTraining\\screenshot.png"));
		
	}

	@And("^user click login button$")
	public void user_click_login_button() throws Throwable {
		driver.findElement(By.id("cms-login-submit")).click();
		//Bp.click(By.id("cms-login-submit"));
		Thread.sleep(2000);
	}

	@And("^user validate the url title$")
	public void user_validate_the_url_title() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("My Portal"));
		System.out.println("Correct URL 'CMS Enterprise Portal - My Portal'");
		
	}

	@And("^click select Feedback reports from PRQS dropdown menu$")
	public void click_select_Feedback_reports_from_PRQS_dropdown_menu() throws Throwable {
		driver.findElement(By.id("cms_PVPQRS_tileid")).click();
		mShot.multiScreenShot(driver);
		driver.findElement(By.xpath("//a[@id='cms_PV-PQRS_FeedbackReports_pidb'and @title = 'Feedback Reports']")).click();
		
	}
	@And("^select from select a year dropdown menu$")
	public void select_from_select_a_year_dropdown_menu() throws Throwable {

		driver.findElement(By.xpath("//*[@id='viewns_0x002fpvm0x00252fattestation0x002fPVMAttestation0x002f7_79G0I341N83L30AFBD63J23QV0_:attestationForm:reportYear']/div[3]/span")).click();
		driver.findElement(By.xpath("//*[@id='viewns_0x002fpvm0x00252fattestation0x002fPVMAttestation0x002f7_79G0I341N83L30AFBD63J23QV0_:attestationForm:reportYear_5']")).click();
		
	}

	@And("^select AQRUR report from select a report dropdown menu$")
	public void select_AQRUR_report_from_select_a_report_dropdown_menu() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='viewns_0x002fpvm0x00252fattestation0x002fPVMAttestation0x002f7_79G0I341N83L30AFBD63J23QV0_:attestationForm:reportType']/div[3]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='viewns_0x002fpvm0x00252fattestation0x002fPVMAttestation0x002f7_79G0I341N83L30AFBD63J23QV0_:attestationForm:reportType_1']")).click();
		
		}
	@When("^user select view online from select a action dropdown menu$")
	public void user_select_view_online_from_select_a_action_dropdown_menu() throws Throwable {
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='viewns_0x002fpvm0x00252fattestation0x002fPVMAttestation0x002f7_79G0I341N83L30AFBD63J23QV0_:attestationForm:reportAction']/div[3]/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='viewns_0x002fpvm0x00252fattestation0x002fPVMAttestation0x002f7_79G0I341N83L30AFBD63J23QV0_:attestationForm:reportAction_1']")).click();	
	mShot.multiScreenShot(driver);
	}
	@When("^user select contractor on the attestation page$")
	public  void user_select_contractor_on_the_attestation_page() throws Throwable {
		System.out.println("scroll") ;
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,750)");
		System.out.println("scroll is working") ;
	
		driver.findElement(By.xpath("//*[@id='viewns_0x002fpvm0x00252fattestation0x002fPVMAttestation0x002f7_79G0I341N83L30AFBD63J23QV0_:attestationTextForm:opt1']/div[2]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='viewns_0x002fpvm0x00252fattestation0x002fPVMAttestation0x002f7_79G0I341N83L30AFBD63J23QV0_:attestationTextForm:acceptBtn1A']/span")).click();	
		
		
	}
	
	@When("^user select CMS Employee on the attestation page and Confirm$")
	public void user_select_CMS_Employee_on_the_attestation_page_and_Confirm() throws Throwable {
		System.out.println("scroll") ;
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,750)");
		System.out.println("scroll is working") ;
	
		driver.findElement(By.xpath("//*[@id='viewns_0x002fpvm0x00252fattestation0x002fPVMAttestation0x002f7_79G0I341N83L30AFBD63J23QV0_:attestationTextForm:opt2']/div[2]/span")).click();
		Thread.sleep(1000);
		mShot.multiScreenShot(driver);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='viewns_0x002fpvm0x00252fattestation0x002fPVMAttestation0x002f7_79G0I341N83L30AFBD63J23QV0_:attestationTextForm:acceptBtn1B']/span")).click();
		
	}

     @When("^user search for pre selected TIN name\"([^\"]*)\"$")
     public void user_search_for_pre_selected_TIN_name(String arg1 ) throws Throwable {
    	 Thread.sleep(3000);
    		JavascriptExecutor jse = (JavascriptExecutor)driver;
    	    jse.executeScript("window.scrollBy(0,-500)");
    	    System.out.println("Done1");
    	    driver.switchTo().frame("microstrategyPane");
    	    Thread.sleep(60000);
    	    driver.findElement(By.id("id_mstr46_txt")).sendKeys(arg1);
     }

@When("^user move the TIN Name from Available section to Selected section$")
public void user_move_the_TIN_Name_from_Available_section_to_Selected_section() throws Throwable {


     
    	    driver.findElement(By.xpath(".//*[@id='id_mstr46']/table/tbody/tr/td[2]/div/input")).click();
    	    Thread.sleep(60000);
    	     WebElement ELe = driver.findElement(By.xpath(".//*[@id ='id_mstr48ListContainer']/div[1]/div"));
     	    Actions act = new Actions(driver);
     	    act.doubleClick(ELe).perform();
     	    
     	    
     	    Thread.sleep(2000);
     	   mShot.multiScreenShot(driver);
     	 //  driver.switchTo().defaultContent();
     	  Thread.sleep(2000);
     	   JavascriptExecutor jse1 = (JavascriptExecutor)driver;
     	   jse1.executeScript("window.scrollBy(0,700)");
     	  Thread.sleep(2000);
     	// driver.switchTo().frame("microstrategyPane");
}
     	@When("^user clicks the Run Document$")
     	public void user_clicks_the_Run_Document() throws Throwable {	   






	 
     	   Thread.sleep(2000);
     	   driver.findElement(By.id("id_mstr59")).click();
     	   System.out.println("mstr 59 is located");
     	   Thread.sleep(40000);
     	 
        	
     	  driver.switchTo().defaultContent();

    	  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
     	  jse2.executeScript("window.scrollBy(0,-500)");
     	  
     	 System.out.println("scroll is located");
     	  
     	driver.switchTo().frame("microstrategyPane");
     	System.out.println("frame is located");
     	 
}
     	@Given("^user verify Report of the report1$")
     	public void user_verify_Report_of_the_report1() throws Throwable {
     		Thread.sleep(60000);
     		 mShot.multiScreenShot(driver);
     		 String title =driver.findElement(By.xpath("//div[contains(@id,'kIGK25480')]")).getText();
     		 System.out.println(title);
     		 
     		 String title1 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25482')]")).getText();
     		 System.out.println(title1);
     		 
     		 String title2 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25488')]")).getText();
     		 System.out.println(title2);
     		
     		
    		 //Assert.assertTrue(title2.contains("BFQNM PFGGFWF"));
     		Assert.assertTrue(title2.contains("BFQNM PFGGFWF"));

    		 System.out.println("Database value for GroupName matches the Portal:"+title2);
     		 
     		 String title3 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25495')]")).getText();
     		 System.out.println(title3);
      		//Assert.assertTrue(title3.contains("2586"));
     		Assert.assertTrue(title3.contains("2586"));
     		 System.out.println("Database value for last four of TIN number matches the Portal:"+title3);
     		 
     		 String title4 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25503')]")).getText();
     		 System.out.println(title4);
     		
     		 
     		 String title5 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25510')]")).getText();
     		 System.out.println(title5);
     		 
     		Assert.assertTrue(title5.contains("02/17/2018"));
      		 System.out.println("Database value for VBM Decision date matches the Portal:"+title5);
     		 String title6 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25514')]")).getText();
     		 System.out.println(title6);
     		 String title7 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25520')]")).getText();
     		 System.out.println(title7);
     		Assert.assertTrue(title7.contains("2018 Value Modifier calculated"));
     		 System.out.println("Database value for VBM Text matches the Portal:"+title7);
     		 
     		 
     		 
     		 String title8 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25527')]")).getText();
     		 System.out.println(title8);
     		 
     		 String title9 =driver.findElement(By.xpath("//div[contains(@id,'kK58')]")).getText();
     		 System.out.println(title9);
     		Assert.assertTrue(title9.contains("Average Cost"));
    		 System.out.println("Database value for Recalculated Cost text matches the Portal:"+title9);
     		 
     		 //Average Cost
     		 String title10 =driver.findElement(By.xpath("//div[contains(@id,'kK129')]")).getText();
     		 System.out.println(title10);
     		 
     		 Assert.assertTrue(title10.contains("a neutral adjustment, meaning no adjustment (0.0%)"));
   		     System.out.println("Database value for VBM Modification Text matches the Portal:"+title10);
     		 
     		 String title11 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25577')]")).getText();
     		 System.out.println(title11);
     		 
     		 String title12 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25581')]")).getText();
     		 System.out.println(title12);
     		 
     		 String title13 =driver.findElement(By.xpath("//div[contains(@id,'kK110')]")).getText();
     		 System.out.println(title13);
     		 
     		 
     		 
     
     		 
     		
     		
     		
     		
     	}
     	
     	@Given("^user verify Report Scenario One Type Two$")
     	public void user_verify_Report_Scenario_One_Type_Two() throws Throwable {
     		Thread.sleep(60000);
     		 mShot.multiScreenShot(driver);
     		 String title =driver.findElement(By.xpath("//div[contains(@id,'kIGK25480')]")).getText();
     		 System.out.println(title);
     		 
     		 String title1 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25482')]")).getText();
     		 System.out.println(title1);
     		 
     		 String title2 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25488')]")).getText();
     		 System.out.println(title2);
     		
     		
    		 //Assert.assertTrue(title2.contains("BFQNM PFGGFWF"));
     		Assert.assertTrue(title2.contains("STWRFS NQTBNYJ"));

    		 System.out.println("Database value for GroupName matches the Portal:"+title2);
     		 
     		 String title3 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25495')]")).getText();
     		 System.out.println(title3);
      		//Assert.assertTrue(title3.contains("2586"));
     		Assert.assertTrue(title3.contains("0668"));
     		 System.out.println("Database value for last four of TIN number matches the Portal:"+title3);
     		 
     		 String title4 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25503')]")).getText();
     		 System.out.println(title4);
     		
     		 
     		 String title5 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25510')]")).getText();
     		 System.out.println(title5);
     		 
     		Assert.assertTrue(title5.contains("09/30/2017"));
      		 System.out.println("Database value for VBM Decision date matches the Portal:"+title5);
     		 String title6 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25514')]")).getText();
     		 System.out.println(title6);
     		 String title7 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25520')]")).getText();
     		 System.out.println(title7);
     		Assert.assertTrue(title7.contains("2018 Value Modifier calculated"));
     		 System.out.println("Database value for VBM Text matches the Portal:"+title7);
     		 
     		 
     		 
     		 String title8 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25527')]")).getText();
     		 System.out.println(title8);
     		 
     		 String title9 =driver.findElement(By.xpath("//div[contains(@id,'kK58')]")).getText();
     		 System.out.println(title9);
     		Assert.assertTrue(title9.contains("Low Cost"));
    		 System.out.println("Database value for Recalculated Cost text matches the Portal:"+title9);
     		 
     		 //Average Cost
     		 String title10 =driver.findElement(By.xpath("//div[contains(@id,'kK212')]")).getText();
     		 System.out.println(title10);
     		 
     		 Assert.assertTrue(title10.contains("an upward adjustment equal to one (+1.0) times the adjustment factor"));
   		     System.out.println("Database value for VBM Modification Text matches the Portal:"+title10);
     		 
     		 String title11 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25577')]")).getText();
     		 System.out.println(title11);
     		 
     		 String title12 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25581')]")).getText();
     		 System.out.println(title12);
     		 
     		 String title13 =driver.findElement(By.xpath("//div[contains(@id,'kK110')]")).getText();
     		 System.out.println(title13);
     		 
     		 
     		 
     
     		 
     		
     		
     		
     		
     	}
     	
     	
     	
     	
     	
     	
     	@When("^user clicks About this Report$")
     	public void user_clicks_About_this_Report() throws Throwable {
     	   	Thread.sleep(60000);
     	 	  driver.findElement(By.xpath("//span[contains(@id,'mstr')] [text() ='About This Report']")).click();
     	 	  
     	 	  System.out.println("Done after all ");
     	}
     		
     		
     		
     		
     		
     		@When("^user clicks Quality Performance tab on AQRUR Report$")
     		public void user_clicks_Quality_Performance_tab_on_AQRUR_Report() throws Throwable {
     	Thread.sleep(60000);
   	  driver.findElement(By.xpath("//span[contains(@id,'mstr')] [text() ='Quality Performance']")).click();
   	  
   	  System.out.println("Done after all ");
   	  
     		}
   	  
   	  
   	@When("^user clicks Cost Performance tab on AQRUR Report$")
   	public void user_clicks_Cost_Performance_tab_on_AQRUR_Report() throws Throwable { 
   	  
   	Thread.sleep(60000);
 	  driver.findElement(By.xpath("//span[contains(@id,'mstr')] [text() ='Cost Performance']")).click();
 	  
 	  System.out.println("Done after all ");
   	}
 	  
 	  
 	 @When("^user clicks Accompanying Tables tab on AQRUR Report$")
 	public void user_clicks_Accompanying_Tables_tab_on_AQRUR_Report() throws Throwable { 
 	  
 	  
   	Thread.sleep(60000);
 	  driver.findElement(By.xpath("//span[contains(@id,'mstr')] [text() ='Accompanying Tables']")).click();
 	  
 	  System.out.println("Done after all ");
 	 }
 	  

@When("^user clicks About the Value Modifier tab on AQRUR Report$")
public void user_clicks_About_the_Value_Modifier_tab_on_AQRUR_Report() throws Throwable {
 	  
 	  
   	Thread.sleep(60000);
 	  driver.findElement(By.xpath("//span[contains(@id,'mstr')] [text() ='About the 2018 Value Modifier']")).click();
 	  
 	  System.out.println("Done after all ");
 	  
     	}
 	  
 	 @When("^user clicks Glossary tab on AQRUR Report$")
 	public void user_clicks_Glossary_tab_on_AQRUR_Report() throws Throwable {
 	  
   	Thread.sleep(60000);
 	  driver.findElement(By.xpath("//span[contains(@id,'mstr')] [text() ='Glossary']")).click();
 	  
 	  System.out.println("Done after all ");
 	  
 	 }
 	@When("^user clicks Your TINs Value Modifier tab on AQRUR Report$")
 	public void user_clicks_Your_TIN_s_Value_Modifier_tab_on_AQRUR_Report() throws Throwable {

   	Thread.sleep(60000);
 	  driver.findElement(By.xpath("//span[contains(@id,'mstr')] [text() ='Your TIN’s 2018 Value Modifier']")).click();
 	  
 	  System.out.println("Done after all ");
 	 }
 	
 	

 	//@And("^user verify Aqrur cover page Report Senario One Against Database\"([^\"]*)\"$")
 	//public void user_verify_Aqrur_cover_page_Report_Senario_One_Against_Database(String arg1) throws Throwable
 	@And("^user verify Aqrur cover page Report Senario One Against Database$")
 	public void user_verify_Aqrur_cover_page_Report_Senario_One_Against_Database() throws Throwable
 	{	String title5 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25510')]")).getText();
 	    Assert.assertTrue(title5.contains("02/17/2018"));
		System.out.println("Database value for VBM Decision date matches the Portal: 02/17/2018 "+" | " +title5);
 		 
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		 
 		 
		String title8 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25527')]")).getText(); 
	Assert.assertEquals("", title8,"CMS has determined that your TIN avoided the 2018 Physician Quality Reporting System (PQRS) payment adjustment as a group or at least 50 percent of the eligible professionals in your TIN avoided the PQRS payment adjustment as individuals (or, if a solo practitioner, you avoided the 2018 PQRS payment adjustment as an individual). This qualifies your TIN to avoid an automatic Value Modifier downward adjustment in 2018.");
        System.out.println("Template is matching the portal for scenario 1|type 1|CMS has determined that your TIN avoided the 2018 Physician Quality Reporting System (PQRS) payment adjustment as a group or at least 50 percent of the eligible professionals in your TIN avoided the PQRS payment adjustment as individuals (or, if a solo practitioner, you avoided the 2018 PQRS payment adjustment as an individual). This qualifies your TIN to avoid an automatic Value Modifier downward adjustment in 2018. |" + title8);
	 
     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

        String title9 =driver.findElement(By.xpath("//div[contains(@id,'kK58')]")).getText();
      Assert.assertEquals("","Your TIN’s quality performance is classified as Average Quality. Your TIN's cost performance continues to be classified as Average Cost." , title9);
        
        
        
      
      
    Assert.assertTrue(title9.contains("Average Cost"));
    System.out.println("Template is matching the portal for scenario 1|type 1|Your TIN’s quality performance is classified as Average Quality. Your TIN's cost performance continues to be classified as Average Cost." +title9);
	System.out.println("Database value for Recalculated Cost text matches the Portal:Average Cost |"+title9);
 	/////////////////////////////////////////////////////////////////////////////////////////////////////	
	 String title10 =driver.findElement(By.xpath("//div[contains(@id,'kK129')]")).getText();
     Assert.assertEquals("","This means that the Value Modifier applied to payments for items and services under the Medicare Physician Fee Schedule for clinicians subject to the Value Modifier billing under your TIN in 2018 will result in a neutral adjustment, meaning no adjustment (0.0%)." , title10);
     Assert.assertTrue(title10.contains("a neutral adjustment, meaning no adjustment (0.0%)"));
     
     System.out.println("Template is matching the portal for scenario 1|type 1|This means that the Value Modifier applied to payments for items and services under the Medicare Physician Fee Schedule for clinicians subject to the Value Modifier billing under your TIN in 2018 will result in [a neutral adjustment, meaning no adjustment (0.0%).");
	 System.out.println("Database value for VBM Modification Text matches the Portal:"+title10); 
	System.out.println("finish testing ");
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	 driver.quit();
	 System.out.println("finish closing browser ");
 	}
 	
 	@And("^user verify Aqrur cover page Report Senario One Type Two Against Database$")
 	public void user_verify_Aqrur_cover_page_Report_Senario_One_Type_Two_Against_Database() throws Throwable
 	{	String title5 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25510')]")).getText();
 	    Assert.assertTrue(title5.contains("02/17/2018"));
		System.out.println("Database value for VBM Decision date matches the Portal: 02/17/2018 "+" | " +title5);
 		 
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		 
 		 
		String title8 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25527')]")).getText(); 
	Assert.assertEquals("", title8,"CMS has determined that your TIN avoided the 2018 Physician Quality Reporting System (PQRS) payment adjustment as a group or at least 50 percent of the eligible professionals in your TIN avoided the PQRS payment adjustment as individuals (or, if a solo practitioner, you avoided the 2018 PQRS payment adjustment as an individual). This qualifies your TIN to avoid an automatic Value Modifier downward adjustment in 2018.");
        System.out.println("Template is matching the portal for scenario 1|type 1|CMS has determined that your TIN avoided the 2018 Physician Quality Reporting System (PQRS) payment adjustment as a group or at least 50 percent of the eligible professionals in your TIN avoided the PQRS payment adjustment as individuals (or, if a solo practitioner, you avoided the 2018 PQRS payment adjustment as an individual). This qualifies your TIN to avoid an automatic Value Modifier downward adjustment in 2018. |" + title8);
	 
     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

        String title9 =driver.findElement(By.xpath("//div[contains(@id,'kK58')]")).getText();
      Assert.assertEquals("","Your TIN’s quality performance is classified as Average Quality. Your TIN's cost performance continues to be classified as Average Cost." , title9);
        
        
        
      
      
    Assert.assertTrue(title9.contains("Average Cost"));
    System.out.println("Template is matching the portal for scenario 1|type 1|Your TIN’s quality performance is classified as Average Quality. Your TIN's cost performance continues to be classified as Average Cost." +title9);
	System.out.println("Database value for Recalculated Cost text matches the Portal:Average Cost |"+title9);
 	/////////////////////////////////////////////////////////////////////////////////////////////////////	
	 String title10 =driver.findElement(By.xpath("//div[contains(@id,'kK129')]")).getText();
     Assert.assertEquals("","This means that the Value Modifier applied to payments for items and services under the Medicare Physician Fee Schedule for clinicians subject to the Value Modifier billing under your TIN in 2018 will result in a neutral adjustment, meaning no adjustment (0.0%)." , title10);
     Assert.assertTrue(title10.contains("a neutral adjustment, meaning no adjustment (0.0%)"));
     
     System.out.println("Template is matching the portal for scenario 1|type 1|This means that the Value Modifier applied to payments for items and services under the Medicare Physician Fee Schedule for clinicians subject to the Value Modifier billing under your TIN in 2018 will result in [a neutral adjustment, meaning no adjustment (0.0%).");
	 System.out.println("Database value for VBM Modification Text matches the Portal:"+title10); 
	System.out.println("finish testing ");
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	 driver.quit();
	 System.out.println("finish closing browser ");
 	}
 	
 	@And("^user verify Aqrur cover page Report Senario One Against Template$")
 	public void user_verify_Aqrur_cover_page_Report_Senario_One_Against_Template() throws Throwable
 	{
 	
 		 System.out.println("finish template ");
 		
 	}
 	  
 	  
 	  
	@And("^user verify Aqrur cover page Report Senario One$")
 	public void user_verify_Aqrur_cover_page_Report_Senario_One() throws Throwable
 	{
 		
 	}
	
 	@Given("^user verify Report of the report$")
 	public void user_verify_Report_of_the_report() throws Throwable {
 		Thread.sleep(60000);
 		//scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
 		 String title =driver.findElement(By.xpath("//div[contains(@id,'kIGK25480')]")).getText();
 		 System.out.println(title);
 		 
 		 String title1 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25482')]")).getText();
 		 System.out.println(title1);
 		 
 		 String title2 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25488')]")).getText();
 		 System.out.println(title2);
 		
 		
		 //Assert.assertTrue(title2.contains("BFQNM PFGGFWF"));
 		Assert.assertTrue(title2.contains("BFQNM PFGGFWF"));

		 System.out.println("Database value for GroupName matches the Portal:"+title2);
 		 
 		 String title3 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25495')]")).getText();
 		 System.out.println(title3);
  		//Assert.assertTrue(title3.contains("2586"));
 		Assert.assertTrue(title3.contains("2586"));
 		 System.out.println("Database value for last four of TIN number matches the Portal:"+title3);
 		 
 		 String title4 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25503')]")).getText();
 		 System.out.println(title4);
 		
 		 
 		 String title5 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25510')]")).getText();
 		 System.out.println(title5);
 		 
 		Assert.assertTrue(title5.contains("02/17/2018"));
  		 System.out.println("Database value for VBM Decision date matches the Portal:"+title5);
 		 String title6 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25514')]")).getText();
 		 System.out.println(title6);
 		 String title7 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25520')]")).getText();
 		 System.out.println(title7);
 		Assert.assertTrue(title7.contains("2018 Value Modifier calculated"));
 		 System.out.println("Database value for VBM Text matches the Portal:"+title7);
 		 
 		 
 		 
 		 String title8 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25527')]")).getText();
 		 System.out.println(title8);
 		 
 		 String title9 =driver.findElement(By.xpath("//div[contains(@id,'kK58')]")).getText();
 		 System.out.println(title9);
 		Assert.assertTrue(title9.contains("Average Cost"));
		 System.out.println("Database value for Recalculated Cost text matches the Portal:"+title9);
 		 
 		 //Average Cost
 		 String title10 =driver.findElement(By.xpath("//div[contains(@id,'kK129')]")).getText();
 		 System.out.println(title10);
 		 
 		 Assert.assertTrue(title10.contains("a neutral adjustment, meaning no adjustment (0.0%)"));
		     System.out.println("Database value for VBM Modification Text matches the Portal:"+title10);
 		 
 		 String title11 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25577')]")).getText();
 		 System.out.println(title11);
 		 
 		 String title12 =driver.findElement(By.xpath("//div[contains(@id,'kIGK25581')]")).getText();
 		 System.out.println(title12);
 		 
 		 String title13 =driver.findElement(By.xpath("//div[contains(@id,'kK110')]")).getText();
 		 System.out.println(title13);
 		 
 		 
 		 
 
 		 
 		
 		
 		
 		
 	}
 	  

 	  
 	  
 	  
 	  
 	  
 	  

   	  
   	  
   	  
   	  
   	  
   	  
     	
    	 
     }


	