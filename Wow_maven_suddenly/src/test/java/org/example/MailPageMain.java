package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPageMain {

    public WebDriver driver;
    public MailPageMain(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Mail_ru Locator
    @FindBy(xpath = "//button[contains(@class, 'resplash-btn')]")
    private WebElement mailRuAuthButton;
    public void goToMailAuthFieldsButton() { mailRuAuthButton.click(); }
}
