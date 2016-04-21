package iyseyiytywrw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by InStaller on 19.04.2016.
 */
public class MainPage {
    private WebDriver driver;
    private final By registerButton = By.xpath("//div/a[.='Sign up']");
    private final String URL = "https://github.com";

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get(URL);
    }

    public void clickRegister(){
        driver.findElement(registerButton).click();
    }
}
