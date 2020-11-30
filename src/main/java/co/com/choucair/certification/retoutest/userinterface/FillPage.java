package co.com.choucair.certification.retoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillPage {

    public static final Target FIRST_NAME = Target.the("FIELD NAME").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("FIELD NAME").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("FIELD NAME").located(By.id("email"));
    public static final Target LIST_MONTH = Target.the("LIST MONTH").located(By.id("birthMonth"));
    public static final Target LIST_DAY = Target.the("LIST DAY").located(By.id("birthDay"));
    public static final Target LIST_YEAR = Target.the("LIST_YEAR").located(By.id("birthYear"));
    public static final Target NEXT_LOCATION = Target.the("Button Next Location").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target CITY_SPAN = Target.the("AUTODETECTED CITY").located(By.xpath("//span[contains (@ng-show, 'autoDetectAddress.city')]"));
    public static final Target CITY = Target.the("FIELD CITY ").located(By.name("city"));
    public static final Target LIST_CITY = Target.the("LIST_CITY").located(By.xpath("/html/body/div[2]/div[5]/span[2]/span"));

    public static final Target POSTAL_CODE = Target.the("FIELD POSTAL CODE").located(By.id("zip"));
    public static final Target LIST_COUNTRY = Target.the("LIST COUNTRY").located(By.name("countryId"));
    public static final Target SELECT_LIST_COUNTRY = Target.the("SELECT LIST COUNTRY").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DEVICES = Target.the("BUTTON_NEXT_DEVICES").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}

