package starter.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class LoginUI extends PageObject {

    public static final Target notificacion = Target.the("Notificacion emergente")
            .located(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));

    public static final Target FRAME = Target.the("Frame de notificación emergente")
            .located(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.android.permissioncontroller:id/grant_dialog\"]"));

    public static final Target registrate = Target.the("Boton de registrate")
            .located(By.xpath("(//android.widget.TextView[@index='1' and @class='android.widget.TextView'])[2]"));

    public static final Target email = Target.the("Correo electronico")
            .located(By.xpath("(//android.widget.EditText[@index='0' and @class='android.widget.EditText'])[1]"));

    public static final Target password = Target.the("Contrasena")
            .located(By.xpath("(//android.widget.EditText[@index='0' and @class='android.widget.EditText'])[2]"));

    public static final Target signUp = Target.the("Boton de creacion")
            .located(AppiumBy.accessibilityId("Crear cuenta"));

    public static final Target signIn = Target.the("Boton de inicio de sesion")
            .located(By.xpath("(//android.widget.TextView[@index='0' and @class='android.widget.TextView'])[2]"));
}
