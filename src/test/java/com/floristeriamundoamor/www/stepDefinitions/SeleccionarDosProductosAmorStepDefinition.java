package com.floristeriamundoamor.www.stepDefinitions;


import com.floristeriamundoamor.www.questions.ValidarProductosAmor;
import com.floristeriamundoamor.www.tasks.SeleccionarDosProductosAmorTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SeleccionarDosProductosAmorStepDefinition {

    public static EnvironmentVariables environmentVariables;

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentre en la sitio web floristeria mundo flor")
    public void queElUsuarioSeEncuentreEnLaSitioWebFloristeriaMundoFlor() {
        String baseUrl = environmentVariables.optionalProperty("environments.qa.base.url").get();
        theActorCalled("user").wasAbleTo(Open.url(baseUrl));
    }
    @Cuando("el usurio seleccione dos productos de la categoria amor y los agregue al carrito")
    public void elUsurioSeleccioneDosProductosDeLaCategoriaAmorYLosAgregueAlCarrito() {
        theActorInTheSpotlight().attemptsTo(SeleccionarDosProductosAmorTask.on());

    }
    @Entonces("Validar que los productos se hayan agregado correctamente")
    public void validarQueLosProductosSeHayanAgregadoCorrectamente() {
        Ensure.that(ValidarProductosAmor.on()).isEqualTo(2);
    }

}
