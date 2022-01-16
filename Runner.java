
package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\91798\\eclipse-workspace\\test\\Assignment\\src\\test\\resources\\Features\\AssignmentOne.feature", //the path of the feature files
 glue={"C:\\Users\\91798\\eclipse-workspace\\test\\Assignment\\src\\test\\java\\StepDefinition\\AssignmentOne.java"}, //the path of the step definition files
format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
 monochrome = true, //display the console output in a proper readable format
 strict = true, //it will check if any step is not defined in step definition file
 //dryRun = false //to check the mapping is proper between feature file and step def file
tags = {"@tag1"}
)


public class Runner {
	

}
