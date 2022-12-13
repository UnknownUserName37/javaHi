package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMailWebElements {

    public WebDriver driver;
    public MainMailWebElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Mail_ru Locator
    @FindBy(xpath = "//button[contains(@class, 'resplash-btn')]")
    private WebElement mailRuAuthButton;
    public void goToMailAuthFieldsButton() { mailRuAuthButton.click(); }

    @FindBy(xpath = "//input[contains(@name, 'username')]")
    private WebElement authEnterMailFields;
    public void enterLoginFields() {
        authEnterMailFields.sendKeys(ConfProperties.getProperty("loginMailRu"));
    }

    @FindBy(xpath = "//button[contains(@data-test-id, 'next-button')]")
    private WebElement enterPswrdButton;
    public void clickToNavigatePasswordEnterFields() {
        enterPswrdButton.click();
    }

    @FindBy(xpath = "//input[@name= 'password']")
    private WebElement passerdEnterFields;
    public void enterMailPassword() {
        passerdEnterFields.sendKeys(ConfProperties.getProperty("passwrdMailRu"));
    }

    @FindBy(xpath = "//span[text()= 'Sign in']")
    private WebElement signInMailRuButton;
    public void clickSignInMailRu() {
        signInMailRuButton.click();
        }

    @FindBy(xpath = "//span[contains(text(), 'break-dance')]")
    private WebElement neededMassageWithCodeFromMailBox;

    public void goToMessageWithSecretCode() {
        neededMassageWithCodeFromMailBox.click();
    }

    @FindBy(xpath = "//td[@style= 'padding: 0 30px 30px;']/descendant::b[2]")
    private WebElement getCodeFromMailRuMassage;
    public String getSecretCodeFromMessage() {
        return getCodeFromMailRuMassage.getText();
    }
}
