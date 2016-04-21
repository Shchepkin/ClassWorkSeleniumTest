package iyseyiytywrw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by InStaller on 19.04.2016.
 */
public class RegistrationPage {
    private WebDriver driver;
    private final By registerSignUpButton = By.id("signup_button");
    private final By loginField = By.id("user_login");
    private final By emailField = By.id("user_email");
    private final By passwordField = By.id("user_password");
    private final By registerError = By.cssSelector("div[class='flash flash-error my-3']");






    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterLogin(String login){
        driver.findElement(loginField).sendKeys(login);
    }

    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignUpButton(){
        driver.findElement(registerSignUpButton).click();
    }

    public String getErrorMessageText(){
        return driver.findElement(registerError).getText();
    }
}
