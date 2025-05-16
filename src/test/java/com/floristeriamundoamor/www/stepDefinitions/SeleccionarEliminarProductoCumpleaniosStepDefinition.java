package com.floristeriamundoamor.www.stepDefinitions;


import com.floristeriamundoamor.www.questions.ValidarProductosAmor;
import com.floristeriamundoamor.www.tasks.EliminarProductoCumpleaniosTask;
import com.floristeriamundoamor.www.tasks.SeleccionarDosProductosAmorTask;
import com.floristeriamundoamor.www.tasks.SeleccionarProductoCumpleaniosTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SeleccionarEliminarProductoCumpleaniosStepDefinition {

    public static EnvironmentVariables environmentVariables;

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Cuando("el usurio seleccione dos productos de la categoria cumpleaños y los agregue al carrito")
    public void elUsurioSeleccioneDosProductosDeLaCategoriaCumpleañosYLosAgregueAlCarrito() {
        theActorInTheSpotlight().attemptsTo(SeleccionarProductoCumpleaniosTask.on());

    }
    @Cuando("el usuario elimine el producto")
    public void elUsuarioElimineElProducto() {
        theActorInTheSpotlight().attemptsTo(EliminarProductoCumpleaniosTask.on());

    }
    @Entonces("Validar que los productos se hayan eliminado correctamente")
    public void validarQueLosProductosSeHayanEliminadoCorrectamente() {
        Ensure.that(ValidarProductosAmor.on()).isEqualTo(0);

    }
    }

