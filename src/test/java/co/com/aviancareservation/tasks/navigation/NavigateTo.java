package co.com.aviancareservation.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import co.com.aviancareservation.elements.SelectOptions;

public class NavigateTo {
    public static Performable theAviancaHomePage(String url) {
        return Task.where("{0} opens the " + url +" home page",
                Open.url(url)
        );
    }

    public static Performable reservationTab() {
        return Task.where("{0} navega por el tab de solo vuelo de ida",
                Click.on(SelectOptions.CLIC_TAB),
                Click.on(SelectOptions.CLIC_ONE_WAY)
        );
    }

    public static Performable searchFlights() {
        return Task.where("{0} interactua con el boton de buscar vuelos",
                Click.on(SelectOptions.CLIC_BUTTON)
        );
    }
}