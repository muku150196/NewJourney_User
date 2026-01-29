package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					//features= {".//Features/"},
					//features= {".//Features/Login.feature"},
		features= {".//Features/ONB.feature"},
		//features= {".//Features/repeatcase.feature"},
							glue={"stepDefinitions","Hooks"},
					plugin= {"pretty", "html:reports/myreport.html",
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=false,    // to avoid junk characters in output
					publish=true  // to publish report in cucumber server
			        		//tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@LoginRequired"
					//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
					 //tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {

		}
