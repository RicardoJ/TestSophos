package co.linio.questions;

import org.openqa.selenium.TimeoutException;

import co.linio.user_interfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.UIStateReaderBuilder;

public class TheResult implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		
		
		if(!Text.of(ShoppingCartPage.NAME_PRODUCT).viewedBy(actor).asString().isEmpty()) {
			return "null";
		}else
		{
			return Text.of(ShoppingCartPage.NAME_PRODUCT).viewedBy(actor).asString();
		}
			 
		

	}

	public static TheResult is() {
		// TODO Auto-generated method stub
		return new TheResult();
	}

}
 
