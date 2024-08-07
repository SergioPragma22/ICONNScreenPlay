package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.tasks.CreateTask;
import starter.tasks.LoginTask;
import starter.tasks.SignUpTask;
import starter.tasks.OpenAppTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LogInStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;
    Actor user = Actor.named("User");

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
        user.can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Given("Ingresa a la app y selecciona registrate")
    public void ingresaALaApp() {
        user.attemptsTo(
                OpenAppTask.Open()
        );
    }

    @When("ingresa los datos email aleatorio y password {string}")
    public void ingresaLosDatosEmailYPassword(String password) {
        user.attemptsTo(
                CreateTask.createTask(password)
        );
    }

    @Then("el usuario nuevo ingresa a Sevenly")
    public void elUsuarioNuevoIngresaASevenly() {
        user.attemptsTo(
                SignUpTask.Open()
        );
    }

    @Given("Ingresa a la app e ingresa sus credenciales")
    public void ingresaALaAppEIngresaSusCredenciales() {
        user.attemptsTo(
                new LoginTask()
        );
    }

    @Then("el usuario ingresa a Sevenly")
    public void elUsuarioIngresaASevenly() {
        System.out.println("Ingreso exitoso");
    }
}
