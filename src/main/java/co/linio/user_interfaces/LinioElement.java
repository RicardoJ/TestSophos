package co.linio.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
/**
 * 
 * Clase Extiende de PagObject, se encarga de mapear los elementos utilizados en la pagina web  
 * 
 * @author ricardo.diaz
 *
 */
public class LinioElement extends PageObject {
	/**
	 * este elemento contiene la barra de busqueda de la pagina y con esta buscar el producto
	 */
	public static final Target LINIO_INPUT_SEARCH = Target.the("Linio input search ").locatedBy("//*[@name= 'q']");
	/**
	 * este elemento contiene la ventana modal 
	 */
	public static final Target CLOSE_WINDOW_MODAL = Target.the("close window modal").locatedBy("/html/body/div[6]/div[2]");
	/**
	 * este elemento contiene solo un producto
	 */
	public static final Target PRODUCT = Target.the("product").locatedBy("//*[text()[contains(.,'IPhone XS 64GB')] and @class = 'title-section']");
	/**
	 * este elemento contiene el boton para dirigirse al carrito de compra
	 */
	public static final Target SHOPPING_CART = Target.the("shopping cart").locatedBy("//*[@id='buy-now']");
	/**
	 * este elemento contiene el boton de confirmacion para dirigirse al carrito de compra
	 */
	public static final Target CONFIRM_SHOPPING_CART = Target.the("confirm shopping cart").locatedBy("//*[@id='alert-modal']/div/div/div/div[3]/a");
	
}
