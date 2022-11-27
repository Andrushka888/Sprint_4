import org.example.AboutRentPageScooter;
import org.example.CheckoutPageScooter;
import org.example.MainPageScooter;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class TestOrderInChrome {

    private WebDriver driver;

    @Test
    public void checkClickOrderUpButtonAndFillOrderAndCheckSuccessfulOrderWindowInChrome() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageScooter objMainPage = new MainPageScooter(driver);
        CheckoutPageScooter objCheckoutPage = new CheckoutPageScooter(driver);
        AboutRentPageScooter objAboutRentPage = new AboutRentPageScooter(driver);

        String userFirstName = "Тест";
        String userSecondName = "Тест";
        String userAddress = "ул.Тест, д.1";
        String userMetro = "Черкизовская";
        String userPhone = "88005553535";

        objMainPage.clickOrderButtonTop();
        objCheckoutPage.setFirstName(userFirstName);
        objCheckoutPage.setSecondName(userSecondName);
        objCheckoutPage.setAddress(userAddress);
        objCheckoutPage.selectMetro(userMetro);
        objCheckoutPage.setPhone(userPhone);
        objCheckoutPage.clickNextButton();

        String userComment = "Тест";

        objAboutRentPage.clickDeliveryDateButton();
        objAboutRentPage.clickDecemberFirstDateButton();
        objAboutRentPage.clickRentalPeriodField();
        objAboutRentPage.clickRentalPeriodFiveDays();
        objAboutRentPage.clickBlackPearlCheckbox();
        objAboutRentPage.setCommentForСourier(userComment);
        objAboutRentPage.clickOrderButton();
        objAboutRentPage.clickOrderYesButton();

        String actualConfirmationText = objAboutRentPage.getOrderCompletedConfirmation();
        String expectedConfirmationText = "Заказ оформлен";

        assertEquals("Должен вернуться текст подтверждения заказа", actualConfirmationText, expectedConfirmationText);

    }

      @After
    public void teardown() {
        // Закрыть браузер

        driver.quit();
    }
}
