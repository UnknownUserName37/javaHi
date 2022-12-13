package org.example;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexMainPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public YandexMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Yandex_ru Locator
    @FindBy(xpath = "//a[contains(@class, 'home-link2_color_black')]")
    private WebElement enterInYandexAuthFieldsButton; // = driver.findElement(By.xpath("//a[contains(@class, 'home-link2_color_black')]"));
    public void clickToGoOnYaAuthFields() {
        enterInYandexAuthFieldsButton.click();
    }

}
