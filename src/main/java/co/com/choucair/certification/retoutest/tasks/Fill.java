package co.com.choucair.certification.retoutest.tasks;

import co.com.choucair.certification.retoutest.model.User;
import co.com.choucair.certification.retoutest.userinterface.FillPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Fill  implements Task {

    private User user;

    public Fill(User user) {
        this.user = user;
    }

    public static Fill theForm(User user) {

        return Tasks.instrumented(Fill.class,user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

        Enter.theValue(user.getFirstName()).into(FillPage.FIRST_NAME),
        Enter.theValue(user.getLastName()).into(FillPage.LAST_NAME),
        Enter.theValue(user.getEmail()).into(FillPage.EMAIL),
        SelectFromOptions.byVisibleText(user.getDateOfBirth().split("-")[0]).from(FillPage.LIST_MONTH),
        SelectFromOptions.byVisibleText(user.getDateOfBirth().split("-")[1]).from(FillPage.LIST_DAY),
        SelectFromOptions.byVisibleText(user.getDateOfBirth().split("-")[2]).from(FillPage.LIST_YEAR),
        Click.on(FillPage.NEXT_LOCATION),

        WaitUntil.the(FillPage.CITY_SPAN, WebElementStateMatchers.isVisible()),
        Clear.field(FillPage.CITY),
        Enter.theValue(user.getCity()).into(FillPage.CITY),
        Click.on(FillPage.LIST_CITY),

        Enter.theValue(user.getPostalCode()).into(FillPage.POSTAL_CODE),
        Click.on(FillPage.LIST_COUNTRY),
        Enter.theValue(user.getCountry()).into(FillPage.SELECT_LIST_COUNTRY),
        Click.on(FillPage.NEXT_DEVICES)





         );



    }
}
