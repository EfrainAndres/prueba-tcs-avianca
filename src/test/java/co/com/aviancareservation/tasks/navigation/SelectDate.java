package co.com.aviancareservation.tasks.navigation;

import co.com.aviancareservation.elements.SelectOptions;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectDate {

    public static Performable date() {
        return Task.where("{0} especifica el dia en el cual desea viajar",
                Click.on(SelectOptions.CLIC_CALENDAR),
                Click.on(SelectOptions.SELECT_DATE)
        );
    }
}
