package com.floristeriamundoamor.www.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/seleccionar_dos_productos_amor.feature",
        glue = "com.floristeriamundoamor.www.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class SeleccionarDosProductosAmorRunner {
}
