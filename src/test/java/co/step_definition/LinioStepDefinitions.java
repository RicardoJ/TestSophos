package co.step_definition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.linio.questions.TheResult;
import co.linio.questions.TheResultQuantity;
import co.linio.tasks.AddToShoppingCart;
import co.linio.tasks.ChooseProduct;
import co.linio.tasks.GoTo;
import co.linio.tasks.OpenTheBrowser;
import co.linio.user_interfaces.LinioHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class LinioStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver browser;

	private Actor ricardo = Actor.named("ricardo");

	private LinioHomePage linioHomePage;

	@Before
	public void setup() {
		ricardo.can(BrowseTheWeb.with(browser));
	}

	@Given("^that I opened  browser at Linio home page$")
	public void that_i_opened_browser_at_linio_home_page() throws Exception {
		ricardo.wasAbleTo(OpenTheBrowser.at(linioHomePage));
	}

	@And("^I search a product '(.*)'")
	public void i_search_a_product(String producto) throws Exception {
		ricardo.wasAbleTo(GoTo.theProduct(producto));
	}

	@And("^choose product$")
	public void choose_product() throws Throwable {
		ricardo.wasAbleTo(ChooseProduct.theProduct());
	}

	@When("^I add to shopping cart$")
	public void i_add_to_shopping_cart() throws Throwable {
		ricardo.wasAbleTo(AddToShoppingCart.theProduct());
	}

	
	 @Then("^in the shopping cart show the product is not '(.*)' with quantity not '(.*)'")
	    public void in_the_shopping_cart_show_the_product_is_not_with_quantity_not(String expectedWord, String quantity) throws Throwable {
		 ricardo.should(seeThat(TheResult.is(), equalTo(expectedWord)),seeThat(TheResultQuantity.is(), equalTo(quantity)));;
		
	    }
	
	
	


	

}
