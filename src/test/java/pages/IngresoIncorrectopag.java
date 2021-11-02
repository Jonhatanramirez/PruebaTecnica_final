package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class IngresoIncorrectopag {

    private WebDriver driver;
    private By btnLogin = By.linkText("Sign in");
    //private By txtCorreo = By.id("email_create");
    private By txtCorreo=By.xpath("//*[@id=\"email_create\"]");
    private By BtonCrearCuenta = By.xpath("//*[@id=\"SubmitLogin\"]/span");

    ///constructor


    public IngresoIncorrectopag(WebDriver driver)
    {
        this.driver = driver;
    }

    public void CrearRegistro (String correo) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(btnLogin).click();
        driver.findElement(txtCorreo).sendKeys("pepitoper@gmail.com");
        //driver.findElement(By.id("email")).sendKeys("casposo@gmail.com");
        driver.findElement(BtonCrearCuenta).click();
       // driver.findElement(btnLogin).click();
    }


}
