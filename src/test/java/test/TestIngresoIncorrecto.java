package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;
import pages.IngresoIncorrectopag;




public class TestIngresoIncorrecto {
    WebDriver driver;
    String PATH_DRIVER = "C:\\Users\\FliaRG\\Downloads\\PruebaTecnica\\src\\test\\resources\\driver\\chromedriver.exe";
    String TYPE_DRIVER = "webdriver.chrome.driver";
    String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    IngresoIncorrectopag registro;


    @Before

    public void seTup()
    {
        System.setProperty(TYPE_DRIVER,PATH_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

    }

    @Test

    public  void testCrearCuenta()
    {
        registro = new IngresoIncorrectopag(driver);
        registro.CrearRegistro("prueba0102@gmail.com");





        /*driver.manage().window().maximize();*/


    }



    }
