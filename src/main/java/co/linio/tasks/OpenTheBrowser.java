package co.linio.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.linio.user_interfaces.LinioHomePage;

public class OpenTheBrowser implements Task{
	
	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	@Step("{0} goes to #OpenTheBrowser")
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(Open.browserOn(page));
		} catch (Exception e) {
		
			try {
				actor.attemptsTo(Open.browserOn(page));
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("Error a cargar la pagina  "+ e.getMessage());
				e.printStackTrace();
			}
		}
		
	}

	public static OpenTheBrowser at(PageObject page) {
		return instrumented(OpenTheBrowser.class, page) ;
	}
}
