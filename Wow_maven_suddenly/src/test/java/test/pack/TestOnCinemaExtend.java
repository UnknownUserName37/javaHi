package test.pack;

import com.google.j2objc.annotations.Weak;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOnCinemaExtend {
    WebDriver driver;

    @Before
    public void  setUP() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kaban\\IdeaProjects\\Wow_maven_suddenly\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module05/practice1/");
    }

    @After
    public void tearsDown() {
        driver.close();
    }

    @Test
    public void testCinemaEnterPass() {
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passFields = driver.findElement(By.id("password"));
        WebElement repPassFields = driver.findElement(By.id("confirm_password"));
        WebElement submitBotton = driver.findElement(By.xpath("//*[contains(text(), 'Зарегистрироваться')]"));

        emailField.sendKeys("rekrekrek@rek.rek");
        passFields.sendKeys("11122233");
        repPassFields.sendKeys("1122233");
        submitBotton.click();


    }

}
