package org.example;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexWebElements {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */

    public WebDriver driver;

    public YandexWebElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Yandex_ru Locator
    @FindBy(xpath = "//span[@class='zen-ui-button-text__text']")
    private WebElement enterInYandexAuthFieldsButton;

    @FindBy(xpath = "//a[@class = 'CurrentAccount']")
    private WebElement selectorYandexAddNewAccount;

    @FindBy(xpath = "//span[@class = 'AddAccountButton-text']")
    private WebElement newYandexAccountButton;

    @FindBy(xpath = "//input[@id = 'passp-field-login']")
    private WebElement loginYandexFieldEnter;

    @FindBy(xpath = "//div[contains(@class, 'sign-in-button')]")
    private WebElement signInYandexButton;

    //Mail_ru Locator
    @FindBy(xpath = "//button[contains(@class, 'resplash-btn')]")
    private WebElement mailRuAuthButton;

    @FindBy(xpath = "//input[contains(@name, 'username')]")
    private WebElement authEnterMailFields;

    @FindBy(xpath = "//button[contains(@data-test-id, 'next-button')]")
    private WebElement enterPswrdButton;

    @FindBy(xpath = "//input[@name= 'password']")
    private WebElement passerdEnterFields;

    @FindBy(xpath = "//span[text()= 'Sign in']")
    private WebElement signInMailRuButton;

    @FindBy(xpath = "//span[contains(text(), 'break-dance')]")
    private WebElement neededMassageWithCodeFromMailBox;

    @FindBy(xpath = "//td[@style= 'padding: 0 30px 30px;']/descendant::b[2]")
    private WebElement getCodeFromMailRuMassage;
}