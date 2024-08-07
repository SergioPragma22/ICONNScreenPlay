package starter.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import starter.ui.LoginUI;

public class LoginTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("SergioTest@Test.com").into(LoginUI.email),
                SendKeys.of("Prueba123*").into(LoginUI.password),
                Click.on(LoginUI.signIn)
        );
    }


}
