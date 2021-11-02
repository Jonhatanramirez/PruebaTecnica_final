package pages;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Pagregistro
{
    private WebDriver driver;
    //variables info personal
    private By RadioBtn = By.id("id_gender2");
    private By RadioBtn2 = By.id("id_gender2");
    private By TxtNombre = By.id("customer_firstname");
    private By TxtApellido = By.id("customer_lastname");
    private By TxtEmail = By.id("email");
    private By txtpass = By.id("passwd");
    private By selecdays = By.id("days");
    private By selecmont = By.id("months");
    private By selecyears = By.id("years");

    //variables info empresa
    private By TxtFirts = By.id("firstname");
    private By Txtlast = By.id("lastname");
    private By txtCompani = By.id("company");
    private By TxtDireccion = By.id("address1");
    private By TxtCity = By.id("city");
    private By selecstate = By.id("id_state");
    private By txtPostcode = By.id("postcode");
    private By txtmobile = By.id("phone_mobile");
    private By txtAlias = By.id("alias");
    private By Btonregister = By.id("submitAccount");


/*
    // Se localiza el primer radio button por su id
    WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
    // Se localiza el segundo radio button por su id
    WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
//Seleccionar el primer radio button
radio1.click();
//El radio button 1 es deseleccionado y el segundo es seleccionado
radio2.click();
*/

    //constructor

    public Pagregistro (WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // driver.findElement(btnLogin).click();
    }
//implementacion

/*
    public void Crearcuenta(String emailregistro) {

        driver.findElement(txtEmailAddres).sendKeys(emailregistro);
        driver.findElement(BtonCrearcuenta).click();
    }
*/
    public void Registro(String Nombre, String Apellido, String Email, String pass, String Empresa,
                         String EmpresaApellido, String company, String Direccion, String Ciudad,
                         String CodigoP, String mobile) {
        ///buscar el elemento e insertar texto


        driver.findElement(TxtNombre).sendKeys(Nombre);
        driver.findElement(TxtApellido).sendKeys(Apellido);
        driver.findElement(TxtEmail).sendKeys(Email);
        driver.findElement(txtpass).sendKeys(pass);
        driver.findElement(selecdays).isSelected();
        driver.findElement(selecmont).isSelected();
        driver.findElement(selecyears).isSelected();


        driver.findElement(Btonregister).click();
    }
}


