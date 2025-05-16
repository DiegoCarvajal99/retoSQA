package com.floristeriamundoamor.www.UI;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicialUI {

    public static Target BTN_AMOR = Target.the("CATEGORIA AMOR")
            .located(By.xpath("//ul[@id='primary-menu']/li/a[.='Amor']"));

    public static Target BTN_CUMPLEANIOS = Target.the("CATEGORIA AMOR")
            .located(By.xpath("//ul[@id='primary-menu']/li/a[.='Cumpleaños']"));
}


