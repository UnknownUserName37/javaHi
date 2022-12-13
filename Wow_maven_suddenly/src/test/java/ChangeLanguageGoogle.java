import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChangeLanguageGoogle { //создаём класс

    WebDriver driver; // создаём переменную драйвера

    @Before //делается перед тестом
    public void setUp() { // создание метода
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaban\\IdeaProjects\\Wow_maven_suddenly\\Drivers\\chromedriver.exe"); //где лежит драйвер SELENIUM гугл
        driver = new ChromeDriver(); //здесь драйвер приобретает функционал из import org.openqa.selenium.chrome.ChromeDriver;
        driver.navigate().to("https://www.google.com/"); //переходим на сайт и открытие браузера
    }

    @After // что происходит после теста
    public void tearsDown() { // создание метода
        driver.quit(); //закрываем браузер драйвером из Selenium
    }

    @Test //наш тест на проверку переключения на английский язык
    public void openGoogleChangeLanguageEng() { //создаём метод
        var engLinkText = driver.findElement(By.xpath("//*[contains(text(), 'English')]")); //находим кнопку перекдлючения на английский
        engLinkText.click(); //тыкаем по ней
        var engAssertText = driver.findElement(By.xpath("//div[@id = 'SIvCob' and contains(text(), 'Google')]")); //находим текст для сравнения английского языка
        var expectedEng = "Google offered in: ქართული"; // текст который сравниваем с сайтом.Написан руками.

        Assert.assertEquals("Ошибка сравнения англияского языка", expectedEng, engAssertText.getText()); //проверка найденного и написанного нами языка на совпадение
    }

    @Test //наш тест на проверку переключения на грузинский язык
    public void openGoogleChangeLanguageGeo() { //создаём метод
        var geoLinkText = driver.findElement(By.xpath("//*[contains(text(), 'ქართული')]")); //находим нужный элемент для переключения на грузинский
        geoLinkText.click(); //тыкаем
        var asserText = driver.findElement(By.xpath("//div[@id = 'SIvCob' and contains(text(), 'Google')]")); // текст для сравнения с сайта на грузинском
        var expectedGeo = "Google ხელმისაწვდომია შემდეგ ენაზე: English"; // текст который сравниваем с сайтом.Написан руками.

        Assert.assertEquals("Ошибка сравнения грузинского языка",expectedGeo,asserText.getText()); // сравниваем текст на наличие грузинского
    }

}
