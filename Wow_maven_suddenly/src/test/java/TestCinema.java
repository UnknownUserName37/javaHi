import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCinema {

    public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Kaban\\IdeaProjects\\Wow_maven_suddenly\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module06/register/");

    }

    @After
    public void tearsDown() {
        driver.close();

    }

    @Test
    public void regReg () {
        driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Salut");
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("skillbox@test.ru");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("qwerty!123");
        driver.findElement(By.xpath("//*[@class='form-submit']")).click();
        var actText = driver.findElement(By.xpath("//*[contains(text(),'Вам на почту')]")).getText();
        String expText = "Вам на почту skillbox@test.ru отправлено письмо";

        Assert.assertEquals("Текст не соответствует ожидаемому результату", expText, actText);
        System.out.println(actText);
    }

    @Test
    public void nullEnterTest() {
        driver.findElement(By.xpath("//*[@class='form-submit']")).click();
        String nullEnterTextError = driver.findElement(By.xpath("//*[contains(text(), 'Некорректный email или пароль')]")).getText();
        String expTextIncorrectEnter = "Некорректный email или пароль";

        Assert.assertEquals("Неверно введены данные", expTextIncorrectEnter, nullEnterTextError );
    }

    @Test
    public void testNameError() {
        driver.findElement(By.xpath("//*[@class='form-submit']")).click();
        String textNameError = driver.findElement(By.xpath("//*[contains(text(),'Введите имя')]")).getText();
        String expTextName = "Введите имя";

        Assert.assertEquals("Неверные денные имени", expTextName, textNameError);
    }

    @Test
    public void testEmailTextError() {
        driver.findElement(By.xpath("//*[@class='form-submit']")).click();
        String textEmailError = driver.findElement(By.xpath("//*[contains(text(), 'Введите email')]")).getText();
        String expTextEmailError = "Введите email";

        Assert.assertEquals("Неверный email", expTextEmailError, textEmailError);
    }

    @Test
    public void testPasswordError() {
        driver.findElement(By.xpath("//*[@class='form-submit']")).click();
        String textPasswordErr = driver.findElement(By.xpath("//*[contains(text(), 'Введите пароль')]")).getText();
        String expPassTextErr = "Введите пароль";

        Assert.assertEquals("Неверный пароль", expPassTextErr, textPasswordErr);
    }

    @Test
    public void testNegativeMail() {
        WebElement textErrorNegativeEmail = driver.findElement(By.xpath("//*[@name='email']"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@class='form-submit']"));
        String expErrorDown = "Некорректный email или пароль";
        textErrorNegativeEmail.sendKeys("dlyaemail");
        submitButton.click();
        String textErrorDown = driver.findElement(By.xpath("//*[contains(text(), 'Некорректный email или пароль')]")).getText();

        Assert.assertEquals("Совпадение ошибок при вводе невалидного email", expErrorDown, textErrorDown);
    }

    @Test
    public void testRandomSeven() {
        String mainPageText = driver.findElement(By.xpath("//*[@class='main-title']")).getText();
        String expMainText = "ОНЛАЙН - КИНОТЕАТР";

        Assert.assertEquals("Неверный текст заголовка сайта", mainPageText, expMainText);
    }
}