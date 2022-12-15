package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexLoginPageAuth {

    public WebDriver driver;
    public YandexLoginPageAuth(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
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
