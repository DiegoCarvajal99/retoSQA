package com.floristeriamundoamor.www.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.floristeriamundoamor.www.UI.CategoriaAmorUI.LBL_PRODUCTOS;
import static com.floristeriamundoamor.www.UI.CategoriaCumpleaniosUI.BTN_ELIMINAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class EliminarProductoCumpleaniosTask implements Task {

    public static int cantidad;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_ELIMINAR, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BTN_ELIMINAR)

        );

        List<WebElementFacade> productos = LBL_PRODUCTOS.resolveAllFor(actor);
        cantidad = productos.size();
        actor.remember("cero productos", cantidad);


    }

    public static EliminarProductoCumpleaniosTask on(){
        return instrumented(EliminarProductoCumpleaniosTask.class);
    }
}
