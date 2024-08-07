package starter.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SendKeys;

import starter.ui.LoginUI;
import starter.utilities.EmailGenerator;

public class CreateTask implements Task {


    private final String password;

    public CreateTask(String password) {
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String email = EmailGenerator.generateRandomEmail();
        actor.attemptsTo(
                SendKeys.of(email).into(LoginUI.email),
                SendKeys.of(password).into(LoginUI.password)
        );
    }

    public static CreateTask createTask(String password){
        return Tasks.instrumented(CreateTask.class, password);
    }
}
