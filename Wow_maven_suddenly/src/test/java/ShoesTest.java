import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoesTest {

    public WebDriver driver;

    @Before
    public void setUP() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaban\\IdeaProjects\\Wow_maven_suddenly\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
    }

    @After
    public void tearDown() {

        driver.quit();
    }

    @Test
    public void negativeSizeShoes() {

        var sizeTab = driver.findElement(By.id("size"));
        var buttonConfirm = driver.findElement(By.tagName("button"));
        var size = "30";
        sizeTab.sendKeys(size);
        buttonConfirm.click();
            var sizeError = driver.findElement(By.xpath("//label[@class='error']"));
        var textSizeError = "В нашем магазине нет обуви вашего размера";
        Assert.assertEquals("Неверно введён размер обуви", textSizeError, sizeError.getText());

    }

    @Test
    public void positiveSizeTest() {

        var sizeTab = driver.findElement(By.id("size"));
        var buttonConfirm = driver.findElement(By.tagName("button"));
        var size = "40";
        sizeTab.sendKeys(size);
        buttonConfirm.click();
        var sizeError = driver.findElement(By.xpath("//label[@class='error']"));
        var textSizeError = "В нашем магазине есть обувь вашего размера";
        Assert.assertEquals("Ошибка при введении размера обуви", textSizeError, sizeError.getText());
    }

}

