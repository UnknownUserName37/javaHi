package test.pack;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AnotherOneClassHeee {

//    Test_ click  button:"Ввод".Write name "Пашок, пыхнем водник?"


    @Test
    public void vs420em() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaban\\IdeaProjects\\Wow_maven_suddenly\\Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        var gatTextVal = driver.findElement(By.name("email")).getText();
        var nullVal = "";
        Assert.assertEquals(nullVal, gatTextVal);

                driver.quit();
    }
}
//    @Test
//    public void testNullEnter() {
//
//
//    }
//}