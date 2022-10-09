package co.com.utest.reto.tasks;

import co.com.utest.reto.model.Utest_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.utest.reto.userinterface.PaginaInfoPersonal.*;

public class LLenarPaginaInfoPersonal implements Task {

    private List<Utest_Data> datos;

    public LLenarPaginaInfoPersonal(List<Utest_Data> datos) {
        this.datos = datos;
    }

    public static LLenarPaginaInfoPersonal laPagina(List<Utest_Data> datos) {
        return Tasks.instrumented(LLenarPaginaInfoPersonal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datos.get(0).getStrFirsName()).into(FIRSNAME),
                Enter.theValue(datos.get(0).getStrLastName()).into(LASTNAME),
                Enter.theValue(datos.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(datos.get(0).getStrBirthMonth()).from(BIRTHMONTH),
                SelectFromOptions.byVisibleText(datos.get(0).getStrBirthDay()).from(BIRTHDAY),
                SelectFromOptions.byVisibleText(datos.get(0).getStrBirthYeard()).from(BIRTHYEARD),
                Click.on(BUTTON_DIRECCION)

                );

    }
}
