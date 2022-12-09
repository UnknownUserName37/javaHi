import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OneMoreCinema {

    public WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaban\\IdeaProjects\\Wow_maven_suddenly\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearsDown() {

        driver.quit();

    }

    @Test
    public void enterFilmsAndSerials() {

        var filmTextEnter = "Сила воли";
        var serialTextEnter = "Flash";
        var filmFieldInput = driver.findElement(By.name("films"));
        var serialFieldInput = driver.findElement(By.id("serials"));
        var saveButton = driver.findElement(By.className("section__button"));
        var swapPageButton1 = driver.findElement(By.id("one"));
        var swapPageButton2 = driver.findElement(By.xpath("//input[@id='two']"));
        var buttonOk = driver.findElement(By.id("ok"));
        var bestFilmsResText = driver.findElement(By.id("best_films"));
        var bestSerialsResText = driver.findElement(By.id("best_serials"));

        filmFieldInput.sendKeys(filmTextEnter);
        serialFieldInput.sendKeys(serialTextEnter);
        saveButton.click();
        swapPageButton2.click();
        saveButton.click();
        buttonOk.click();
        Assert.assertEquals("Ошибка сравнения введённого фильма", filmTextEnter, bestFilmsResText.getText());
        Assert.assertEquals("Ошибка сравнения любимого сериала", serialTextEnter, bestSerialsResText.getText());
    }
}
