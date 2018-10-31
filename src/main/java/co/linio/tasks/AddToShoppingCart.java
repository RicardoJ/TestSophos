package co.linio.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.linio.user_interfaces.LinioElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class AddToShoppingCart  implements Task{
	
	@Override
	@Step("{0} add product")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(LinioElement.SHOPPING_CART));	
		actor.attemptsTo(Click.on(LinioElement.CONFIRM_SHOPPING_CART));	
		
	
	}

	public static AddToShoppingCart theProduct() {		
		return instrumented(AddToShoppingCart.class);
	}

}
