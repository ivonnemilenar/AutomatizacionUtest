package co.com.utest.reto.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/")
public class PaginaUtest extends PageObject {

    public static final Target BUTTON_JOIN = Target.the("Boton para iniciar registro de usuario")
            .located(By.xpath("//a[@class=\"unauthenticated-nav-bar__sign-up\"]"));
}
