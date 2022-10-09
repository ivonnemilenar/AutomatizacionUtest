package co.com.utest.reto.tasks;

import co.com.utest.reto.model.Utest_Data;
import co.com.utest.reto.userinterface.PaginaDireccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import javax.swing.event.CaretListener;
import java.util.List;

import static co.com.utest.reto.userinterface.PaginaDireccion.*;

public class LLenarPaginaDireccion implements Task {

    private List<Utest_Data> datos;

    public LLenarPaginaDireccion(List<Utest_Data> datos) {
        this.datos = datos;
    }

    public static LLenarPaginaDireccion laPagina(List<Utest_Data> datos) {

        return Tasks.instrumented(LLenarPaginaDireccion.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(datos.get(0).getStrPostalCode()).into(POSTAL_CODE),
                Click.on(COUNTRY_CONTAINER),
                Enter.theValue(datos.get(0).getStrCountry()).into(COUNTRY),
                Click.on(BUTTON_NEXT)
                );
        
    }
}
