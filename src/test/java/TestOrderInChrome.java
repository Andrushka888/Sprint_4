import org.example.AboutRentPageScooter;
import org.example.CheckoutPageScooter;
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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestOrderInChrome {

    private final By orderButton; // Переменная для пути к кнопкам "Заказать"
    private final String userFirstName; // = "Тест"
    private final String userSecondName; // = "Тест"
    private final String userAddress; // = "ул.Тест, д.1"
    private final String userMetro; // = "Черкизовская"
    private final String userPhone; //  = "88005553535"
    private final String userComment; // = "Тест";
    private final String expectedConfirmationText; // = "Заказ оформлен";

    public TestOrderInChrome(By orderButton, String userFirstName, String userSecondName, String userAddress, String userMetro, String userPhone, String userComment, String expectedConfirmationText) {
        this.orderButton = orderButton;
        this.userFirstName = userFirstName;
        this.userSecondName = userSecondName;
        this.userAddress = userAddress;
        this.userMetro = userMetro;
        this.userPhone = userPhone;
        this.userComment = userComment;
        this.expectedConfirmationText = expectedConfirmationText;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {By.className("Button_Button__ra12g"), "Тест", "Тест", "ул.Тест, д.1", "Черкизовская", "88005553535", "Тест", "Заказ оформлен"},
               {By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']"), "Тестдва", "Тестдва", "ул.Тест, д.2", "Черкизовская", "88005553535", "Тест_2", "Заказ оформлен"}
        };
    }


    private WebDriver driver;

    @Before
    public void preparatoryDataForTestOrder() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

    }

        @Test
        public void checkClickOrderAnyButtonAndFillOrderAndCheckSuccessfulOrderWindowInChrome() {

            MainPageScooter objMainPage = new MainPageScooter(driver);
            CheckoutPageScooter objCheckoutPage = new CheckoutPageScooter(driver);
            AboutRentPageScooter objAboutRentPage = new AboutRentPageScooter(driver);


            objMainPage.clickCookieButton();
            objMainPage.clickOrderButtonAnyone(orderButton);
            objCheckoutPage.fillFormOnFirstPage(userFirstName, userSecondName, userAddress, userMetro, userPhone);
            objCheckoutPage.clickNextButton();

            objAboutRentPage.fillFormOnSecondPage(userComment);

            String actualConfirmationText = objAboutRentPage.getOrderCompletedConfirmation();

            assertEquals("Должен вернуться текст подтверждения заказа", actualConfirmationText, expectedConfirmationText);

        }


   @After
        public void teardown() {
            // Закрыть браузер

           driver.quit();
       }
    }

//         public void checkClickOrderUpButtonAndFillOrderAndCheckSuccessfulOrderWindowInChrome() {
//
//            MainPageScooter objMainPage = new MainPageScooter(driver);
//            CheckoutPageScooter objCheckoutPage = new CheckoutPageScooter(driver);
//            AboutRentPageScooter objAboutRentPage = new AboutRentPageScooter(driver);
//
//
//            objMainPage.clickCookieButton();
//            objMainPage.clickOrderButtonTop();
//            objCheckoutPage.fillFormOnFirstPage(userFirstName, userSecondName, userAddress, userMetro, userPhone);
//            objCheckoutPage.clickNextButton();
//
//            objAboutRentPage.fillFormOnSecondPage(userComment);
//
//            String actualConfirmationText = objAboutRentPage.getOrderCompletedConfirmation();
//
//            assertEquals("Должен вернуться текст подтверждения заказа", actualConfirmationText, expectedConfirmationText);
//
//        }

//        public void checkClickOrderLowerButtonAndFillOrderAndCheckSuccessfulOrderWindowInChrome() {
//
//            MainPageScooter objMainPage = new MainPageScooter(driver);
//            CheckoutPageScooter objCheckoutPage = new CheckoutPageScooter(driver);
//            AboutRentPageScooter objAboutRentPage = new AboutRentPageScooter(driver);
//
//
//            objMainPage.clickCookieButton();
//            objMainPage.clickOrderButtonLower();
//            objCheckoutPage.fillFormOnFirstPage(userFirstName, userSecondName, userAddress, userMetro, userPhone);
//            objCheckoutPage.clickNextButton();
//
//            objAboutRentPage.fillFormOnSecondPage(userComment);
//
//            String actualConfirmationText = objAboutRentPage.getOrderCompletedConfirmation();
//
//            assertEquals("Должен вернуться текст подтверждения заказа", actualConfirmationText, expectedConfirmationText);
//
//        }