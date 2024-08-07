package starter.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import starter.ui.LoginUI;

public class OpenAppTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginUI.registrate)
        );
    }

    public static OpenAppTask Open() {
        return instrumented(OpenAppTask.class);
    }

}
