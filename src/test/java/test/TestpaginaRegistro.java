package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Pagregistro;
public class TestpaginaRegistro {

    WebDriver driver;
    String PATH_DRIVER = "C:\\Users\\FliaRG\\Downloads\\PruebaTecnica\\src\\test\\resources\\driver\\chromedriver.exe";
    String TYPE_DRIVER = "webdriver.chrome.driver";
    String URL="http://automationpractice.com/index.php?controller=authentication&back=my-account";
    Pagregistro Pagregistro;
    String actualResult=URL;


    @Before

    public void seTup()
    {
        System.setProperty(TYPE_DRIVER,PATH_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

    }

    @Test


    public  void testCargaPagina()
    {
        Pagregistro = new Pagregistro(driver);


        /*driver.manage().window().maximize();*/

        if (actualResult.contentEquals(URL)){

            System.out.println("ingreso corrrecto sitio = resultado exitoso ");
        }


        else {System.out.println("No ingreso al sitio deseado = resultado no exitoso");}



    }





}
