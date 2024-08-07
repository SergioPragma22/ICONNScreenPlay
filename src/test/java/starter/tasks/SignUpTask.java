package starter.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import starter.ui.LoginUI;

public class SignUpTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginUI.signUp)
        );
    }

    public static SignUpTask Open() {
        return instrumented(SignUpTask.class);
    }
}
