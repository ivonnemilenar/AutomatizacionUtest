package co.com.utest.reto.tasks;

import co.com.utest.reto.userinterface.PaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class AbriPaginaUtest implements Task {

    private PaginaUtest paginaUtest;

    public static AbriPaginaUtest laPagina() {
        return Tasks.instrumented(AbriPaginaUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaUtest),
                Click.on(PaginaUtest.BUTTON_JOIN));

    }
}
