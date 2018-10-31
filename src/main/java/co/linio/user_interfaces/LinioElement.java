package co.linio.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LinioElement extends PageObject {
	public static final Target LINIO_INPUT_SEARCH = Target.the("Linio input search ").locatedBy("//*[@name= 'q']");
	public static final Target CLOSE_WINDOW_MODAL = Target.the("close window modal").locatedBy("/html/body/div[6]/div[2]");
	public static final Target PRODUCT = Target.the("product").locatedBy("//*[text()[contains(.,'IPhone XS 64GB')] and @class = 'title-section']");
	public static final Target SHOPPING_CART = Target.the("shopping cart").locatedBy("//*[@id='buy-now']");
	public static final Target CONFIRM_SHOPPING_CART = Target.the("confirm shopping cart").locatedBy("//*[@id='alert-modal']/div/div/div/div[3]/a");
	
}
