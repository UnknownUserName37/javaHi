package org.example;
import org.checkerframework.checker.units.qual.K;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
    public static String mailTab;
    public static String yandexTab;
    public static String popMailTab;
//    public static String getFrame = mailLoginPageAuth.getSecretCodeFromMessage();

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
        yandexTab = driver.getWindowHandle();

        JavascriptExecutor jscript = (JavascriptExecutor) driver;
        jscript.executeScript("window.open('https://mail.ru');", driver.getWindowHandles());
//        jscript.executeScript("window.open('https://mail.ru');", driver.getWindowHandles());
//        driver.switchTo().newWindow(WindowType.TAB).navigate().to(ConfProperties.getProperty("mailRuPage"));

        mailTab = null;
        popMailTab = null;

        Set <String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();

        while (iterator.hasNext()) {
//            popMailTab = iterator.next();
            mailTab = iterator.next();
}

    }

    @Test @Deprecated
    public void authYaRu() throws InterruptedException {
        yandexMainPage.accessLoginEnterButton();
        yandexLoginPageAuth.enterLogin();
        yandexLoginPageAuth.signInYaButton();

        driver.switchTo().window(mailTab);
        mailPageMain.goToMailAuthFieldsButton();

        Thread.sleep(10000);
//        driver.switchTo().window(popMailTab);
        driver.switchTo().activeElement();
        mailLoginPageAuth.enterLoginFields();
        mailLoginPageAuth.clickToNavigatePasswordEnterFields();
        mailLoginPageAuth.enterMailPassword();
        mailLoginPageAuth.clickSignInMailRu();
        mailLoginPageAuth.goToMessageWithSecretCode();
        mailLoginPageAuth.getSecretCodeFromMessage();

        driver.switchTo().window(yandexTab);
    }

    @AfterClass
    public static void tearsDown() {
        driver.quit();

    }

}

