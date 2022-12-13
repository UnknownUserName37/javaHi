package org.example;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainYandexWebElements {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */

    public WebDriver driver;

    public MainYandexWebElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Yandex_ru Locator
    @FindBy(xpath = "//span[@class='zen-ui-button-text__text']")
    private WebElement enterInYandexAuthFieldsButton;
    public void clickToGoOnYaAuthFields() {
        enterInYandexAuthFieldsButton.click();
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
    public void enterLogin() {
        loginYandexFieldEnter.sendKeys(ConfProperties.getProperty("loginMailRu"));
    }

    @FindBy(xpath = "//div[contains(@class, 'sign-in-button')]")
    private WebElement signInYandexButton;
    public void signInYaButton() {
        signInYandexButton.click();
    }
}
