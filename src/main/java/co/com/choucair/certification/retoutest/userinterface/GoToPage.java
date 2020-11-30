package co.com.choucair.certification.retoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoToPage {

    public static final Target JOIN_TODAY = Target.the("BUTTON JOIN TODAY").located(By.xpath("//a[contains (@class, 'unauthenticated-nav-bar__sign-up') and contains (text(),'Join Today')]"));
}
