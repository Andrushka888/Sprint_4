import org.example.MainPageScooter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class TestDropdownListInChrome {

    private WebDriver driver;

    @Before

    public void preparatoryDataForDropdownList() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

    }

    @Test
    public void checkOpeningTabAboutCostAndTextWithinInChrome() {

        MainPageScooter objMainPage = new MainPageScooter(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;


        objMainPage.clickCookieButton();
        objMainPage.clickAboutCostButton();
        jse.executeScript("window.scrollBy(0,250)", "");

        String actualText = objMainPage.getTextAnswerAboutCost();
        String expectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

        assertEquals("Текст должен быть одинаковый", expectedText, actualText);

    }


    @Test
    public void checkOpeningTabAboutSeveralScootersAndTextWithinInChrome() {

        MainPageScooter objMainPage = new MainPageScooter(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;


        objMainPage.clickCookieButton();
        objMainPage.clickAboutSeveralScootersButton();
        jse.executeScript("window.scrollBy(0,250)", "");

        String actualText = objMainPage.getTextAnswerAboutSeveralScooters();
        String expectedText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

        assertEquals("Текст должен быть одинаковый", expectedText, actualText);

    }

    @Test
    public void checkOpeningTabAboutRentalTimeAndTextWithinInChrome() {

        MainPageScooter objMainPage = new MainPageScooter(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;


        objMainPage.clickCookieButton();
        objMainPage.clickAboutRentalTimeButton();
        jse.executeScript("window.scrollBy(0,250)", "");

        String actualText = objMainPage.getTextAnswerAboutRentalTime();
        String expectedText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

        assertEquals("Текст должен быть одинаковый", expectedText, actualText);

    }

    @Test
    public void checkOpeningTabAboutTodayOrderAndTextWithinInChrome() {

        MainPageScooter objMainPage = new MainPageScooter(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;


        objMainPage.clickCookieButton();
        objMainPage.clickAboutTodayOrderButton();
        jse.executeScript("window.scrollBy(0,250)", "");

        String actualText = objMainPage.getTextAnswerAboutTodayOrder();
        String expectedText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

        assertEquals("Текст должен быть одинаковый", expectedText, actualText);
    }

    @Test
    public void checkOpeningTabAboutReturnAndTextWithinInChrome() {

        MainPageScooter objMainPage = new MainPageScooter(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;


        objMainPage.clickCookieButton();
        objMainPage.clickAboutReturnButton();
        jse.executeScript("window.scrollBy(0,250)", "");

        String actualText = objMainPage.getTextAnswerAboutReturn();
        String expectedText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

        assertEquals("Текст должен быть одинаковый", expectedText, actualText);
    }

    @Test
    public void checkOpeningTabAboutChargingAndTextWithinInChrome() {

        MainPageScooter objMainPage = new MainPageScooter(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;


        objMainPage.clickCookieButton();
        objMainPage.clickAboutChargingButton();
        jse.executeScript("window.scrollBy(0,250)", "");

        String actualText = objMainPage.getTextAnswerAboutCharging();
        String expectedText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

        assertEquals("Текст должен быть одинаковый", expectedText, actualText);
    }

    @Test
    public void checkOpeningTabAboutCancelAndTextWithinInChrome() {

        MainPageScooter objMainPage = new MainPageScooter(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;


        objMainPage.clickCookieButton();
        objMainPage.clickAboutCancelButton();
        jse.executeScript("window.scrollBy(0,250)", "");

        String actualText = objMainPage.getTextAnswerAboutCancel();
        String expectedText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

        assertEquals("Текст должен быть одинаковый", expectedText, actualText);
    }

    @Test
    public void checkOpeningTabAboutCadAndTextWithinInChrome() {

        MainPageScooter objMainPage = new MainPageScooter(driver);
        JavascriptExecutor jse = (JavascriptExecutor)driver;


        objMainPage.clickCookieButton();
        objMainPage.clickAboutCadButton();
        jse.executeScript("window.scrollBy(0,250)", "");

        String actualText = objMainPage.getTextAnswerAboutCad();
        String expectedText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

        assertEquals("Текст должен быть одинаковый", expectedText, actualText);
    }


    @After
    public void teardown() {
        // Закрой браузер

        driver.quit();
    }

}
