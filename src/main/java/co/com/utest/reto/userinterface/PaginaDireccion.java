package co.com.utest.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDireccion {

    public static final Target CITY= Target.the("Campo para ciudad de usuario")
            .located(By.id("city"));
    public static final Target POSTAL_CODE= Target.the("Campo para codigopostal de usuario")
            .located(By.id("zip"));
    public static final Target COUNTRY_CONTAINER= Target.the("Campo contenedor de paises")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target COUNTRY= Target.the("Campo para pais de usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_NEXT = Target.the("Boton para ir a seccion de Dispositivos ")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
