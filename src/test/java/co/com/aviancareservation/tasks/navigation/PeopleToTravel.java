package co.com.aviancareservation.tasks.navigation;

import net.serenitybdd.screenplay.actions.Click;
import co.com.aviancareservation.elements.SelectOptions;

import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class PeopleToTravel {
    public static void numberOfPeople(int adulto, int nino, int bebe) {
        withCurrentActor(
                Click.on(SelectOptions.CLIC_PASSENGER)
        );

        for (int i = 0; i < adulto; i++) {
            withCurrentActor(
                    Click.on(SelectOptions.SELECT_ADULTS)
            );
        }

        for (int i = 0; i < nino; i++) {
            withCurrentActor(
                    Click.on(SelectOptions.SELECT_KIDS)
            );
        }

        for (int i = 0; i < bebe; i++) {
            withCurrentActor(
                    Click.on(SelectOptions.SELECT_BABIES)
            );
        }
    }
}
