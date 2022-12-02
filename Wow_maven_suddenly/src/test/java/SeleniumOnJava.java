import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumOnJava {

//    Test_ click  button:"Ввод".Write name "Пашок, пыхнем водник?"


    @Test
    public void vs420em() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaban\\IdeaProjects\\Wow_maven_suddenly\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://lm.skillbox.ru/qa_tester/module01/");
        driver.findElement(By.name("name")).sendKeys("Пашок, пыхнем водник?");
        //driver.findElement(By.name("name")).sendKeys("");
        driver.findElement(By.className("button")).click();



        var getText = driver.findElement(By.className("start-screen__text")).getText();
        var expectedNameText = "Введите своё имя";
            if (getText == null) {
                System.out.println("Введите имя"); }

        Assert.assertEquals(getText, expectedNameText);

        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedJdemText = "Привет, Пашок, пыхнем водник?!";

        Assert.assertEquals(expectedJdemText, actualResult);
        driver.quit();
    }
}
//    @Test
//    public void refound240H() {
//        var enterVal = getRefundTicketPricePercent(140, false, false);
//        Assert.assertEquals("100", enterVal);
//    }
//
//    private Integer getRefundTicketPricePercent(Integer hoursBeforeConcert, Boolean wasConcertCancelled, Boolean wasConcertRescheduled)
//
//    {
//
//        if(wasConcertCancelled && wasConcertRescheduled) return 100;
//
//        if(hoursBeforeConcert>240) return 100;
//
//        if(hoursBeforeConcert>=144 && hoursBeforeConcert<=240) return 50;
//
//        if(hoursBeforeConcert>3 && hoursBeforeConcert<=144) return 30;
//
//        return 0;
//
//    }
//}
//
