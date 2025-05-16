package com.floristeriamundoamor.www.questions;

import net.serenitybdd.screenplay.Question;

public class ValidarProductosAmor {
    public static Question<Integer> on (){
        return actor -> actor.recall("dos productos");
    }
}
