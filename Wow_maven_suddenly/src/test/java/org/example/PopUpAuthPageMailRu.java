package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUpAuthPageMailRu {

    public WebDriver driver;
    public PopUpAuthPageMailRu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //SupposedFrame
    @FindBy(xpath = "//iframe[@class='ag-popup__frame__layout__iframe']")
    private WebElement modPop;
    public void swithToThisCqweqwsdfsddsgf() {
        driver.switchTo().frame(modPop);
    }

    @FindBy(xpath = "//input[contains(@name, 'username')]")
    private WebElement authEnterMailFields;
    public void inputLoginFields() {
        authEnterMailFields.sendKeys(ConfProperties.getProperty("loginMailRu"));
    }

    @FindBy(xpath = "//button[contains(@data-test-id, 'next-button')]")
    private WebElement enterPswrdButton;
    public void clickToGoPasswordInputFields() {
        enterPswrdButton.click();
    }

    @FindBy(xpath = "//input[@name= 'password']")
    private WebElement passerdEnterFields;
    public void inputMailPassword() {
        passerdEnterFields.sendKeys(ConfProperties.getProperty("passwrdMailRu"));
    }

    @FindBy(xpath = "//span[contains(@class, 'innerTextWrapper')]")
    private WebElement signInMailRuButton;
    public void clickSignInMailRu() {
        signInMailRuButton.click();
        driver.switchTo().defaultContent();
    }
}
