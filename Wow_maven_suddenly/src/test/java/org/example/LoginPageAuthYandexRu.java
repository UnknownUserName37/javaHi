package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAuthYandexRu {

    public WebDriver driver;

    public static AuthPageInsideBoxMailRu authPageInsideBoxMailRu;
    public static RubExmplGoToRegMailDomenOnYandexService pageObject;

    public LoginPageAuthYandexRu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        pageObject = new RubExmplGoToRegMailDomenOnYandexService();
        authPageInsideBoxMailRu = new AuthPageInsideBoxMailRu(driver);
    }

    @FindBy(xpath = "//a[@class = 'CurrentAccount']")
    private WebElement selectorYandexAddNewAccount;
    public void selectNewAccOnYaRu() {
        selectorYandexAddNewAccount.click();
    }

    @FindBy(xpath = "//span[@class = 'AddAccountButton-text']")
    private WebElement newYandexAccountButton;
    public void addNewYaAccount() {
        newYandexAccountButton.click();
    }

    @FindBy(xpath = "//input[@id = 'passp-field-login']")
    private WebElement loginYandexFieldEnter;
    public void inputLogin() {
        loginYandexFieldEnter.sendKeys(ConfProperties.getProperty("loginMailRu"));
    }

    @FindBy(xpath = "//div[contains(@class, 'sign-in-button')]")
    private WebElement signInYandexButton;
    public void signInButton() {
        signInYandexButton.click();
        driver.switchTo().window(RubExmplGoToRegMailDomenOnYandexService.mailTab);
    }

    @FindBy(xpath = "//span[contains(@class, 'Button2-Text')]")
    private WebElement submitYandexSecretButton;

    @FindBy(xpath = "//div[contains(@class, 'CodeField')]")
    private WebElement enterSecretYandexField;
    public void inputSecretMailCodeInYandexFinishTest() {
        driver.switchTo().window(RubExmplGoToRegMailDomenOnYandexService.yandexTab);
        enterSecretYandexField.sendKeys(authPageInsideBoxMailRu.getSecretCodeFromMessage());
        submitYandexSecretButton.click();
    }
}