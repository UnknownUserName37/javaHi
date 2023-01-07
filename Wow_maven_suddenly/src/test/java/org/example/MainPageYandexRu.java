package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageYandexRu {
    public static int max;
    private static int sergo;
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

    @FindBy(xpath = "//div[contains(@class, 'login-content__yaButton')]/a")
    private WebElement enterToAuthButtonYandexRu;
    public void clickForChooseAuthMeth() {
        enterToAuthButtonYandexRu.click();
    }
}