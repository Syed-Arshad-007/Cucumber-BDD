package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Featurefile" ,
        glue = {"stepDefinitions","hooks"},
        dryRun = false,    //checks whether feature file has step definition methods
        monochrome = true,  //It will convert and print console message in human redable format
        plugin = {"html:report/index.html", "json:report/jsonreport.json","junit:report/xmlreport.xml" },
       // tags = "@simpleLogin"    //To run only this particular test case
       // tags = "not @simpleLogin"  //To run all other test case except this case
      //  tags = "@Positive"           // To run on scenario level
      //  tags = "not @Positive"         //To run other than positive scenario
       //  tags = "@simpleLogin or @dataDriven" //OR case it will which feature file satisfy either tag condition
      //  tags = "@simpleLogin and @dataDriven"  //And case it will which feature file satisfy both tag condition
     tags = "@BackgroundExample"
)
public class RunnerClass {
    //It should combine feature file and step definition
    //Runner define


}
