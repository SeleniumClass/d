package Framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Testrunner {

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			// This creates cucumber reports
	        plugin = {"pretty", "html:target/site/cucumber-pretty"},
	        //This create auto method name in camelCase
	        snippets = cucumber.api.SnippetType.CAMELCASE,
	        
	        //Path to your feature file
	        features = {"Feature"},
	        // Specify tags to be executed
	       // tags = {"@regression-3"},
	        //Specify step definition package name (Note: make sure to have this package on current directory) 
	        glue = {"stepde"}
	)
	public class TestRunner {
		
	}

	
}
