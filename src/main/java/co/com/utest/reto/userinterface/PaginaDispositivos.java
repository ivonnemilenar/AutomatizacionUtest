package co.com.utest.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDispositivos {

    public static final Target COMPUTER_CONTAINER= Target.the("Contenedor para computador")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div"));
    public static final Target COMPUTER= Target.the("Campo para computador")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target VERSION_CONTAINER= Target.the("Contenedor para version del computador")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div"));
    public static final Target VERSION= Target.the("Campo para version del computador")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target LENGUAGE_CONTAINER= Target.the("Contenedor para lenguage")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target LENGUAGE= Target.the("Campo para el lenguage")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target MOBILE_CONTAINER= Target.the("Contenedor para dispositivo mobil")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div"));
    public static final Target MOBILE= Target.the("Campo para dispositivo mobil")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target MODEL_CONTAINER= Target.the("Contenedor para el modelo del dispositivo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div"));
    public static final Target MODEL= Target.the("Campo para modelo del dispostivo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target OPSYSTEM_CONTAINER= Target.the("Contenedor para sistema operativo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div"));
    public static final Target OPSYSTEM= Target.the("Campo para sistema operativo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_NEXT = Target.the("Boton para ir a seccion final ")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
