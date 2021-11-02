package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;


public class TestLogin {

    //variables
     WebDriver driver;
    String PATH_DRIVER = "C:\\Users\\FliaRG\\Downloads\\PruebaTecnica\\src\\test\\resources\\driver\\chromedriver.exe";
    String TYPE_DRIVER = "webdriver.chrome.driver";
    String URL="http://demo-guru99.com/test/newtours/";
    LoginPage loging;
    HomePage home;

      @Before

    public void seTup()
      {
          System.setProperty(TYPE_DRIVER,PATH_DRIVER);
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get(URL);
          loging=new LoginPage(driver);

      }

      @Test
    public  void testLogin()
      {
          loging.iniciarSesion("prueba0102@gmail.com","prueba0102");
          //verificacion
          home =new HomePage (driver);

/*
        Assert.assertEquals("login successfully", home.getMensajeExito());
*/
      }





}
