package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutRentPageScooter {

    private WebDriver driver;
    // Локатор до поля "Когда привезти самокат"
    private By deliveryDate = (By.cssSelector("input[placeholder='* Когда привезти самокат']"));
    // Локатор до кнопки "1 декабря"
    private By decemberFirstDate = (By.cssSelector("div[aria-label='Choose четверг, 1-е декабря 2022 г.']")); // Знаю что так не очень, но ничего другого пока не придумал как нажать на дату
    // Локатор до поля "Срок аренды"
    private By rentalPeriod = By.className("Dropdown-placeholder");
    // Локатор до варианта "пятеро суток"
    private By rentalPeriodFiveDays = By.xpath(".//div[text()='пятеро суток']");
    // Локатор до чекбокса "чёрный жемчуг"
    private By blackPearlCheckbox = By.id("black");
    // Локатор до чекбокса "серая безысходность"
    private By greyPearlCheckbox = By.id("grey");
    //Локатор до поля "Комментарий для курьера"
    private By commentForСourier = (By.cssSelector("input[placeholder='Комментарий для курьера']"));
    //Локатор до кнопки "Заказать"
    private By orderButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    //Локатор до кнопки "Да" (Подтверждение заказа)
    private By orderYesButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");
    //Локатор до кнопки "Нет" (Отказ от заказа)
    private By orderNoButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Нет']");
    //Локатор до текста "Заказ оформлен"
    private By orderCompleted = By.xpath(".//div[text()='Заказ оформлен']");
    public AboutRentPageScooter(WebDriver driver) {
        this.driver = driver;
    }
    // Метод для нажатия на поле "Когда привезти самокат"
    public void clickDeliveryDateButton() {
        driver.findElement(deliveryDate).click();
    }
    // Метод для выбора 1 декабря 2022 в поле "Когда привезти самокат"
    public void clickDecemberFirstDateButton() {
        driver.findElement(decemberFirstDate).click();
    }
    // Метод для нажатия на поле "Срок аренды"
    public void clickRentalPeriodField() {
        driver.findElement(rentalPeriod).click();
    }
    // Метод для выбора "пятеро суток" в поле "Срок аренды"
    public void clickRentalPeriodFiveDays() {
        driver.findElement(rentalPeriodFiveDays).click();
    }
    // Метод для нажатия на чекбокс "чёрный жемчуг"
    public void clickBlackPearlCheckbox() {
        driver.findElement(blackPearlCheckbox).click();
    }
    // Метод для нажатия на чекбокс "серая безысходность"
    public void clickGreyPearlCheckbox() {
        driver.findElement(greyPearlCheckbox).click();
    }
    // Метод для ввода комментария в поле "Комментарий для курьера"
    public void setCommentForCourier(String userComment) {
        driver.findElement(commentForСourier).sendKeys(userComment);
    }
    // Метод для нажатия на кнопку "заказать" после ввода всех данных
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }
    // Метод для нажатия на кнопку "Да" при подтверждении заказа
    public void clickOrderYesButton() {
        driver.findElement(orderYesButton).click();
    }
    // Метод получения текста "Заказ подтвержден" после оформления заказа
    public String getOrderCompletedConfirmation() {
        return driver.findElement(orderCompleted).getText();
    }
    public void fillFormOnSecondPage(String userComment) {
        clickDeliveryDateButton();
        clickDecemberFirstDateButton();
        clickRentalPeriodField();
        clickRentalPeriodFiveDays();
        clickBlackPearlCheckbox();
        setCommentForCourier(userComment);
        clickOrderButton();
        clickOrderYesButton();
    }
}


