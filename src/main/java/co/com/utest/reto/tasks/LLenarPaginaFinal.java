package co.com.utest.reto.tasks;

import co.com.utest.reto.model.Utest_Data;
import co.com.utest.reto.userinterface.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.utest.reto.userinterface.PaginaFinal.*;

public class LLenarPaginaFinal implements Task {

    private List<Utest_Data> datos;

    public LLenarPaginaFinal(List<Utest_Data> datos) {
        this.datos = datos;
    }

    public static LLenarPaginaFinal laPagina(List<Utest_Data> datos) {
        return Tasks.instrumented(LLenarPaginaFinal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(datos.get(0).getStrPassword()).into(CONFIRM_PASSWORD),
                Click.on(CHECKBOX_ONE),
                Click.on(CHECKBOX_TWO),
                Click.on(CHECKBOX_THREE),
                Click.on(BUTTON_FINAL)
        );

    }
}
