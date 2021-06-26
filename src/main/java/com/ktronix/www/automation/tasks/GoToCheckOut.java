package com.ktronix.www.automation.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.ktronix.www.automation.userinterface.CheckOutPage.*;
public class GoToCheckOut implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("rvera3158@gmail.com").into(Email),
                Click.on(Login_Button),
                Enter.theValue("Rosa").into(First_Name),
                Enter.theValue("Vera").into(Last_Name),
                Enter.theValue("3134986214").into(Phone),
                Click.on(Authorize_Check),
                Click.on(Continue),
                Enter.theValue("60254613").into(ID),
                Click.on(Depart),
                Click.on(City),
                Enter.theValue("Calle 9 #144").into(Address),
                Enter.theValue("Cariongo").into(Barrio),
                Click.on(Continue_Button),
                Click.on(Continue_Button2)
        );
    }
    public static GoToCheckOut theCheck(){
        return instrumented(GoToCheckOut.class);
    }
}
