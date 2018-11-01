package co.linio.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.linio.user_interfaces.ProductoLista;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class ChooseProduct  implements Task {
	ProductoLista productoLista;
	@Override
	@Step("{0} choose product")
	public <T extends Actor> void performAs(T actor) {
		try {
			//actor.attemptsTo(Click.on(LinioElement.PRODUCT));	
			
			int numeroRandom = (int) (Math.random() * 10)+1;
			actor.attemptsTo(Click.on(productoLista.listaProductos().get(numeroRandom)));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No encontro el elemento : "+e.getMessage());
			e.printStackTrace();
		}
		
		
	
	}

	public static ChooseProduct theProduct() {		
		return instrumented(ChooseProduct.class);
	}


}
