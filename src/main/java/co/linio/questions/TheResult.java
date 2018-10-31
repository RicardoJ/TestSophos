package co.linio.questions;

import co.linio.user_interfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.UIStateReaderBuilder;

public class TheResult implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(ShoppingCartPage.NAME_PRODUCT).viewedBy(actor).asString();
		
	}

	public static TheResult is() {
		// TODO Auto-generated method stub
		return new TheResult();
	}

}
 
