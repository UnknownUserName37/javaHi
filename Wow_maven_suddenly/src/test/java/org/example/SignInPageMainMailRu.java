package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageMainMailRu {

    public WebDriver driver;
    public SignInPageMainMailRu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[contains(@class, 'resplash-btn')]")
    private WebElement mailRuGoToAuthButton;
    public void goToMailAuthFieldsButton() {
        mailRuGoToAuthButton.click(); }
}
