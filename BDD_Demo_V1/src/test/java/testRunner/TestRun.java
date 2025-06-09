package testRunner;


import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Login.feature",glue="stepDefinations",dryRun=false,monochrome=true,plugin= {"pretty","html:test-otput"})

public class TestRun {

}
