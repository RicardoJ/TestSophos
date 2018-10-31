package co.linio.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage extends PageObject{
	
	public static final Target NAME_PRODUCT = Target.the("name of the product").locatedBy("//*[@class= 'cart-item row']//following::a[2]");
	public static final Target QUANTITY = Target.the("quantity of the product").locatedBy("//*[@class= 'cart-item row']//*[@class='price-secondary']");

}
