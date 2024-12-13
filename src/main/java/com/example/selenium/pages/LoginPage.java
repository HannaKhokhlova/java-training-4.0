package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    // TODO define username, password, and login WebElements using @FindBy
    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = ".fa")
    private WebElement login;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUsername(String text) {
        // TODO set username
        username.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        // TODO set password
        password.sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        // TODO click login return instance of MainPage
        login.click();
        return new MainPage(driver);
    }
}
