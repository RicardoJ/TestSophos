package co.linio.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src.test.resources/features/search_linio.feature",
		glue = {"co.step_definition"},
		snippets = SnippetType.UNDERSCORE
)
		
public class LinioRunner {

}
