package co.com.choucair.certification.retoutest.tasks;

import co.com.choucair.certification.retoutest.userinterface.GoToPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo implements Task {


    public static GoTo theForm() {

        return Tasks.instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(GoToPage.JOIN_TODAY)
        );

    }
}
