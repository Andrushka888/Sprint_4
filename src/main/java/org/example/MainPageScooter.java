package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPageScooter {

    private WebDriver driver;

    // Локатор до вкладки "Сколько это стоит? И как оплатить?"
    private By aboutСost = By.id("accordion__heading-0");

    // Локатор до текста из вкладки "Сколько это стоит? И как оплатить?"
    private By answerAboutСost = By.xpath(".//div[@id = 'accordion__panel-0']/p");
    // Локатор до кнопки подтверждения куки
    private By cookieButton = By.className("App_CookieButton__3cvqF");
    // Локатор до верхней кнопки "Заказать"
    private By orderButtonTop = By.className("Button_Button__ra12g");
    // Локатор до нижней кнопки "Заказать"
    private By orderButtonLower = By.className("Button_Button__ra12g Button_UltraBig__UU3Lp"); // Тут возможно стоит убрать класс Button_Button__ra12g

    public MainPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    // ============Методы для теста в разделе «Вопросы о важном»===============

    // Метод для нажатия на вкладку "Сколько это стоит? И как оплатить?"
    public void clickAboutСostButton() {

        driver.findElement(aboutСost).click();
    }
    // Метод для нажатия на кнопку подтверждения кук
    public void clickCookieButton() {

        driver.findElement(cookieButton).click();
    }

    // Метод для получения текста после открытия вкладки
    public String getTextAnswerAboutСost() {

        return driver.findElement(answerAboutСost).getText();

    }

    // ============ Методы для теста в разделе «Вопросы о важном» ===============


    // ============ Методы для теста оформления заказа ===============

    // Метод для нажатия на верхнюю кнопку "Заказать"
    public void clickOrderButtonTop() {

        driver.findElement(orderButtonTop).click();
    }

    // Метод для нажатия на нижнюю кнопку "Заказать"
    public void clickOrderButtonLower() {

        driver.findElement(orderButtonLower).click();
    }
}



// Возможные локаторы на будуще:
//
// Локатор до вкладки "Хочу сразу несколько самокатов! Так можно?"
//private By aboutSeveralScooters = By.id("accordion__heading-1");
// Локатор до вкладки "Как рассчитывается время аренды?"
//private By aboutRentalTime = By.id("accordion__heading-2");
// Локатор до вкладки "Можно ли заказать самокат прямо на сегодня?"
//private By aboutTodayOrder = By.id("accordion__heading-3");
// Локатор до вкладки "Можно ли продлить заказ или вернуть самокат раньше?"
//private By AboutReturn = By.id("accordion__heading-4");
// Локатор до вкладки "Вы привозите зарядку вместе с самокатом?"
//private By AboutСharging = By.id("accordion__heading-5");
// Локатор до вкладки "Можно ли отменить заказ?"
//private By AboutСancel = By.id("accordion__heading-6");
// Локатор до вкладки "Я живу за МКАДом, привезёте?"
//private By AboutСad = By.id("accordion__heading-7");