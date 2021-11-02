package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    //variables
    private By txtuser = By.name("userName");
    private By txtPass = By.name("password");
    private By btnLogin = By.name("submit");
    private By txtMensajeError = By.xpath("//span");
    private WebDriver driver;

    //constructor

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
//implementacion

    public void iniciarSesion (String user, String pass)
    {
        ///buscar el elemento e insertar texto
        driver.findElement(txtuser).sendKeys(user);
        driver.findElement(txtPass).sendKeys(pass);
        //boton
        driver.findElement(btnLogin).click();

        }

        public String getMensajeError()
        {
            return driver.findElement(txtMensajeError).getText();
        }
}
