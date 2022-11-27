import org.example.MainPageScooter;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class TestDropdownListInChrome {

    private WebDriver driver;

    @Test
    public void checkOpeningTabAboutСostAndTextWithinInChrome() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageScooter objMainPage = new MainPageScooter(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;


        objMainPage.clickCookieButton();
        objMainPage.clickAboutСostButton();
        jse.executeScript("window.scrollBy(0,250)", "");

        String actualText = objMainPage.getTextAnswerAboutСost();
        String expectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

        assertEquals("Текст должен быть одинаковый", expectedText, actualText);

    }


    @After
    public void teardown() {
        // Закрой браузер

        driver.quit();
    }

}
