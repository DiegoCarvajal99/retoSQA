package com.floristeriamundoamor.www.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.floristeriamundoamor.www.UI.CategoriaAmorUI.BTN_PRODUCTO;

public class ProductoAleatorio implements Interaction {

    public static int numRandom;


    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random = new Random();
        List<WebElementFacade> listaProductos = BTN_PRODUCTO.resolveAllFor(actor);
        numRandom = random.nextInt(listaProductos.size());
        listaProductos.get(numRandom).click();
    }

    public static Performable on(){
        return Instrumented.instanceOf(ProductoAleatorio.class).withProperties();
    }
}
