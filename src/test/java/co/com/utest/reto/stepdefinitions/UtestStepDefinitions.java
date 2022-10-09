package co.com.utest.reto.stepdefinitions;

import co.com.utest.reto.model.Utest_Data;
import co.com.utest.reto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Ivonne wants to register on the Utest page$")
    public void ivonneWantsToRegisterOnTheUtestPage() throws Exception  {
      theActorCalled("Ivonne").wasAbleTo(AbriPaginaUtest.laPagina());

    }


    @When("^enter all required information$")
    public void enterAllRequiredInformation(List<Utest_Data> datos) throws Exception  {
        theActorInTheSpotlight().attemptsTo(LLenarPaginaInfoPersonal.laPagina(datos), LLenarPaginaDireccion.laPagina(datos),
                LLenarPaginaDispositivos.laPagina8(datos), LLenarPaginaFinal.laPagina(datos)
        );

    }

    @Then("^registration is completed successfully$")
    public void registrationIsCompletedSuccessfully() throws Exception  {

    }
}
