package co.com.aviancareservation.stepdefinitions;

import co.com.aviancareservation.tasks.navigation.NavigateTo;
import co.com.aviancareservation.tasks.navigation.PeopleToTravel;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.aviancareservation.tasks.navigation.SelectDate;
import co.com.aviancareservation.tasks.navigation.SearchForCity;
import co.com.aviancareservation.elements.SearchResult;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateReservationStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} ingresa a la pagina de avianca {string}")
    public void efrainIngresaALaPaginaDeAvianca(String actor, String url) {
        theActorCalled(actor).attemptsTo(NavigateTo.theAviancaHomePage(url));
    }

    @When("el va a la seccion de Reserva tu vuelo y selecciona {string}")
    public void elVaALaSeccionDeReservaTuVueloYSelecciona(String arg0) {
        withCurrentActor(
                NavigateTo.reservationTab()
        );
    }

    @Then("el selecciona el origen del vuelo {string}")
    public void elSeleccionaElOrigenDelVuelo(String origen) {
        withCurrentActor(
                SearchForCity.since(origen)
        );
    }

    @And("el selecciona el destino del vuelo {string}")
    public void elSeleccionaElDestinoDelVuelo(String destino) {
        withCurrentActor(
                SearchForCity.until(destino)
        );
    }

    @And("el selecciona la fecha del dia actual")
    public void elSeleccionaLaFechaDelDiaActual() {
        withCurrentActor(
                SelectDate.date()
        );
    }

    @And("el selecciona que viajara {int} Adultos, {int} Nino y {int} Bebe")
    public void enElCampoComoViajasElSeleccioneAdultosNinoYBebe(int adulto, int nino, int bebe) {
        PeopleToTravel.numberOfPeople(adulto, nino, bebe);
    }

    @When("el da clic en el boton {string}")
    public void elDaClicEnElBoton(String arg0) throws InterruptedException {
        withCurrentActor(
            NavigateTo.searchFlights()
        );
    }

    @Then("el debe visualizar la seleccion de la tarifa")
    public void elDebeVisualizarLaSeleccionDeLaTarifa() {
        withCurrentActor(
            WaitUntil.the(SearchResult.LABEL_RATE, isVisible()).forNoMoreThan(15).seconds()
        );
    }
}
