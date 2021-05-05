package co.com.aviancareservation.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import co.com.aviancareservation.elements.SelectOptions;

public class SearchForCity {

    public static Performable since(String term) {
        return Task.where("{0} busca la ciudad desde donde viaja",
                Clear.field(SelectOptions.CLIC_SINCE),
                Enter.theValue(term).into(SelectOptions.CLIC_SINCE)
                        .thenHit(Keys.DOWN)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable until(String term) {
        return Task.where("{0} busca la ciudad hasta donde viaja",
                Clear.field(SelectOptions.CLIC_UNTIL),
                Enter.theValue(term).into(SelectOptions.CLIC_UNTIL)
                        .thenHit(Keys.DOWN)
                        .thenHit(Keys.ENTER)
        );
    }
}
