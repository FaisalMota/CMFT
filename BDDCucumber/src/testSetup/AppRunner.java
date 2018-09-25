package testSetup;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions (plugin = { "pretty", "html:target/cucumber-reports" },
                              monochrome = true,
		                   // "html:target/cucumber-html-report"},
		                   //  "json:target/cucumber.json",
		                   //  "pretty:target/cucumber-pretty.txt",
		                   //  "usage:target/cucumber-usage.json",
		                  //   "junit:target/cucumber-results.xml"}, 
                  features = { "src/featurefiles/" }, 
                  glue = { "stepdef" }, 
                  tags = {"@Condition"} , 
                  dryRun = false )
 

public  class AppRunner {

}
