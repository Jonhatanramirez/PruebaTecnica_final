package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {

    //variables
    private WebDriver driver;
    /*private By btnLogin = By.linkText("Sign in");*/


    ///constructor

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(btnLogin).click();/*
    }

    }






