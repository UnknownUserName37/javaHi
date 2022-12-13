package org.example;
import org.checkerframework.checker.units.qual.C;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class RubExmpl {
    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public void setUp() {
        System.setProperty("chromedriver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(ConfProperties.getProperty("loginPage"));
    }

    @AfterClass
    public void tearsDown() {
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }

    @Test
    public void goToAuthYa() {
AuthLoginMailPage.a
        enterMailPassword
    }

}

