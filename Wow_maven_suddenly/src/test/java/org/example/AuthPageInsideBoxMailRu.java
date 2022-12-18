package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AuthPageInsideBoxMailRu {

        public WebDriver driver;
        public AuthPageInsideBoxMailRu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[contains(@class, 'sp__normal')]")
    private WebElement neededMassageWithCodeFromMailBox;
    public void goToMessageWithSecretCode() throws InterruptedException{
        neededMassageWithCodeFromMailBox.click();
    }

    @FindBy(xpath = "//iframe[contains(@class, 'download-frame')]")
    private WebElement secretFrame;
    @FindBy(xpath = "//td[contains(@style, 'padding')]/descendant::b[2]")
    private WebElement getCodeFromMailRuMassage;
    public String getSecretCodeFromMessage() {
        driver.switchTo().frame(secretFrame);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return getCodeFromMailRuMassage.getText();
    }
}
