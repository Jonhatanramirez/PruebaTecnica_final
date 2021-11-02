package test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import org.openqa.selenium.WebElement;




public class TestCargapag {

    //variables
    WebDriver driver;
    String PATH_DRIVER = "C:\\Users\\FliaRG\\Downloads\\PruebaTecnica\\src\\test\\resources\\driver\\chromedriver.exe";
    String TYPE_DRIVER = "webdriver.chrome.driver";
    String URL="http://automationpractice.com/";
    HomePage home;
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
        home = new HomePage(driver);


        /*driver.manage().window().maximize();*/

        if (actualResult.contentEquals(URL)){

            System.out.println("ingreso corrrecto sitio = resultado exitoso ");
        }


        else {System.out.println("No ingreso al sitio deseado = resultado no exitoso");}

        JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }






}
