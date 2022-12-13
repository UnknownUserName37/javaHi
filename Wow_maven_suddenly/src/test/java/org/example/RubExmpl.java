package org.example;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    }

    @AfterClass
    public static void tearsDown() {
        driver.quit();
    }

    @Test
    public void authYaRu() {
        yandexMainPage.clickToGoOnYaAuthFields();
        yandexLoginPageAuth.enterLogin();
        yandexLoginPageAuth.signInYaButton();
        mailPageMain.goToMailAuthFieldsButton();
        mailLoginPageAuth.enterLoginFields();
        mailLoginPageAuth.clickToNavigatePasswordEnterFields();
        mailLoginPageAuth.enterMailPassword();
        mailLoginPageAuth.clickSignInMailRu();
        mailLoginPageAuth.goToMessageWithSecretCode();
        mailLoginPageAuth.getSecretCodeFromMessage();

    }

}

