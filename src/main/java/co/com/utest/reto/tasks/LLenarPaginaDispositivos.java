package co.com.utest.reto.tasks;

import co.com.utest.reto.model.Utest_Data;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.utest.reto.userinterface.PaginaDispositivos.*;
import static org.openqa.selenium.Keys.*;

public class LLenarPaginaDispositivos implements Task {

    private List<Utest_Data> datos;

    public LLenarPaginaDispositivos(List<Utest_Data> datos) {
        this.datos = datos;
    }

    public static LLenarPaginaDispositivos laPagina8(List<Utest_Data> datos) {
        return Tasks.instrumented(LLenarPaginaDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTER_CONTAINER),
                Enter.theValue(datos.get(0).getStrComputer()).into(COMPUTER).thenHit(ARROW_DOWN, ENTER),
                Click.on(VERSION_CONTAINER),
                Enter.theValue(datos.get(0).getStrVersionComputer()).into(VERSION).thenHit(ARROW_DOWN, ENTER),
                Click.on(LENGUAGE_CONTAINER),
                Enter.theValue(datos.get(0).getStrLenguageComputer()).into(LENGUAGE).thenHit(ARROW_DOWN, ENTER),
                Click.on(MOBILE_CONTAINER),
                Enter.theValue(datos.get(0).getStrMobileDevice()).into(MOBILE).thenHit(ARROW_DOWN, ENTER),
                Click.on(MODEL_CONTAINER),
                Enter.theValue(datos.get(0).getStrDiviceModel()).into(MODEL).thenHit(ARROW_DOWN, ENTER),
                Click.on(OPSYSTEM_CONTAINER),
                Enter.theValue(datos.get(0).getStrOperatingSystem()).into(OPSYSTEM).thenHit(ARROW_DOWN, ENTER),
                Click.on(BUTTON_NEXT)

        );

    }
}
