import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BookShopAdvanture {

    public WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaban\\IdeaProjects\\Wow_maven_suddenly\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://qajava.skillbox.ru/index.html");
    }

    @After
    public void tearsDown() {

        driver.quit();
    }

    @Test
    public void findElementsTest() {

        var feedback = driver.findElement(By.xpath("//footer[@id='footer']/descendant::a"));
        var preOrder = driver.findElement(By.xpath("//footer[@id='footer']/descendant::a[2]"));
        var firstBookBoxButton = driver.findElement(By.xpath("//*[@class='content-item']/descendant::button"));
        var countItemInBox = driver.findElement(By.xpath("//span[@id='cart_count']"));
        var genresOfBooks = driver.findElement(By.xpath("//li[@id='genres']"));
        var searchInputLine = driver.findElement(By.xpath("//input[@id='search-input']"));

    }

    @Test
    public void searchBookAndCount() {

        List<WebElement> noteCounter = driver.findElements(By.xpath("//div[@class='book-info']"));
        Assert.assertEquals("Ошибка при сравнении количества книг", 1, noteCounter.size());

    }
}
