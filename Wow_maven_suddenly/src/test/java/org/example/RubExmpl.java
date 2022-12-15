package org.example;
import org.checkerframework.checker.units.qual.K;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class RubExmpl {
    /**
     * осуществление первоначальной настройки
     */

    public static MailLoginPageAuth mailLoginPageAuth;
    public static YandexLoginPageAuth yandexLoginPageAuth;
    public static MailPageMain mailPageMain;
    public static YandexMainPage yandexMainPage;
    public static WebDriver driver;
    public static ArrayList<String> tabs2;

    @BeforeClass @Deprecated
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        mailLoginPageAuth = new MailLoginPageAuth(driver);
        yandexLoginPageAuth = new YandexLoginPageAuth(driver);
        mailPageMain = new MailPageMain(driver);
        yandexMainPage = new YandexMainPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(ConfProperties.getProperty("loginPage"));

        JavascriptExecutor jscript = (JavascriptExecutor) driver;
        jscript.executeScript("window.open('https://mail.ru');");

        tabs2 = new ArrayList<String> (driver.getWindowHandles());

    }



    @Test @Deprecated
    public void authYaRu() {
        yandexMainPage.accessLoginEnterButton();
        yandexLoginPageAuth.enterLogin();
        yandexLoginPageAuth.signInYaButton();

        driver.switchTo().window(tabs2.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mailPageMain.goToMailAuthFieldsButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mailLoginPageAuth.enterLoginFields();
        mailLoginPageAuth.clickToNavigatePasswordEnterFields();
        mailLoginPageAuth.enterMailPassword();
        mailLoginPageAuth.clickSignInMailRu();
        mailLoginPageAuth.goToMessageWithSecretCode();
        mailLoginPageAuth.getSecretCodeFromMessage();
        driver.switchTo().window(tabs2.get(0));

    }

    @AfterClass
    public static void tearsDown() {
        // driver.quit();
    }

}

