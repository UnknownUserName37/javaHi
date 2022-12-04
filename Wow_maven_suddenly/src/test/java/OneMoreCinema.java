import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneMoreCinema {

    public WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaban\\IdeaProjects\\Wow_maven_suddenly\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
    }

    @After
    public void tearsDown() {

        driver.quit();

    }


}
