package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class YandexProfilePage_now_usless {
    private WebDriver driver;
    public YandexProfilePage_now_usless(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

}
