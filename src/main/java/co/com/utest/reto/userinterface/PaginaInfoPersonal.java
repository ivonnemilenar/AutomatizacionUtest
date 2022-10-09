package co.com.utest.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInfoPersonal {

    public static final Target FIRSNAME = Target.the("Campo para nombre de usuario")
            .located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("Campo para apellido de usuario")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Campo para email de usuario")
            .located(By.id("email"));
    public static final Target BIRTHMONTH = Target.the("Campo para mes de nacimientos de usuario")
            .located(By.id("birthMonth"));
    public static final Target BIRTHDAY = Target.the("Campo para dia de nacimientos de usuario")
            .located(By.id("birthDay"));
    public static final Target BIRTHYEARD= Target.the("Campo para año de nacimientos de usuario")
            .located(By.id("birthYear"));
    public static final Target BUTTON_DIRECCION = Target.the("Boton para ir a seccion de Direccion ")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
