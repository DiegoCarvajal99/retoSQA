package com.floristeriamundoamor.www.questions;

import net.serenitybdd.screenplay.Question;

public class ValidarEliminacionProductoCumpleanios {
    public static Question<Integer> on (){
        return actor -> actor.recall("cero productos");
    }
}
