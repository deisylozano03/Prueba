package com.ktronix.www.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.ktronix.www.automation.userinterface.HomePage.*;
public class GoToProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(NoThanks_Button),
                Enter.theValue("Silla Gamer").into(Search_Option),
                Click.on(Search_Button)

        );
    }
    public static GoToProduct theProduct(){
        return instrumented(GoToProduct.class);
    }
}


