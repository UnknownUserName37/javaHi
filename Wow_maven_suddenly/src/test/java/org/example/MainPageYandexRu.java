package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageYandexRu {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;

    public MainPageYandexRu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@type='button']")
    private WebElement loginEnterButton;
    public void buttonToGoEnterLoginField() {
        loginEnterButton.click();
    }

    @FindBy(xpath = "//div[contains(@class, 'Popup2')]")
    private WebElement swichToPopUpYandexAuth;
    @FindBy(xpath = "//div[@id='tooltip-0-1']/descendant::span[2]")
    private WebElement enterToAuthButtonYandexRu;
    public void clickForChooseAuthMeth() {
        enterToAuthButtonYandexRu.click();
    }
}