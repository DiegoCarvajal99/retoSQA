package com.floristeriamundoamor.www.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaAmorUI {

    public static Target BTN_PRODUCTO = Target.the("PRODUCTO CATEGORIA AMOR")
            .located(By.xpath("//figure/a"));

    public static Target BTN_AGREGAR_CARRITO = Target.the("AGREGAR AL CARRITO")
            .located(By.name("add-to-cart"));

    public static Target BTN_SEGUIR_COMPRANDO = Target.the("SEGUIR COMPRANDO")
            .located(By.xpath("//a[contains(text(),'Seguir comprando')]"));

    public static Target LBL_PRODUCTOS = Target.the("PRODUCTOS EN EL CARRITO")
            .located(By.xpath("//table/tbody/tr/td/a/img"));
}
