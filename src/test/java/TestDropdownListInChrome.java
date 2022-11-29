import org.example.MainPageScooter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestDropdownListInChrome {
    private final By closedTab;
    private final By textFromTab;
    private final String expectedText;
    public TestDropdownListInChrome(By closedTab, By textFromTab, String expectedText) {
        this.closedTab = closedTab;
        this.textFromTab = textFromTab;
        this.expectedText = expectedText;
    }

    @Parameterized.Parameters
    public static Object[][] getTestDataDropdownList() {
        return new Object[][] {
                {By.id("accordion__heading-" + 0), By.xpath(".//div[@id = 'accordion__panel-" + 0 +"']/p"), "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {By.id("accordion__heading-" + 1), By.xpath(".//div[@id = 'accordion__panel-" + 1 +"']/p"), "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {By.id("accordion__heading-" + 2), By.xpath(".//div[@id = 'accordion__panel-" + 2 +"']/p"), "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {By.id("accordion__heading-" + 3), By.xpath(".//div[@id = 'accordion__panel-" + 3 +"']/p"), "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {By.id("accordion__heading-" + 4), By.xpath(".//div[@id = 'accordion__panel-" + 4 +"']/p"), "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {By.id("accordion__heading-" + 5), By.xpath(".//div[@id = 'accordion__panel-" + 5 +"']/p"), "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {By.id("accordion__heading-" + 6), By.xpath(".//div[@id = 'accordion__panel-" + 6 +"']/p"), "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {By.id("accordion__heading-" + 7), By.xpath(".//div[@id = 'accordion__panel-" + 7 +"']/p"), "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
    }
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
        objMainPage.clickAboutCostButton(closedTab);
        jse.executeScript("window.scrollBy(0,250)", "");
        String actualText = objMainPage.getTextAnswerAboutCost(textFromTab);
        assertEquals("Текст должен быть одинаковый", expectedText, actualText);
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
