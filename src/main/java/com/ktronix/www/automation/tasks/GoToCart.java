package com.ktronix.www.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.ktronix.www.automation.userinterface.ProductPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class GoToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Quantity_Option),
                Click.on(Button_AddCart),
                Click.on(Out),
                Click.on(Button_Cart),
                Click.on(Pay_Button)
        );
    }
    public static GoToCart theCart(){
        return instrumented(GoToCart.class);
    }
}
