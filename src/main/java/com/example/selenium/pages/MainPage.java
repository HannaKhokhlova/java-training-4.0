package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    // TODO define title and logout WebElements using @FindBy
    @FindBy(css = "h2")
    private WebElement title;

    @FindBy(css = ".icon-2x")
    private WebElement logout;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        // TODO return title text
        return title.getText();
    }

    public MainPage clickLogout() {
        // TODO click logout and return MainPage
        logout.click();
        return this;
    }
}
