package com.floristeriamundoamor.www.tasks;

import com.floristeriamundoamor.www.interactions.ProductoAleatorio;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.floristeriamundoamor.www.UI.CategoriaAmorUI.*;
import static com.floristeriamundoamor.www.UI.PaginaInicialUI.BTN_CUMPLEANIOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SeleccionarProductoCumpleaniosTask implements Task {

    public static int cantidad;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_CUMPLEANIOS, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BTN_CUMPLEANIOS),
                ProductoAleatorio.on(),
                WaitUntil.the(BTN_AGREGAR_CARRITO, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BTN_AGREGAR_CARRITO)

        );

        List<WebElementFacade> productos = LBL_PRODUCTOS.resolveAllFor(actor);
        cantidad = productos.size();
        actor.remember("dos productos", cantidad);


    }

    public static SeleccionarProductoCumpleaniosTask on(){
        return instrumented(SeleccionarProductoCumpleaniosTask.class);
    }
}
