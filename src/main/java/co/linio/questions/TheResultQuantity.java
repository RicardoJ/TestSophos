package co.linio.questions;

import co.linio.user_interfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResultQuantity implements Question<String>{
	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(ShoppingCartPage.QUANTITY).viewedBy(actor).asString();
		
	}

	public static TheResultQuantity is() {
		// TODO Auto-generated method stub
		return new TheResultQuantity();
	}
}
