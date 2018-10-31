package co.linio.user_interfaces;

import java.util.List;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductoLista extends PageObject {
	
	public  List<WebElementFacade> listaProductos(){
		List<WebElementFacade> listaProductos = findAll(By.xpath("//*[@class='catalogue-product row']"));
		return listaProductos;

	}

}
