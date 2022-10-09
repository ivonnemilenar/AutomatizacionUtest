package co.com.utest.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinal {

    public static final Target PASSWORD= Target.the("Campo para contraseña de usuario")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD= Target.the("Campo para confirmar contraseña de usuario")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_ONE= Target.the("Campo checkbox uno")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_TWO= Target.the("Campo checkbox dos")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_THREE= Target.the("Campo checkbox tres")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_FINAL= Target.the("Boton para completar la configuración  ")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));
}
