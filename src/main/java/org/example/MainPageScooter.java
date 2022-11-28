package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPageScooter {

    private WebDriver driver;

    // Локатор до вкладки "Сколько это стоит? И как оплатить?"
    private By aboutCost = By.id("accordion__heading-0");
    // Локатор до текста из вкладки "Сколько это стоит? И как оплатить?"
    private By answerAboutCost = By.xpath(".//div[@id = 'accordion__panel-0']/p");

    // +++++

    // Локатор до вкладки "Хочу сразу несколько самокатов! Так можно?"
    private By aboutSeveralScooters = By.id("accordion__heading-1");
    // Локатор до текста из вкладки "Хочу сразу несколько самокатов! Так можно?"
    private By answerAboutSeveralScooters = By.xpath(".//div[@id = 'accordion__panel-1']/p");

    // +++++

    // Локатор до вкладки "Как рассчитывается время аренды?"
    private By aboutRentalTime = By.id("accordion__heading-2");
    // Локатор до текста из вкладки "Как рассчитывается время аренды?"
    private By answerAboutRentalTime = By.xpath(".//div[@id = 'accordion__panel-2']/p");

    // +++++

    // Локатор до вкладки "Можно ли заказать самокат прямо на сегодня?"
    private By aboutTodayOrder = By.id("accordion__heading-3");
    // Локатор до текста из вкладки "Хочу сразу несколько самокатов! Так можно?"
    private By answerAboutTodayOrder = By.xpath(".//div[@id = 'accordion__panel-3']/p");

    // +++++

    // Локатор до вкладки "Можно ли продлить заказ или вернуть самокат раньше?"
    private By aboutReturn = By.id("accordion__heading-4");
    // Локатор до текста из вкладки "Можно ли продлить заказ или вернуть самокат раньше?"
    private By answerAboutReturn = By.xpath(".//div[@id = 'accordion__panel-4']/p");

    // +++++

    // Локатор до вкладки "Вы привозите зарядку вместе с самокатом?"
    private By aboutCharging = By.id("accordion__heading-5");
    // Локатор до текста из вкладки "Вы привозите зарядку вместе с самокатом?"
    private By answerAboutCharging = By.xpath(".//div[@id = 'accordion__panel-5']/p");

    // +++++

    // Локатор до вкладки "Можно ли отменить заказ?"
    private By aboutCancel = By.id("accordion__heading-6");
    // Локатор до текста из вкладки "Можно ли отменить заказ?"
    private By answerAboutCancel = By.xpath(".//div[@id = 'accordion__panel-6']/p");

    // +++++

    // Локатор до вкладки "Я живу за МКАДом, привезёте?"
    private By aboutCad = By.id("accordion__heading-7");
    // Локатор до текста из вкладки "Можно ли отменить заказ?"
    private By answerAboutCad = By.xpath(".//div[@id = 'accordion__panel-7']/p");



    // Локатор до кнопки подтверждения куки
    private By cookieButton = By.className("App_CookieButton__3cvqF");
    // Локатор до верхней кнопки "Заказать"
    // private By orderButtonTop = By.className("Button_Button__ra12g");
    // Локатор до нижней кнопки "Заказать"
    //  private By orderButtonLower = By.className("Button_Button__ra12g Button_UltraBig__UU3Lp");



    public MainPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    // ============Методы для теста в разделе «Вопросы о важном»===============

    // Метод для нажатия на кнопку подтверждения кук
    public void clickCookieButton() {

        driver.findElement(cookieButton).click();
    }

//--------

    // Метод для нажатия на вкладку "Сколько это стоит? И как оплатить?"
    public void clickAboutCostButton() {

        driver.findElement(aboutCost).click();
    }

    // Метод для получения текста после открытия вкладки "Сколько это стоит? И как оплатить?"
    public String getTextAnswerAboutCost() {

        return driver.findElement(answerAboutCost).getText();

    }

//--------

    // Метод для нажатия на вкладку "Хочу сразу несколько самокатов! Так можно?"
    public void clickAboutSeveralScootersButton() {

        driver.findElement(aboutSeveralScooters).click();
    }

    // Метод для получения текста после открытия вкладки "Хочу сразу несколько самокатов! Так можно?"
    public String getTextAnswerAboutSeveralScooters() {

        return driver.findElement(answerAboutSeveralScooters).getText();

    }


//-------

    // Метод для нажатия на вкладку "Как рассчитывается время аренды?"
    public void clickAboutRentalTimeButton() {
        driver.findElement(aboutRentalTime).click();
    }

    // Метод для получения текста после открытия вкладки "Как рассчитывается время аренды?"
    public String getTextAnswerAboutRentalTime() {
        return driver.findElement(answerAboutRentalTime).getText();
    }

//-------

    // Метод для нажатия на вкладку "Можно ли заказать самокат прямо на сегодня?"
    public void clickAboutTodayOrderButton() {
        driver.findElement(aboutTodayOrder).click();
    }

    // Метод для получения текста после открытия вкладки "Можно ли заказать самокат прямо на сегодня?"
    public String getTextAnswerAboutTodayOrder() {
        return driver.findElement(answerAboutTodayOrder).getText();
    }

//--------

    // Метод для нажатия на вкладку "Можно ли продлить заказ или вернуть самокат раньше?"
    public void clickAboutReturnButton() {
        driver.findElement(aboutReturn).click();
    }

    // Метод для получения текста после открытия вкладки "Можно ли продлить заказ или вернуть самокат раньше?"
    public String getTextAnswerAboutReturn() {
        return driver.findElement(answerAboutReturn).getText();
    }

//--------

    // Метод для нажатия на вкладку "Вы привозите зарядку вместе с самокатом?"
    public void clickAboutChargingButton() {
        driver.findElement(aboutCharging).click();
    }

    // Метод для получения текста после открытия вкладки "Вы привозите зарядку вместе с самокатом?"
    public String getTextAnswerAboutCharging() {
        return driver.findElement(answerAboutCharging).getText();
    }

//--------

    // Метод для нажатия на вкладку "Можно ли отменить заказ?"
    public void clickAboutCancelButton() {
        driver.findElement(aboutCancel).click();
    }

    // Метод для получения текста после открытия вкладки "Можно ли отменить заказ?"
    public String getTextAnswerAboutCancel() {
        return driver.findElement(answerAboutCancel).getText();
    }

//--------

    // Метод для нажатия на вкладку "Я живу за МКАДом, привезёте?"
    public void clickAboutCadButton() {
        driver.findElement(aboutCad).click();
    }

    // Метод для получения текста после открытия вкладки "Я живу за МКАДом, привезёте?"
    public String getTextAnswerAboutCad() {
        return driver.findElement(answerAboutCad).getText();
    }

    // ============ Методы для теста в разделе «Вопросы о важном» ===============


    // ============ Методы для теста оформления заказа ===============

    // Метод для нажатия на любую из двух кнопок "Заказать"
    public void clickOrderButtonAnyone(By orderButton) {

        driver.findElement(orderButton).click();
    }

}





// Возможные методы на будуще:
//
// Метод для нажатия на верхнюю кнопку "Заказать"
//    public void clickOrderButtonTop() {
//
//        driver.findElement(orderButtonTop).click();
//    }
//
//    // Метод для нажатия на нижнюю кнопку "Заказать"
//    public void clickOrderButtonLower() {
//        driver.findElement(orderButtonLower).click();
//    }
//}
