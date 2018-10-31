package co.linio.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.linio.user_interfaces.LinioElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class ChooseProduct  implements Task {
	
	@Override
	@Step("{0} choose product")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(LinioElement.PRODUCT));	
		
	
	}

	public static ChooseProduct theProduct() {		
		return instrumented(ChooseProduct.class);
	}


}
