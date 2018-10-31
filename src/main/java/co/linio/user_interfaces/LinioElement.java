package co.linio.user_interfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LinioElement {
	public static final Target LINIO_INPUT_SEARCH = Target.the("Linio input search ").locatedBy("//*[@name= 'q']");
	public static final Target CLOSE_WINDOW_MODAL = Target.the("close window modal").locatedBy("/html/body/div[6]/div[2]");
	public static final Target PRODUCT = Target.the("product").locatedBy("//*[@id='catalogue-product-container']/div[2]/a/div[1]/figure/picture/img");
	public static final Target SHOPPING_CART = Target.the("shopping cart").locatedBy("//*[@id='buy-now']");
	public static final Target CONFIRM_SHOPPING_CART = Target.the("confirm shopping cart").locatedBy("//*[@id='alert-modal']/div/div/div/div[3]/a");
	
}
