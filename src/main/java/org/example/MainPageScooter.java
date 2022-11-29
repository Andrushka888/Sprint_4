package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageScooter {
    private WebDriver driver;
    // Локатор до кнопки подтверждения куки
    private By cookieButton = By.className("App_CookieButton__3cvqF");
    public MainPageScooter(WebDriver driver) {
        this.driver = driver;
    }
    // Метод для нажатия на кнопку подтверждения кук
    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }
    // Метод для нажатия на вкладку "Сколько это стоит? И как оплатить?"
    public void clickAboutCostButton(By closedTab) {
        driver.findElement(closedTab).click();
    }
    // Метод для получения текста после открытия вкладки "Сколько это стоит? И как оплатить?"
    public String getTextAnswerAboutCost(By textFromTab) {
        return driver.findElement(textFromTab).getText();
    }
    // Метод для нажатия на любую из двух кнопок "Заказать"
    public void clickOrderButtonAnyone(By orderButton) {
        driver.findElement(orderButton).click();
    }
}


