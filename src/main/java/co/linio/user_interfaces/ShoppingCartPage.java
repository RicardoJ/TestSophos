package co.linio.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage {
	
	public static final Target NAME_PRODUCT = Target.the("name of the product").locatedBy("/html/body/div[3]/main/div[1]/div/div[1]/div[3]/div[2]/div[2]/span/a");
	public static final Target QUANTITY = Target.the("quantity of the product").locatedBy("/html/body/div[3]/main/div[1]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]");

}
