package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckoutPageScooter {

    private WebDriver driver;
    // Локатор до поля "Имя"
    private By firstName = (By.cssSelector("input[placeholder='* Имя']"));
    // Локатор до поля "Фамилия"
    private By secondName = (By.cssSelector("input[placeholder='* Фамилия']"));
    // Локатор до поля "Адрес: куда привезти заказ"
    private By address = (By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']"));
    // Локатор до поля "Станция метро"
    private By metroStation = (By.cssSelector("input[placeholder='* Станция метро']"));
    // Локатор до поля "Телефон: на него позвонит курьер"
    private By phone = (By.cssSelector("input[placeholder='* Телефон: на него позвонит курьер']"));
    // Локатор для кнопки "Далее"
    private By nextButton = By.className("Button_Middle__1CSJM");

    public CheckoutPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    // Метод для ввода текста в поле "Имя"
    public void setFirstName(String userFirstName) {
        driver.findElement(firstName).sendKeys(userFirstName);
    }

    // Метод для ввода текста в поле "Фамилия"
    public void setSecondName(String userSecondName) {
        driver.findElement(secondName).sendKeys(userSecondName);
    }

    // Метод для ввода текста в поле "Адрес: куда привезти заказ"
    public void setAddress(String userAddress) {
        driver.findElement(address).sendKeys(userAddress);
    }

// Публичный метод для подставки текста в поле "Станция метро"
    public void selectMetro(String userMetro) {
        driver.findElement(metroStation).sendKeys(userMetro);
        selectMetroFromOptions(userMetro);
    }
    // Приватный метод для того, чтоб выбрать метро из выпадающего списка и кликнуть по нему, чтоб оно подставилось в поле выше
    private void selectMetroFromOptions(String userMetro) {
        String metroOptionTemplate = ".//div[@class='select-search__select']//*[text()='%s']";
        By metro = By.xpath(String.format(metroOptionTemplate, userMetro));
        //найти элемент по этому селектору и кликнуть по нему
        driver.findElement(metro).click();
    }

    // Метод для ввода текста в поле "Телефон: на него позвонит курьер"
    public void setPhone(String userPhone) {
        driver.findElement(phone).sendKeys(userPhone);
    }
    // Метод для клика по кнопке "Далее" после ввода все полей выше
    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }


}


