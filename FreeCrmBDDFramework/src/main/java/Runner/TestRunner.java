package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
		// features = "C:/Softwares/Prj/FreeCrmBDDFramework/src/main/java/Features/login.feature"  //path of the feature files
		features = "C:/Softwares/Prj/FreeCrmBDDFramework/src/main/java/Features/dealsmap.feature"
		//features = "classpath:features"
		,glue = {"StepDefinition"} //the path of the step definition file
		,format = {"pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_output/cucumber.xml"}, //to generate different types of reports
		monochrome = true, //to display the console output in a proper readable format
		strict = true, //it will check if any step is not defined inside step definition file
		dryRun = true  //to check the mapping is proper between feature file and step definition file
		)

public class TestRunner {

}
